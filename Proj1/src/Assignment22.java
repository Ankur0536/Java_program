import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Assignment22 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        int x;
        try {
            FileInputStream fs = new FileInputStream("/home/ankurpudale/java/Proj1/src/text1");
            fos = new FileOutputStream("/home/ankurpudale/java/Proj1/src/text2");
            while ((x = fs.read()) != -1) {
                fos.write(x);
            }
            System.out.println("Write successfully");
            byte b[] = new byte[fs.available()];
            for(byte k:b) {
                System.out.print((char) k);
            }
            fs.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
//        String str="Java is simple";
//        try{
//            FileOutputStream fos=new FileOutputStream("/home/ankurpudale/java/Proj1/src/text2");
//            fos.write(str.getBytes(StandardCharsets.UTF_8));
//        }
//        catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//        catch (IOException e){
//            System.out.println(e);
//        }

    }
}
