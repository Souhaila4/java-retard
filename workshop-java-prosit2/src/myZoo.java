import java.util.Scanner;
class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }


    public void displayAnimal() {
        System.out.println("Family: " + family);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is mammal: " + isMammal);
    }
}


class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages, int maxAnimals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[maxAnimals];
    }


    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        } else {
            System.out.println("Index is out of bounds!");
        }
    }


    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }
}


public class myZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the family of the animal: ");
        String family = scanner.nextLine();

        System.out.print("Enter the name of the animal: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age of the animal: ");
        int age = scanner.nextInt();

        System.out.print("Is the animal a mammal? (true/false): ");
        boolean isMammal = scanner.nextBoolean();


        Animal lion = new Animal(family, name, age, isMammal);


        scanner.nextLine();

        System.out.print("Enter the name of the zoo: ");
        String zooName = scanner.nextLine();

        System.out.print("Enter the city of the zoo: ");
        String zooCity = scanner.nextLine();

        System.out.print("Enter the number of cages: ");
        int nbrCages = scanner.nextInt();


        Zoo myZoo = new Zoo(zooName, zooCity, nbrCages, 25);


        myZoo.addAnimal(lion, 0);


        System.out.println("\nAnimal Information:");
        lion.displayAnimal();


        System.out.println("\nZoo Information:");
        myZoo.displayZoo();


    }
}