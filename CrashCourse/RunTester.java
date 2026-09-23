public class RunTester {

    public static void main(String[] args) {
        
        RunnerRuns2 arben = new RunnerRuns2("Arben", 16, 11);
        RunnerRuns2 john = new RunnerRuns2("John", 17, 11);
        RunnerRuns2 tor = new RunnerRuns2("Tor", 16, 11);
        RunnerRuns2 thomas = new RunnerRuns2("Thomas", 16, 11);
        RunnerRuns2 Musa = new RunnerRuns2("Musa", 15, 10);

        arben.upcomingRace("Fox Trot 5k", "9/26/26");
        arben.winRace();
        arben.completeRace(926.2)
        arben.best(54.2);
        arben.getOlder();
        arben.setRunLength(5.0);
        



    }

}