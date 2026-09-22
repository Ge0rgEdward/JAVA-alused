import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kirjuta sõna :");
        String word = scanner.nextLine();

        System.out.print("Sõna esmiese osa pikkus :");
        int length = Integer.parseInt(scanner.nextLine());

        String result = word.substring(0, length);

        System.out.println("Tulemus: " + result);

    }
}
