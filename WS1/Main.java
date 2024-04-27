
import java.util.Arrays;
interface Player{
    String Name = "kavi";
    int Matches = 10;
    public void display();
}

interface Batsman extends Player{
    int totalScore = 50;
    int[] perMatchScore = {12,10,13,14,15};
    float average = 34.89f;
    public void display();
}
interface Bowler extends Player{
    //int noOfWickets = 0;

    public void setWickets(int wickets);

    //  public void setWickets(int wickets){
    //   Bowler.noOfWickets = wickets;
}


// public default void display(){
// System.out.println("Number of wickets :" + this.noOfWickets);
// }


class AllRounder implements Batsman, Bowler {
    int noOfWickets = 0;
    public void display() {
        System.out.println("Name :" + this.Name);
        System.out.println("Matches :" + this.Matches);
        System.out.println("Total Score :" + this.totalScore);
        System.out.println("Per Match Score :" + Arrays.toString(perMatchScore));
        System.out.println("Average Score :" + this.average);
        System.out.println("Number of wickets :" + this.noOfWickets);
        //Bowler.super.display();
    }

    public void setWickets(int wickets) {
        this.noOfWickets = wickets;
    }

    public static void main(String args[]){

        AllRounder a = new AllRounder();
        a.display();
        a.setWickets(800);
        System.out.println("\n------------------------------------------------------------------------\n");
        a.display();
    }
}

