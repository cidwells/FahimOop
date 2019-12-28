package inheritence;

public class Cricket extends Player {
   private String batsman;
   private String bowler;


    int firstInningsScore;
    public void strikeBowler(String bowler){
        this.bowler = bowler;
        System.out.println(bowler + " is one of the best");
    }
    public void firstInnings(int firstInningsScore){
        this.firstInningsScore = firstInningsScore;
        System.out.println("First innings score was "+  this.firstInningsScore );
    }
}
