package Assessment;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CheckPrime num = new CheckPrime();

        num.n = sc.nextInt();

        num.isPrime();
    }
}

class CheckPrime{
    int n; //instance variable

    void isPrime(){
        int cnt=0; //local variable

        if(this.n==1){
            System.out.println(this.n + " Not Prime..");
            return;
        }

        for(int i=2;i<this.n;i++){
            if(this.n%i==0){
                cnt++;
            }
        }

        if(cnt==0){
            System.out.println(this.n + " Prime..");
        }
        else{
            System.out.println(this.n + " Not Prime..");
        }
    }
}