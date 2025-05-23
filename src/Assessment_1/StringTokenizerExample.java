package Assessment_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static int displayAndSum(String str){
        int sum=0;
        StringTokenizer token = new StringTokenizer(str," ");
        while(token.hasMoreTokens()){
            String st = token.nextToken();
            int num = Integer.parseInt(st);
            System.out.println(num);
            sum+=num;
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("Sum: "+displayAndSum(str));
    }
}


