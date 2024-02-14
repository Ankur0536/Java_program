import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Assignment23 {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("/home/ankurpudale/java/Proj1/src/text1");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int x;
            while((x= bis.read())!=-1){
                System.out.print((char) x);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
