import java.util.Objects;

public class Herbivores extends Mammals{
    private  final  String  typeOfFood;    // тип пищи

    public Herbivores(String name, int age,
                      String livingEnvironment, float speedOfMovement,
                      String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMovement);
        this.typeOfFood = validOrDefault(typeOfFood, " Трава ");

    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return "Имя = " + getName() +
                ", возраст = " + getAge() + " , Среда обитания =" + getLivingEnvironment() +
                ", скорость перемещения =" + getSpeedOfMovement() +
                "  ,  тип пищи = " + typeOfFood  ;
    }

    public void graze (){
        System.out.println( " Я пасусь на лугу ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
