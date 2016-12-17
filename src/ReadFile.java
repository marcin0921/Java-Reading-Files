import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFile {
    File file = new File("plik");
    Scanner dataFile = new Scanner(file);

    public ReadFile() throws FileNotFoundException {
    }
}
