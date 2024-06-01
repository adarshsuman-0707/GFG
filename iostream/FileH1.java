package iostream;
import java.io.*;
public class FileH1 {
    public static void main(String[] args) throws IOException{
        File f1=new File("a.txt");
        System.out.println(f1.exists());
        String s="Coding seeklo";
        FileOutputStream h1=new FileOutputStream(f1,true);
        char arr[]=s.toCharArray();
        byte rr[]=s.getBytes();
        for(byte k:rr){
            h1.write(k);
        }
        for(int b: arr){
            h1.write(b);
        }
        // f1.createNewFile();
        h1.write('j');
        h1.close();
    }

}
