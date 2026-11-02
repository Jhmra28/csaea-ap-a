
public class MusicTester {
    public static void main(String[] args) {

        Music blindingLights = new Music("Blinding Lights", 200, 9.5, false);
        Music badGuy = new Music("Bad Guy", 194, 8.5, true);
        Music starBoy = new Music("Starboy", 230, 9.0, false);

        System.out.println("testing toString()");
        System.out.println("expected: Song: Blinding Lights, Duration: 200 seconds, Rating: 9.5, Explicit: false");
        System.out.println("got: " + blindingLights.toString());
        System.out.println();

        System.out.println("testing hasWord()");
        System.out.println("expected: true");
        System.out.println("got: " + blindingLights.hasWord("Lights"));

        System.out.println("expected: false");
        System.out.println("got: " + blindingLights.hasWord("Starboy"));
        System.out.println();

        System.out.println("testing getFirstWord()");
        System.out.println("expected: Blinding");
        System.out.println("got: " + blindingLights.getFirstWord());

        System.out.println("expected: Starboy");
        System.out.println("got: " + starBoy.getFirstWord());
        System.out.println();

        System.out.println("testing isSameSong()");
        System.out.println("expected: true");
        System.out.println("got: " + blindingLights.isSameSong("Blinding Lights"));

        System.out.println("expected: false");
        System.out.println("got: " + blindingLights.isSameSong("Bad Guy"));
        System.out.println();

        System.out.println("testing getDurationInMinutes()");
        System.out.println("expected: 3");
        System.out.println("got: " + blindingLights.getDurationInMinutes());

        System.out.println("expected: 0");
        System.out.println("got: " + new Music("Short Song", 45, 7.0, false).getDurationInMinutes());
        System.out.println();

        System.out.println("testing isAppropriate()");
        System.out.println("Expected: true");
        System.out.println("Got: " + blindingLights.isAppropriate());

        System.out.println("Expected: false");
        System.out.println("Got: " + badGuy.isAppropriate());
    }
}
