public class CountByThrees {
    public static void main(String[] args) {
        int start = 3;
        int finish = 300;
        int increment = 3;
        int count = 0;


        for (int i = start; i <= finish ; i = i + increment) {
            System.out.print(" " +i);
            count++;
            if (count % 10 == 0)
                System.out.println("\n");
        }
    }
}
