import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Assignment24 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/home/ankurpudale/java/Proj1/src/text1");
            Path fileName
                    = Path.of("/home/ankurpudale/java/Proj1/src/text1");

            String str = Files.readString(fileName);
            String str1[]=str.split(" ");
            HashMap<String,Integer> hm=new HashMap<>();

            for(String s: str1){
                Integer integer = hm.get(s);

                if (integer == null)

                    hm.put(s, 1);

                else {
                    hm.put(s, integer + 1);
                }
            }
            System.out.println(hm);
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
