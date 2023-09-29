package Collection;

import java.util.HashSet;
import java.util.Set;

public class Hashsetinterface {
    public static void main(String args[]){
        Set s=new HashSet();
        System.out.println(s);
        s.add(23);
        s.add(34.45);
        s.add("khushboo");
        s.add('k');
        s.add(654.656f);
        s.add(true);
        s.add(null);
        s.add(23);
        System.out.println(s);
        s.add("shivhare");
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.contains(23));
        System.out.println(s.remove(23));
        System.out.println(s);
       Object o[]=s.toArray();
        for (Object i :s){
            System.out.print(i+" ");
        }


    }
}
