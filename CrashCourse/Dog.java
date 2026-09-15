public class Dog {
    
    //varaibles
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energylevel;

    // constrcutor

    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        int age = 0;
        double weight = 15;
        int energyLevel = 100;

    }

    public void eat() {
        energyLevel += 25;
        if(energyLevel > 100){
            energyLevel = 100;
        }

    public void bark() {
        System.out.println("Woof!");
    }

    public void scratch() {
        System.out.println("i made a mess! clean up after me")
    }

    public void bite() {
        System.out.println("i just bit you oooooo ahah prolly all  scratched up now huh")
    }

}
