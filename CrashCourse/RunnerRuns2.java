public class RunnerRuns2 {
    
    //varaibles
    private String runnerName;
    private boolean isRacing;
    private double runTime;
    private double runLength;
    private int runnerAge;
    private int runnerYear;
    private String raceName;
    private String raceDate;
    private int raceWins = 0;
    private int personalBest;

    // constrcutor

    public RunnerRuns2(String runnerName, int runnerAge, int runnerYear) {
        this.runnerName = runnerName;
        this.runnerAge = runnerAge;
        this.runnerYear = runnerYear;

    }

    public void winRace() {
        raceWins++;
        isRacing = false;

        System.out.println(runnerName + " has won" + raceName);
        }

    public void getOlder() {
        runnerAge++;
        runnerYear++;


    }

    public void best(int newBest) {
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

        System.out.println(runnerName + ' has finished  in ' + runTime + "minutes");

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
