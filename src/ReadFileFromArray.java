import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadFileFromArray {

    int currentLine = -1;
    boolean isDataLoaded = false;

    Scanner loadFile() throws FileNotFoundException {
        File file = new File("plik");
        return new Scanner(file);
    }


    ArrayList<String> loadData() throws FileNotFoundException {
        ArrayList<String> dataInArray = new ArrayList<>();

        Scanner dataFromFile = loadFile();
        while(dataFromFile.hasNextLine()) {
            dataInArray.add(dataFromFile.nextLine());
        }
        isDataLoaded = true;
        return dataInArray;
    }
    ArrayList<String> data = null;
    void getNextLine() throws FileNotFoundException {

        if (!isDataLoaded) {
            data = loadData();
        }

        try {
            currentLine++;
            System.out.println(data.get(currentLine));
        } catch(IndexOutOfBoundsException e) {
            System.out.println(data.get(currentLine));
            System.out.println("Jesteś w ostatniej linii!!");
        }

    }

    void getPreviousLine() throws FileNotFoundException {
        if (!isDataLoaded) {
            data = loadData();
        }
        try {
            currentLine--;
            System.out.println(data.get(currentLine));
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Jesteś w pierwszej linii!!");
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        ReadFileFromArray main = new ReadFileFromArray();
        ArrayList<String> test = main.loadData();
        System.out.println(test);
    }


}
