package Assessment;

import java.util.Scanner;

public class ValidateUsername {
    public  boolean isValidate(String username){
        int n = username.length();
        String end = username.substring(n-4);
        if(end.equals("_job") && (n-4)>=8){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        System.out.println(new ValidateUsername().isValidate(username));
    }
}


