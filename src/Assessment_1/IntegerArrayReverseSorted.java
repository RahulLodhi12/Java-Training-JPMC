package Assessment_1;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArrayReverseSorted {
    public static int[] intArrayReverseSort(int[] number){
        int n=number.length;

        for(int i=0;i<n;i++){
            String num = Integer.toString(number[i]); // int to String
            String rev = new StringBuilder(num).reverse().toString();
            number[i] = Integer.parseInt(rev); //String to int
        }

        Arrays.sort(number);

        return number;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] number = new int[n];

        for(int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }

        int[] ans = intArrayReverseSort(number);

        for(int i: ans){
            System.out.println(i);
        }
    }
}
