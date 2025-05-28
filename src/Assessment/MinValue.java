package Assessment;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        GetMinValue nums = new GetMinValue();

        nums.printMinValue(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        nums.printMinValue(sc.nextInt());
        nums.printMinValue();
    }
}

class GetMinValue{
    void printMinValue(int... values){
        if(values.length==0){
            System.out.println("No Arguments..");
            return;
        }

        int minNum = Integer.MAX_VALUE;
        for(int value: values){
            minNum = Math.min(minNum,value);
        }
        System.out.println("Minimum Value: " + minNum);
    }
}