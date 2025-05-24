package Assessment_1;

import java.util.Scanner;

public class SumOfCubesOfStringNumber {
    public int sumOfCubes(String number){
        int n = number.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch = number.charAt(i);
            int digit = ch-'0';
            int cube = (int)Math.pow(digit,3);
            sum+=cube;
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();

        System.out.println(new SumOfCubesOfStringNumber().sumOfCubes(number));
    }
}


