import java.io.*;
import java.util.Scanner;


public class ReadFile {


    String previousLine = "";

    private boolean isFileLoaded = false;

    private int numberofRows;
    private int currentRow = 0;

    ReadFile() throws FileNotFoundException {
    }



    Scanner loadFile() throws FileNotFoundException {
        File file = new File("plik");

        return new Scanner(file);
    }

    Scanner dataFromFile;
    private void countRowsInFile() throws FileNotFoundException {
        dataFromFile = loadFile();
        while(dataFromFile.hasNextLine()) {
            numberofRows++;
            dataFromFile.nextLine();
        }
//        TUTAJ TRZEBA COFNAC SIE DO POCZATKU DANYCH
    }

    void checkCurrentLine() {

    }


    void takeNextLine() throws FileNotFoundException {

        if (!isFileLoaded) {

            countRowsInFile();
            isFileLoaded = true;
        }
        System.out.println(dataFromFile);

    }




}
