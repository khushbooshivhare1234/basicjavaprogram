package com.example.learnj;

import java.util.Scanner;

class Employees {
    int fixed_salary;
    int incentive;
    void get(){
        System.out.println("salary and incentive");
        Scanner sc= new Scanner(System.in);
        fixed_salary= sc.nextInt();
        incentive= sc.nextInt();


    }


}
class Manager extends Employees{
    int total_sal;
    void compute_sal(){
        total_sal=fixed_salary+incentive;
        System.out.println(total_sal+ " "+fixed_salary+" "+incentive);
    }

}

public class Incentive {
    public static void main(String args[]){
        Manager m=new Manager();
        m.get();
        m.compute_sal();

    }
}
