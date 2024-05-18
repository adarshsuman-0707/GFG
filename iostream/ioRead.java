package iostream;

// import java.io.File;
import java.io.FileOutputStream;
public class ioRead {
    
    public static void main(String[] args) {
        try{
            FileOutputStream rea=new FileOutputStream("C:/GFG/check.txt");
                String str="YH READING FILE HAI MST SIKHNE KA ";
                // rea.write(str.getBytes());
               byte b[]=new byte[rea.available()];
                rea.read(b);
                rea.close();
            }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
