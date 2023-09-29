package Enhanced_Loop;
import Variable_argument.Varargs;

public class Enhancedloop {
    public static void main(String args[]){
        int arr[]={1,2,4,5,6,};
        for (int i:arr){
            System.out.println(i);
        }
        Varargs v=new Varargs();
        System.out.println("sum : "+v.add(arr)); // their method declare in package Variable_argument.Varargs;


    }
}
