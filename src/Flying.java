import java.util.Objects;

public class Flying extends Birds {
    private final String typeOfMovement;  // тип передвиж


    public Flying(String name, int age, String livingEnvironment,
                  String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = validOrDefault(typeOfMovement, " Информация не указана");

    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public String toString() {
        return "Имя = " + getName() +
                ", возраст =" + getAge() +
                " , среда обитания =" + getLivingEnvironment() +
                ", тип передвижения = " + typeOfMovement;
    }

    public void toFly() {
        System.out.println(" я умею летать");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
