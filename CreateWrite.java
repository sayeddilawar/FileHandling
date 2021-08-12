import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreatingFile {
    public static void main(String[] args) throws IOException {

            File createFile = new File("C:\\Users\\VC\\file.txt");
            if (createFile.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File already exists.");
            }
        FileWriter myWrite=new FileWriter("C:\\Users\\VC\\file.txt");
            myWrite.write("Hey Good Morning");
            myWrite.close();

        }
    }



