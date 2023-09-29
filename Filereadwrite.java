package Filehandling;
import java.io.IOException;
import java.io.RandomAccessFile;
class Randomfile{
    void writefile(String fn) throws IOException {
        RandomAccessFile raf=new RandomAccessFile(fn,"rw");
        String s1= "profound classes";
        raf.write(s1.getBytes());
        raf.close();
    }
    void readfile(String fn) throws IOException {
        RandomAccessFile raf=new RandomAccessFile(fn,"rw");
        int i;
        while (( i= raf.read()) != -1){
            System.out.print((char)i);
        }
       raf.close();
    }
}
public class Filereadwrite {
    public static void main(String args[]) throws IOException {
        Randomfile rf =new Randomfile();
        rf.writefile("profound.txt");
        rf.readfile("profound.txt");
    }
}
