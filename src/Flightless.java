import java.util.Objects;

public class Flightless extends Birds {
    private final String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment,
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
                " , тип передвижения = " + typeOfMovement;
    }

    public void walk() {
        System.out.println(" Гуляю ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}

