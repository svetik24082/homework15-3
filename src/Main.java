import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Herbivores herbivores = new Herbivores( " Газель", 2,
                "полупустыня",
        60f, " растения");
        Herbivores herbivores1 = new Herbivores( " Жираф" , 5,
                " тропические степи", 30f,
                " Листья с верхушек деревьев");
        Herbivores herbivores2 = new Herbivores( "Лошадь", 10,
                " Степь", 55F, " трава");
        System.out.println(herbivores);
        System.out.println(herbivores1);
        System.out.println(herbivores2);
        herbivores.graze();
        herbivores.walk();
        herbivores.eat();
        herbivores.sleep();
        herbivores.go();
        System.out.println( herbivores instanceof Mammals);
        System.out.println(herbivores==herbivores1);
        System.out.println(herbivores1==herbivores2);
        System.out.println(herbivores2==herbivores);

        System.out.println();

        Predators predators = new Predators( " Гиена ", 3,
                " Африка и юго-западная Азия", 30f,
                " мясо добытое охотой или падаль");
        Predators predators1 = new Predators( " Тигр ", 4,
                " лесная местность", 40f, " мясо добытое охотой");
        Predators predators2 = new Predators( " Медведь",15,
                "Ареал проживания животного широк ", 60f," ягоды, коренья, рыба, мясо");
        System.out.println( predators);
        System.out.println( predators1);
        System.out.println( predators2);
        predators.hunt();
        predators.walk();
        predators.eat();
        predators.sleep();
        predators.go();
        System.out.println( predators instanceof Mammals);
        System.out.println();

        Amphibians amphibians = new Amphibians( " Лягушка пресноводная", 1,
                " Пресноводные водоемы и суша");
        Amphibians amphibians1 = new Amphibians( " Уж пресноводный", 2,
                "вблизи водоемов");
        System.out.println(amphibians);
        System.out.println(amphibians1);
        amphibians.hunt();
        amphibians.go();
        amphibians.eat();
        amphibians.sleep();
        System.out.println( amphibians instanceof Animals);


        Flightless flightless = new Flightless( " Павлин", 3,
                " Южная Азия", " пешком");
        Flightless flightless1 = new Flightless( " Пингвин", 1,
                " Антарктика", " пешком");
        Flightless flightless2 = new Flightless( " Птица До-До", 2,
                " леса острова Маврикий", " пешком");
        System.out.println(flightless);
        System.out.println(flightless1);
        System.out.println(flightless2);
        flightless.walk();
        flightless.go();
        flightless.eat();
        flightless.sleep();
        System.out.println( flightless instanceof Birds);
        System.out.println();

        Flying flying = new Flying( " Чайка", 1," обширен"," летает");
        Flying flying1 = new Flying( " Альбатрос", 2, "воды Антарктиды", " летает");
        Flying flying2 = new Flying( " Сокол ", 1, " пустыня, тундра, тайга", " летает");
        System.out.println(flying);
        System.out.println(flying1);
        System.out.println(flying2);
        flying.toFly();
        flying.go();
        flying.eat();
        flying.sleep();
        System.out.println( flying instanceof Birds);





    }
}