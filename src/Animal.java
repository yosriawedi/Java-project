public class Animal {
    String family;
    String name ;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void display() {
        String mammalStatus = isMammal ? "Oui" : "Non";
        System.out.println("Nom: " + name + ", Famille: " + family + ", Âge: " + age + ", Mammifère: " + mammalStatus);
    }

}

