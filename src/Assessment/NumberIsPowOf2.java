package Assessment;

import java.util.Scanner;

public class NumberIsPowOf2 {
    public static boolean checkNumber(int n){
        while (n>0){
            if(n==1) return true;
            if(n%2==0) n=n/2;
            else return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(checkNumber(n));
    }
}
