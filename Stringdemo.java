package Javaclass;
public class Stringdemo {
    public static  void main(String a[]){
       String s="khushboo kumari shivhare ghjgfeh";
        int j=0,o=1;
      char c,k;

        for(int i=0;i<s.length();i++){
            k=s.charAt(i);
            if (k ==' '){
                j++;
            }


        }
       // System.out.println(j);

        for(int i=0;i<s.length();i++){
            if(i==0){
                System.out.print(s.charAt(i)+".");
                continue;
            }

            c=s.charAt(i);

           /* if(c ==' '){// this condition is used when you want single character not a whole  word remove below cade for that k.k.s
                System.out.println(s.charAt(1+i));
            }*/
            if (c ==' '&& o<j){
                System.out.print(s.charAt(1+i)+".");
                o++;
                continue;
            }
            if(o==j && c==' ' ){// this condition is used when you want whole word not a single character k.s.shivhare
                System.out.print(s.substring(1+i));
                break;
            }



        }


    }
}
