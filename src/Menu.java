import java.util.InputMismatchException;
import java.util.Scanner;


class Menu {

    void initMenu() {
        System.out.println("Wybierz opcję z MENU: \n W - wyświetl górną linijkę tekstu \n S - wyświetl dolną linijkę tekstu");
        Scanner sc = new Scanner(System.in);

        int userOption;

        try {
            userOption = sc.next().charAt(0);
        } catch (InputMismatchException e) {
            userOption = "".charAt(0);
        }
//        ASCI CODE: w = 119, s = 115, W = 87, S = 83
//        Change big letter into small
//        W --> w
        if (userOption == 87) {
            userOption = 119;
        }
//        S --> s
        if (userOption == 83) {
            userOption = 115;
        }

        chooseMenu(userOption);
    }

    private void chooseMenu(int userOption) {
        int keyboardKey;
        do {
            keyboardKey = userOption;
            switch(keyboardKey) {
                case 119:
                    System.out.println("aa");
                    break;
                case 115:
//                    sentence = dataFile.nextLine();
                    break;
                case 113:
                    System.out.println("Program zakończy pracę!");
                    break;
                default:
                    System.out.println("Wciśnij W aby wyświetlić sentence wyżej. " +
                            "Wciśnij S aby wyświetlić sentence niżej.");
                    break;
            }
            initMenu();
        }while(!(keyboardKey == 113));
    }


}
