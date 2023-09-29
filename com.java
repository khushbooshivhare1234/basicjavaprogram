package command;

import java.util.Scanner;
public class com {
    public static void main(String args[]){
        float basic_salary,dra,hra,gross,income_tax=0;
        int i;
        basic_salary=Float.parseFloat(args[0]);
        for(i=0; i< args.length;i++){
            System.out.println("salary"+" "+args[i]);
        }
        dra = (20 * basic_salary) / 100;
        hra = (30 * basic_salary) / 100;
        gross = dra + hra + basic_salary;
        System.out.println("gross salary" + " "+gross);

        if (basic_salary > 0 && basic_salary < 4000){
            income_tax=(4*basic_salary)/100;
        }
        else
        if (basic_salary >= 4000 && basic_salary < 10000){
            income_tax=(6*basic_salary)/100;
        }
        else  if (basic_salary >= 10000 && basic_salary < 17000){
            income_tax=(8*basic_salary)/100;
        }
        else
        if (basic_salary >= 17000 && basic_salary < 27000){
            income_tax=(10*basic_salary)/100;
        }
        else
        if (basic_salary >= 27000){
            income_tax=(15*basic_salary)/100;
        }
        else{
            System.out.println("not required");
        }
        System.out.println("income_tax is"+" "+ income_tax);





    }

}
