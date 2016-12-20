import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


class Menu {

    void initMenu() throws FileNotFoundException {
        System.out.println("Wybierz opcję z MENU: \n" +
                "W - wyświetl kolejną linię \n" +
                "S - wyświetl poprzednią linię \n" +
                "Q - zakończ program");
        Scanner sc = new Scanner(System.in);

        int userOption;
        try {
            userOption = sc.next().charAt(0);
        } catch (InputMismatchException e) {
            userOption = "".charAt(0);
        }
//        ASCI CODE: w = 119, s = 115, q = 113, W = 87, S = 83, Q = 81
//        Change big letter into small
//        W --> w
        if (userOption == 87) {
            userOption = 119;
        }
//        S --> s
        if (userOption == 83) {
            userOption = 115;
        }
//        Q --> q
        if (userOption == 81) {
            userOption = 113;
        }

        chooseMenu(userOption);
    }

    private ReadFileFromArray readFileFromArray = new ReadFileFromArray();
    private void chooseMenu(int userOption) throws FileNotFoundException {

        while(!(userOption == 113)) {
            switch(userOption) {
                case 119:
                    readFileFromArray.getNextLine();
                    break;
                case 115:
                    readFileFromArray.getPreviousLine();
                    break;
                default:
                    System.out.println("Wciśnij W aby wyświetlić kolejną linię. \n" +
                            "Wciśnij S aby wyświetlić poprzednią linię. \n" +
                            "Wciśnij Q aby zakończyć program");
                    break;
            }
            initMenu();
        }
        System.out.println("Program kończy pracę!");
        System.exit(0);
    }

}
