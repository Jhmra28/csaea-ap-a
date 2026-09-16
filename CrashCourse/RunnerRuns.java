public class RunnerRuns {
    
    //varaibles
    String runnerName;
    int finalPosition;
    double runTime;
    double runLength;
    int runnerAge;
    int runnerYear;
    String raceName;
    String raceDate;
    int raceWins = 0;
    int personalBest;

    // constrcutor

    public RunnerRuns(String runnerName, int runnerAge, int runnerYear) {
        this.runnerName = runnerName;
        this.runnerAge = runnerAge;
        this.runnerYear = runnerYear;

    }

    public void winRace() {
        raceWins++;
        }

    public void getOlder() {
        runnerAge++;
        runnerYear++
    }

    public void best() {
        this.personalBest = personalBest;
    }

    public void completeRace() {
        this.runTime = runTime;

}

    public void upcomingRace() {
        this.raceName = raceName;
        this.raceDate = raceDate;
    }
