import java.util.Scanner;
public class PPBO_05_Latihan2 {
    public static void main(String[] args) {
        String string;

        Scanner input = new Scanner(System.in);
        string = input.nextLine();
        input.close();

        int code = -1;
        if (string.matches("^[AaEeIiOoUu].*")) {
            code = 1;
        } else if (string.matches("^(.*[^ng])(ng)")) {
            code = 2;
        }

        System.out.print(code);
    }
}