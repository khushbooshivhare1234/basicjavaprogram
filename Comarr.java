package command;

public class Comarr {
    public static void main(String args[]){
        int arr[],n;
       // n=Integer.parseInt(args[0]);
        arr=new int[5];
        for(int k=0,i=0;k<args.length;k++){
            arr[i]=Integer.parseInt(args[k]);
        }
        System.out.println(arr[3]);


    }
}
