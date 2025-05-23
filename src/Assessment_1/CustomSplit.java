package Assessment_1;

import java.util.Scanner;

public class CustomSplit {
    public static void mySplit(String str, String delimiter){
        if(delimiter.length()==0){
            System.out.println(str);
            return;
        }

        String temp="";
        int n = str.length();
        int k=delimiter.length(); //window size
        int i=0;
        int j=0;

        while(j<n){
            if(str.charAt(j)==delimiter.charAt(0)){
                String subStr = str.substring(j,j+k);
                if(subStr.equals(delimiter)){
                    temp = str.substring(i,j);
                    System.out.println(temp);
                    j=j+k;
                    i=j;
                    continue;
                }
            }
            j++;
        }
        //for remaining string or characters.
        System.out.println(str.substring(i));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String delimiter = sc.nextLine();

        mySplit(str,delimiter);
    }
}
