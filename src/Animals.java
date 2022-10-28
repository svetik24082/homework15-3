import java.util.Objects;

public abstract class Animals {
    private final String name;
    private final int age;

    public Animals(String name, int age) {
        this.name = validOrDefault(name, "Информация не указана");
        this.age = age > 0 ? age : 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "Имя = " + name +
                        ", возраст =" + age;
    }

    public String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public void eat() {
        System.out.println(" Голос ");
    }

    public void sleep() {
        System.out.println(" Ложусь спать");

    }

    public void go() {
        System.out.println(" Иду гулять ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
