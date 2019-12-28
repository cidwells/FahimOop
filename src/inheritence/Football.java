package inheritence;

public class Football extends Player{
    String qb;
    public void mvp(String qb){
        this.qb = qb;
        System.out.println(this.qb+ " throws really well");
    }
}
