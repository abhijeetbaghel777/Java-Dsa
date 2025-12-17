
import java.io.FileReader;
import java.io.FileWriter;

public class fh1 {
    public static void main(String[] args) {
       createData();
    }
    static void createData(){
        try {
          FileWriter writer=new FileWriter("index.html",true)  ;// file data inserter
          writer.write(" mera naya data");
          writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void readData(){
        try {
            FileReader reader=new FileReader("index.html");
            int ch;
            while(ch=reader.read()!=-1){
                System.out.print((char)ch);
            }
        } catch (Exception e) {
            
    }
}
