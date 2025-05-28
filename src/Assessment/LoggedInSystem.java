package Assessment;

import java.util.Scanner;

public class LoggedInSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Login user = new Login();

        user.trackAttempts();
    }
}

class Login{
    Scanner sc = new Scanner(System.in);

    final String username = "username12";
    final String password = "#UserName90";

    void trackAttempts(){
        int attempts=3;

        while(attempts>0){
            String EnterUsername = sc.nextLine();
            String EnterPassword = sc.nextLine();

            if(EnterUsername.equals(username) && EnterPassword.equals(password)){
                break;
            }

            attempts--;
            if(attempts!=0) System.out.println(attempts+" Attempts are Lefts..");
        }

        if(attempts==0){
            System.out.println("Attempts are over. Please wait for 24 hrs..");
        }
        else{
            System.out.println("Login Successfully..");
        }
    }
}
