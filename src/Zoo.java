public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int currentAnimalCount = 0;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }


    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < currentAnimalCount; i++) {
            if (animals[i].name.equals(animal.name) && animals[i].family.equals(animal.family)) {
                System.out.println("L'animal " + animal.name + " existe déjà dans le zoo.");
                return false;
            }
        }

        if (currentAnimalCount >= nbrCages) {
            System.out.println("Le zoo est plein. Impossible d'ajouter " + animal.name + ".");
            return false; // Le zoo est plein
        }

        animals[currentAnimalCount] = animal;
        currentAnimalCount++;
        return true;
    }
    public  boolean isZooFull() {
        return currentAnimalCount >= nbrCages;
    }


    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < currentAnimalCount; i++) {
            if (animals[i].name.equals(animal.name) && animals[i].family.equals(animal.family)) {
                animals[i] = null;

                for (int j = i; j < currentAnimalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[currentAnimalCount - 1] = null;
                currentAnimalCount--;
                System.out.println("L'animal " + animal.name + " a été supprimé avec succès.");
                return true;
            }
        }
        System.out.println("L'animal " + animal.name + " n'a pas été trouvé dans le zoo.");
        return false;
    }


    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < currentAnimalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(String animalName) {
        for (int i = 0; i < currentAnimalCount; i++) {
            if (animals[i].name.equals(animalName)) {
                return i;
            }
        }
        return -1;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.currentAnimalCount > z2.currentAnimalCount) {
            return z1;
        } else if (z1.currentAnimalCount < z2.currentAnimalCount) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }


    @Override
    public String toString() {
        return "Zoo [Name=" + name + ", City=" + city + ", Number of Cages=" + nbrCages + "]";
    }
}
