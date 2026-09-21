public class StarPrinter {
    private static void starPrinter(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print('*');
            counter = counter + 1;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        starPrinter(3);
        starPrinter(6);
        starPrinter(9);
        starPrinter(12);
        starPrinter(15);
    }
}
