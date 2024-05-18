package iostream;

import java.io.FileOutputStream;

public class iostreams {
    public static void main(String[] args) {
        try{
        FileOutputStream fos =new FileOutputStream("c:/GFG/text.txt");
            String str="learn in java programing  ";
// fos.write();
// fos.write(str.getBytes()); // its return array of bytes
//     fos.close();
byte b[]=str.getBytes();
for(byte x:b){
fos.write(x);
}
fos.close();

}
    catch(Exception e){
        System.out.println(e);
    }
}

}
// its a simple way to check type text.txt