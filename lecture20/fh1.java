import java.io.File;
import java.io.FileWriter;

public class fh1 {
    public static void main(String[] args) {
       
    }
    static void createData(String str){
        try {
          FileWriter writer=new FileWriter(str)  ;
          writer.write("heloo mera naya data");
          writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
