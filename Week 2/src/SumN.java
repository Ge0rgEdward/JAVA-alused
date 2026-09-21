import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Mis numbrini?");
    int n = Integer.parseInt(scanner.nextLine());

    int counter = 1;
    int sum = 0;

    while (counter <= n) {
        sum = sum + counter;
        counter = counter + 1;
    }

    System.out.println("Sum is: " + sum);
}
