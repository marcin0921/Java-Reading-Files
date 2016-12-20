import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


class ReadFileFromArray {

    private int currentLine = -1;
    private boolean isDataLoaded = false;

    private Scanner loadFile() throws FileNotFoundException {
        File file = new File("plik");
        return new Scanner(file);
    }

    private ArrayList<String> loadData() throws FileNotFoundException {
        ArrayList<String> dataInArray = new ArrayList<>();

        Scanner dataFromFile = loadFile();
        while(dataFromFile.hasNextLine()) {
            dataInArray.add(dataFromFile.nextLine());
        }
        isDataLoaded = true;
        return dataInArray;
    }

    private ArrayList<String> data = null;
    void getNextLine() throws FileNotFoundException {

        if (!isDataLoaded) {
            data = loadData();
        }

        try {
            currentLine++;
            System.out.println("Kolejna linia to: " + data.get(currentLine));
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Jesteś w ostatniej linii.");
            currentLine = 5;
        }

    }

    void getPreviousLine() throws FileNotFoundException {
        if (!isDataLoaded) {
            data = loadData();
        }
        try {
            currentLine--;
            System.out.println("Poprzednia linia to: " + data.get(currentLine));
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Jesteś w pierwszej linii.");
            currentLine = -1;
        }
    }

}
