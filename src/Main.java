import com.company.Cat;
import com.company.Dog;
import com.company.Fish;
import com.company.Parott;

public class Main {
    public static void main(String[] args) {
        System.out.println("DOG");
        Dog dog = new Dog();
        dog.setName("Хаски");
        dog.setAge(4);
        dog.setLive("at home");
        dog.setColor("white");
        System.out.println("name: " + dog.getName());
        System.out.println("age: " + dog.getAge());
        System.out.println("live: " + dog.getLive());
        System.out.println("color: " + dog.getColor());
        dog.behavior();
        dog.behavior1();
        dog.behavior2 ();


        System.out.println();


        System.out.println("PARROT");
        Parott parrot = new Parott();
        parrot.setName("Оли");
        parrot.setAge (2);
        parrot.setLive("at home, tropical region - дома, тропические регионы");
        parrot.setColor("colorful - разноцветный");
        parrot.setFeatures("речь, ум");
        System.out.println("name: " + parrot.getName());
        System.out.println("age: " + parrot.getAge());
        System.out.println("live: " + parrot.getLive());
        System.out.println("color: " +  parrot.getColor());
        System.out.println("features: " + parrot.getFeatures());
        parrot.behavior();
        parrot.behavior1();
        parrot.behavior2();


        System.out.println();


        System.out.println("CAT");
        Cat cat = new Cat();
        cat.setName("Пупсик");
        cat.setAge(4);
        cat.setLive("at home");
        cat.setColor("white");

        System.out.println("name: " + cat.getName());
        System.out.println("age: " + cat.getAge());
        System.out.println("live: " + cat.getLive());
        System.out.println("color: " + cat.getColor());
        cat.behavior();
        cat.behavior1();
        cat.behavior2();

        System.out.println();

        System.out.println("FISH");
        Fish fish = new Fish();
        fish.setName("Немо");
        fish.setAge(3);
        fish.setLive("ocean");
        fish.setFeatures("милые");
        System.out.println("name: " + fish.getName());
        System.out.println("age: " + fish.getAge());
        System.out.println("live: " + fish.getLive());
        System.out.println("features: " + fish.getFeatures());
        fish.behavior();
        fish.behavior1 ();





















    }
}