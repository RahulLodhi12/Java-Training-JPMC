package Assessment;

import java.util.Scanner;

public class IncreasingNumber {
    public static boolean checkNumber(int n){
        String num = Integer.toString(n); //int to String
        int len = num.length();

        for(int i=1;i<len;i++){
            if(num.charAt(i) < num.charAt(i-1)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(checkNumber(n));
    }
}
