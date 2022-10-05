import java.util.Scanner;

public class PPBO_05_Latihan1 {

    public static void main(String[] args) {
    String string;
    Scanner input = new Scanner(System.in);
    string = input.nextLine();
    input.close();
    for(int i = 0; i < string.length(); i += 3) {
        System.out.print(string.charAt(i));
        }
    }
}
