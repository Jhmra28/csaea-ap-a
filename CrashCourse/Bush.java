public class Bush {

    private boolean isFruit;
    private boolean isProducing;
    private int fruitPerSeason;
    private int season = 1;
    private String seasonName = "Summer";
    private String bushType;
    private double fruitCost;
    private int age = 0;

    public Bush(String bushType, boolean isFruit, boolean isProducing, double fruitCost, int fruitPerSeason)
    {
        this.bushType = bushType;
        this.isFruit = isFruit;
        this.isProducing = isProducing;
        this.fruitCost = fruitCost;
        this.fruitPerSeason = fruitPerSeason;

        System.out.println("bush type: " + this.bushType + "\nIs a fruit bush: " + this.isFruit + "\nCurrently producing fruit: " + this.isProducing);
    }

    // Behaviors that only print -- they change nothing
    public void catalogPrice()
    {
        System.out.println("The total price of fruits per season by this bush is " + (fruitPerSeason*fruitCost) + " dollars." );
    }

    public void printBushInfo()
    {
        System.out.println("Bush type: " + this.bushType
                + "\nIs a fruit bush: " + this.isFruit
                + "\nCurrently producing fruit: " + this.isProducing
                + "\nFruit per season: " + this.fruitPerSeason
                + "\nFruit cost: " + this.fruitCost
                + "\nSeason: " + this.season
                + "\nAge: " + this.age);
    }

    public int setFruitPerSeason(int fruit)
    {
        this.fruitPerSeason = fruit;
        return fruit;
    }

    public double setFruitCost(double cost)
    {
        this.fruitCost = cost;
        return cost;
    }

    public void getOlder() {
        age++;
        System.out.println("age: " + age);
        if (age > 10) {
            isProducing = false; 
            System.out.println("This bush no longer produces fruit.");
        }
        else {
            System.out.println("This bush still produces fruit.");
        }
    }

    public void checkProduction(int requiredFruit) {
        if (isFruit && isProducing && (fruitPerSeason >= requiredFruit)) {
            System.out.println("This bush produces more fruit than the requirement.");
        }
        else {
            System.out.println("This bush produces less fruit than the requirement.");
        }
    }

    public void nextSeason() {
        season++;
        if (season == 5) {
            season = 1;
        }

        if (season == 1) {
            seasonName = "Summer";
        }

        if (season == 2) {
            seasonName = "Fall";
        }

        if (season == 3) {
            seasonName = "Winter";
        }

        if (season == 4) {
            seasonName = "Spring";
        }

        System.out.println("It is now " + seasonName + " of year " + age);

        if (isFruit && isProducing) {
            System.out.println("This bush is producing fruit in " + seasonName);
        }
        else {
             System.out.println("This bush is not producing fruit in " + seasonName);
        }
    }

}


