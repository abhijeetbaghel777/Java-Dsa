import java.io.File;
import java.util.*;
public class fileHandeling {
    public static void main(String[] args) {
       try {
        File file=new File("home.html");//creation of a file
        if(file.createNewFile()){
            System.out.println("ban gayi file "+"\n"+file.getName());// to get the name of the created file
        }
        else{
            System.out.println("File already created");
        }
       } catch (Exception e) {
        System.out.println(e);
       }

    }
}
