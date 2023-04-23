enum AnimalType {
    MAMMAL,
    BIRD,
    REPTILE,
    AMPHIBIAN,
    FISH
}

abstract class Animal {
    private String name;
    private int age;
    private AnimalType type;
    private String habitat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("ვუუფფ!");
    }
}

class Parrot extends Animal implements Pet, Bird {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void playWith() {
        System.out.println("თუთიყუში თამაშობს თავისი სათამაშოებით.");
    }

    @Override
    public void fly() {
        System.out.println("თუთიყუში დაფრინავს ოთახის გარშემო.");
    }
}

interface Pet {
    void playWith();
}

interface Bird {
    void fly();
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("რექსი");
        dog.setAge(3);
        dog.setType(AnimalType.MAMMAL);
        dog.setHabitat("House");
        dog.setBreed("კავკასიური ნაგაზი");
        System.out.println(dog.getName() + " არის " + dog.getBreed() + " ამბობს:");
        dog.bark();

        Parrot parrot = new Parrot();
        parrot.setName("მაქსი");
        parrot.setAge(5);
        parrot.setType(AnimalType.BIRD);
        parrot.setHabitat("Cage");
        parrot.setColor("მწვანე");
        System.out.println(parrot.getName() + " არის " + parrot.getColor() + " თუთიყუში და შეუძლია:");
        parrot.playWith();
        parrot.fly();
    }
}
