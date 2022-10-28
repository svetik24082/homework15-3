import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;   //среда прож

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = validOrDefault(livingEnvironment, " Информация не указана");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validOrDefault(livingEnvironment, " Информация не указана");
    }

    @Override
    public String toString() {
        return "Имя = " + getName() +
                ", возраст =" + getAge() +
                " среда проживания = " + livingEnvironment;
    }

    public void hunt() {
        System.out.println(" Я умею охотиться ");
    }

    public void eat() {
        System.out.println(" хочу есть");
    }

    public void go() {
        System.out.println(" Перемещаюсь по суше и воде");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
