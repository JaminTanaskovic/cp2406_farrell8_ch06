import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an even number or '999' to quit > ");
        int userInput = scanner.nextInt();
//        checkInput();

        if (userInput == 999){
            System.out.println("Thanks for playing.");
        }else if ((userInput % 2) == 0){
            System.out.println("Good Job!, try again");
//            checkInput();
        }else {
            System.out.println("Sorry this number is not even try again");
//            checkInput();
        }
    }
/*
    private static void checkInput() {

        if ((userInput % 2) == 0) {
            System.out.println("Good Job!, try again");
        } else {
            System.out.println("Sorry this number is not even try again");
        }
    }*/
}

















/*        while (userInput != 999){
            System.out.println("hi");
          //  Scanner newScanner = new Scanner(System.in);
            System.out.print("Please enter an even number or '999' to quit > ");
            userInput = Scanner.nextInt();
            if ((userInput % 2) == 0) {
                System.out.println("Good Job!, try again");
            } else {
                System.out.println("Sorry this number is not even try again");
            }
        } while (userInput != 999);
*/