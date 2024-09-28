import java.util.Scanner;

public class ZooManagement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez le nom du premier zoo: ");
        String zooName1 = scanner.nextLine();
        Zoo zoo1 = new Zoo(zooName1, "Metropolis");


        zoo1.addAnimal(new Animal("Felidae", "Lion", 5, true));
        zoo1.addAnimal(new Animal("Felidae", "Tiger", 4, true));


        System.out.print("Entrez le nom du deuxième zoo: ");
        String zooName2 = scanner.nextLine();
        Zoo zoo2 = new Zoo(zooName2, "Gotham");


        zoo2.addAnimal(new Animal("Elephantidae", "Elephant", 10, true));
        zoo2.addAnimal(new Animal("Canidae", "Wolf", 3, true));
        zoo2.addAnimal(new Animal("Felidae", "Tiger", 4, true));


        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);
        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.name);
        }
    }
}
