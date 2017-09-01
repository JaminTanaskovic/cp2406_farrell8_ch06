import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        int start = 3, finish = 300, count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the num you want to count by > ");
        int countBy = scanner.nextInt();

        for (int i = start; i <= finish ; i = i + countBy) {

            count++;
            System.out.print(" " +i);
            if (count % 10 == 0)
                System.out.println("\n");
        }
    }
}
