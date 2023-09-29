package Filehandling;
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class Fileinfo {
    public static void main(String ar[]) throws IOException {
        File f1=new File("profound.txt");
        f1.createNewFile();
        System.out.println(f1.length());
        System.out.println(f1.lastModified());
        System.out.println(new Date(f1.lastModified()));
      // f1.renameTo(new File("ProFound"))
        System.out.println(f1.getName());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.canExecute());
        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        File f2=new File("Emp");
        f2.mkdir();
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        File f3=new File("Emp1","Emp2");
        f3.mkdirs();
        System.out.println(f3.getAbsolutePath());//C:\Users\khushboo shivhare\IdeaProjects\learnj\Emp1\Emp2
        String s[]=f2.list();
        for(String i:s){
            System.out.println(i);
        }
       // f1.delete();
       System.out.println(f1.exists());

    }
}
