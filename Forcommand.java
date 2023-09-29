package command;

public class Forcommand {
    public static void main(String args[]){
        int i,number=0;
        for(i=0;i< args.length;i++) {
            number += Integer.parseInt(args[i]);
        }
        System.out.println(number);

    }

}
