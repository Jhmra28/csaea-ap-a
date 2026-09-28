public class BushTester {

    public static void main(String[] args) {

        Bush bush1 = new Bush("Blueberry", true, true, 2.50, 20);
        Bush bush2 = new Bush("Rose", false, false, 0.0, 0);

        // information before changing things
        bush1.printBushInfo();
        bush1.catalogPrice();

        //changing variables
        bush1.setFruitPerSeason(30);
        bush1.setFruitCost(3.00);

        // testing methods
        bush1.checkProduction(25);
        bush1.getOlder();
        bush1.nextSeason();

        // test after changes
        bush1.printBushInfo();

        // test methods on bush2
        bush2.printBushInfo();
        bush2.catalogPrice();
        bush2.checkProduction(10);
        bush2.getOlder();

        // change season 
        bush2.nextSeason();

        // final info
        bush2.printBushInfo();
    }
}
