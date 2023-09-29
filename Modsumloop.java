package command;

public class Modsumloop {
    public static void main(String args[]){
        int i, j, k,p, sum=0;
        i = Integer.parseInt(args[0]);
        j = Integer.parseInt(args[1]);
        k = Integer.parseInt(args[2]);
        for(p=0;p< args.length;p++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
