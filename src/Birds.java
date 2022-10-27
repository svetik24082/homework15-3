import java.util.Objects;

public  class Birds extends Animals {
    private String livingEnvironment;  // ср.обитания

    public Birds(String name, int age, String livingEnvironment) {
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
                " среда обитания =" + livingEnvironment;
    }

    public void hunt() {
        System.out.println(" Я умею охотиться ");
    }

    public void eat() {
        System.out.println(" Буду кушать");
    }

    public void go() {
        System.out.println(" Перемещаюсь по воздуху и земле");


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
