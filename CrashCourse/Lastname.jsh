import module java.base;
public class RunnerRuns2 {
    
    //varaibles
    private String runnerName;
    private boolean isRacing = false;
    private double runTime;
    private double runLength;
    private int runnerAge;
    private int runnerYear;
    private String raceName;
    private String raceDate;
    private int raceWins = 0;
    private double personalBest;

    // constrcutor

    public RunnerRuns2(String runnerName, int runnerAge, int runnerYear) {
        this.runnerName = runnerName;
        this.runnerAge = runnerAge;
        this.runnerYear = runnerYear;

    }

    public void winRace() {
        raceWins++;
        isRacing = false;

        System.out.println(runnerName + " has won the " + raceName);
        }

    public void getOlder() {
        runnerAge++;
        runnerYear++;

        System.out.println(runnerName + " is now " + runnerAge + " years old, and is in " + runnerYear + "th grade!");

    }

    public void best(double newBest) {
        if (newBest < personalBest) {
            personalBest = newBest;
        }
        else {
            personalBest = personalBest;
        }
    }

    public void completeRace(double newTime) {
        runTime = newTime;
        isRacing = false;

        if (runTime < personalBest) {
            personalBest = runTime;
        } 
        else {
            personalBest = personalBest;
        }

        System.out.println(runnerName + " has finished in " + runTime + "minutes");

}

    public void upcomingRace(String nextRace, String nextDate) {
        raceName = nextRace;
        raceDate = nextDate;
        isRacing = true;

        System.out.println(runnerName + " is racing in " + raceName + " on " + raceDate);
      }

    public void setRunLength(double distance) {
        runLength = distance;
    }
    
}
RunnerRuns2 arben = new RunnerRuns2("Arben", 16, 11);
RunnerRuns2 john = new RunnerRuns2("John", 17, 11);
RunnerRuns2 tor = new RunnerRuns2("Tor", 16, 11);
RunnerRuns2 musa = new RunnerRuns2("Musa", 15, 10);
RunnerRuns2 thomas = new RunnerRuns2("Thomas", 14, 9);
john.upcomingRace("Fall Trot 5k", "9/26/26")
john.completeRace(926.2)
arben.setRunLength(5.0)
tor.getOlder()
john.winRace()
thomas.best(14.2)
musa.runnerName
arben.isRacing
john.runTime
john.runLength
tor.runnerAge
tor.runnerYear
john.raceName
john.raceDate
john.raceWins
thomas.personalBest