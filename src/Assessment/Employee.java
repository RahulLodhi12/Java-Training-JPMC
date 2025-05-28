package Assessment;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Salary empSalary = new Salary();

        empSalary.BasicSalary = sc.nextDouble();
        System.out.println("Basic Salary: "+empSalary.BasicSalary);
        empSalary.getHRA();
        empSalary.getDA();
        empSalary.getPF();
        empSalary.netSalary();
        empSalary.benefits();
    }
}

class Salary{
    double BasicSalary;
    double HRA;
    double DA;
    double PF;
    double NetSalary;

    void getHRA(){
        this.HRA = (20*this.BasicSalary)/100;
        System.out.println("HRA: "+this.HRA);
    }

    void getDA(){
        this.DA = (10*this.BasicSalary)/100;
        System.out.println("DA: "+this.DA);
    }

    void getPF(){
        this.PF = (12*this.BasicSalary)/100;
        System.out.println("PF: "+this.PF);
    }

    void netSalary(){
        this.NetSalary = this.BasicSalary + this.HRA + this.DA - this.PF;
        System.out.println("Net Salary: "+this.NetSalary);
    }

    void benefits(){
        if(this.NetSalary>=15000){
            System.out.println("Health Insurance + Retirement Plans + 30 Paid leaves per year");
        }
        else{
            System.out.println("Health Insurance + 12 Paid leaves per year");
        }
    }
}
