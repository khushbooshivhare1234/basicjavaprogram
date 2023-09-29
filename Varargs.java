package Variable_argument;

public class Varargs {
    public int add(int ...k){
        int sum=0;
        for (int i:k){
            sum=sum+i;
        }
        return sum;
    }
}
class s{
    public static void main(String args[]){
        Varargs v=new Varargs();
        System.out.println("sum : "+v.add(1,2,3,4,5,6,4,5446,65,67));
    }
}
