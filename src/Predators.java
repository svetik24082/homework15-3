import java.util.Objects;

public class Predators extends Mammals {
    private final String typeOfFood;  //тип пищи

    public Predators(String name, int age, String livingEnvironment,
                     float speedOfMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMovement);
        this.typeOfFood = validOrDefault(typeOfFood, " Мясо ");

    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return "Имя = " + getName() +
                ", возраст =" + getAge() + ", Среда обитания = " + getLivingEnvironment() +
                ", скорость перемещения =" + getSpeedOfMovement() +
                " , тип пищи = " + typeOfFood;
    }

    public void hunt() {
        System.out.println(" Я умею охотиться ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
