package iostream;
import java.io.FileOutputStream;
public class iost {
    public static void main(String[] args) {
       try{
        FileOutputStream foss=new FileOutputStream("C:/GFG/RUNN.txt");
        String st="Me sikhe bina nhi manuga";
        byte []b=st.getBytes();
        for(byte s:b){
foss.write(s);   



}foss.close();

    }
    catch(Exception e){
        System.out.println(e);
    }
}
}