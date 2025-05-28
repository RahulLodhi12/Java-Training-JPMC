package Assessment;

import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Vote voter = new Vote();
        voter.name = sc.nextLine();
        voter.age = sc.nextInt(); sc.nextLine();
        voter.citizenship = sc.nextLine();

        voter.CanVoteOrNot();
    }
}

class Vote{
    String name;
    int age;
    String citizenship;

    void CanVoteOrNot(){
        if(this.age>=18 && !this.citizenship.isEmpty()){
            System.out.println("Eligible to Vote..");
        }
        else{
            System.out.println("Not Eligible to Vote..");
        }
    }
}
