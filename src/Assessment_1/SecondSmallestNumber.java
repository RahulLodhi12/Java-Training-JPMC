package Assessment_1;

import java.util.Scanner;

public class SecondSmallestNumber {
    public static int secondSmallest(int[] arr){
        int large=Integer.MIN_VALUE;
        for(int i: arr){
            large = Math.max(large,i);
        }

        int secLarge=Integer.MIN_VALUE;
        for(int i: arr){
            if(i!=large){
                secLarge=Math.max(secLarge,i);
            }
        }
        return secLarge;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(secondSmallest(arr));
    }
}
