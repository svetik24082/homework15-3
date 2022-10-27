import java.util.Objects;

public class Mammals extends Animals{
    private String livingEnvironment;   // ср обит
    private float speedOfMovement ;   // скор перем

    public Mammals(String name, int age, String livingEnvironment, float speedOfMovement) {
        super(name, age);
        this.livingEnvironment = validOrDefault(livingEnvironment, " Информация не указана");
        this.speedOfMovement = speedOfMovement >0 ? speedOfMovement:30;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validOrDefault(livingEnvironment, " Информация не указана");
    }

    public float getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(float speedOfMovement) {
        this.speedOfMovement = speedOfMovement >0 ? speedOfMovement:30;
    }

    @Override
    public String toString() {
        return " Среда обитания ='" + livingEnvironment +
                ", скорость перемещения =" + speedOfMovement ;
    }

    public void walk (){
        System.out.println( " Гуляю ");

    }
    public void eat() {
        System.out.println( " хочу кушать");
    }
    public void go() {
        System.out.println(" Перемещаюсь по местности");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return Float.compare(mammals.speedOfMovement, speedOfMovement) == 0
                && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment, speedOfMovement);
    }
}
