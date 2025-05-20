package Assessment_1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CheckPalindrome strings = new CheckPalindrome();

        strings.palindromeCheck(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
    }
}

class CheckPalindrome{
    void palindromeCheck(String... str){
        for(String s: str){
            if(isPalindrome(s)){
                System.out.println(s + " Palindrome..");
            }
            else{
                System.out.println(s + " Not Palindrome..");
            }
        }
    }

    boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
