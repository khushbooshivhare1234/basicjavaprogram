package Package.p1;

import java.util.Scanner;

public class Package1 {
     int x,y;
   public void op(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x and y");
        x=sc.nextInt();
        y=sc.nextInt();


     }
      public void add(){
        int z=x+y;
         System.out.println(z);
     }
}
