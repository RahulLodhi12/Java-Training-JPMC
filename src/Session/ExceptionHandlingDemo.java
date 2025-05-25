package Session;

import java.util.Scanner;

//Main Purpose of Exception Handling:
//- Purpose is to run the complete program, and prevent from termination in-between before the last line execute.
//- Avoid program termination
public class ExceptionHandlingDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        new CalculateOp().divide(sc.nextInt(),sc.nextInt());
//
//        new CalculateOp().multiple(sc.nextInt(),sc.nextInt());

        new CalculateOp().arrayAccess();

        new CalculateOp().nullPointerExceptionExample();
    }
}

class CalculateOp{
    void divide(int a, int b) {
        int res=0;

        //At compile-time, compiler don't know which block either "try" or "catch" will execute.
        try {
            res = a / b;
            System.out.println("Divide Result " + res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    void multiple(int a, int b){
        int res;

        res = a*b;

        System.out.println("Multiple Result :" + res);
    }

    void arrayAccess(){
        int[] arr = {11,22,33};

        try{
            System.out.println(arr[0]);
            return;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } finally { //Always runs, even if there is "return" statement in "try" block.
            System.out.println("Finally Block..");
        }
    }

    void nullPointerExceptionExample(){
        String str = null;

        try{
            System.out.println(str.length());
        } finally {
            System.out.println("Finally block..always runs..");
        }
        //In-place of "try-catch" block, we can use "try-finally" block
        //Purpose of "try-finally" block is to pass the bug to the calling method. here it's main() method.
    }
}
