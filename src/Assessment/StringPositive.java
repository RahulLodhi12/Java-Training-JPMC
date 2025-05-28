package Assessment;

import java.util.Scanner;

public class StringPositive {
    public String isPositive(String str){
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) < str.charAt(i-1)){
                return "Negative String";
            }
        }

        return "Positive String";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(new StringPositive().isPositive(str));
    }
}
