import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class append {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\VC\\file.txt");
        FileWriter fr = new FileWriter(file,true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write(" Hey good Morning ");

        br.close();
        fr.close();
    }
}
