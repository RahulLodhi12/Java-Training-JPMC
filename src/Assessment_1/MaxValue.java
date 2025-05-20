package Assessment_1;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        GetMaxValue nums = new GetMaxValue();

        nums.printMaxValue(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        nums.printMaxValue(sc.nextInt());
        nums.printMaxValue();
    }
}

class GetMaxValue{
    void printMaxValue(int... values){
        if(values.length==0){
            System.out.println("No Arguments..");
            return;
        }

        int maxNum = Integer.MIN_VALUE;
        for(int value: values){
            maxNum = Math.max(maxNum,value);
        }
        System.out.println("Maximum Value: " + maxNum);
    }
}