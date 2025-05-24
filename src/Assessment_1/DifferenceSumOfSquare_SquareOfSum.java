package Assessment_1;

import java.util.Scanner;

public class DifferenceSumOfSquare_SquareOfSum {
    public static int calculateDifference(int n){
        int sumSq = 0;
        int sqSum = 0;

        for(int i=1;i<=n;i++){
            sumSq += (int)Math.pow(i,2);
            sqSum += i;
        }

        sqSum = (int)Math.pow(sqSum,2);
        return sumSq-sqSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(calculateDifference(n));
    }
}
