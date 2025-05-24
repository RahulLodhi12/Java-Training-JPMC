package Assessment_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfStringSort {
    public static void arrayOfStringSort(String[] strings){
        Arrays.sort(strings);
//        System.out.println(strings.toString());

        int n= strings.length;
        int mid = (n%2==0) ? n/2 : (n/2)+1;

        int i;
        for(i=0;i<mid;i++){
            strings[i] = strings[i].toUpperCase();
        }

        for(i=mid;i<n;i++){
            strings[i] = strings[i].toLowerCase();
        }

//        System.out.println(strings.toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        String[] strings = new String[n];

        for(int i=0;i<n;i++){
            strings[i] = sc.nextLine();
        }

//        System.out.println(strings.toString());

        arrayOfStringSort(strings);

//        System.out.println(strings.toString());

        for(String s: strings){
            System.out.println(s);
        }
    }
}
