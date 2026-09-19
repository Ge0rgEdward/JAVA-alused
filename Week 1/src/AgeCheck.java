import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kui vana sa oled?");
        int vanus = Integer.parseInt(scanner.nextLine());

        if (vanus >= 0 && vanus <= 120){
            System.out.println("Olgu!");
        } else {
            System.out.println("Võimatu!");
        }


    }

}
