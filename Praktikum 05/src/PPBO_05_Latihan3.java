import java.util.Scanner;

public class PPBO_05_Latihan3 {
    public static void main(String[] args) {
        char char1, char2, charTemp;
        Scanner input = new Scanner(System.in);
        char1 = input.next().charAt(0);
        char2 = input.next().charAt(0);
        input.close();

        if(char1 > char2) {
            charTemp = char2;
            char2 = char1;
            char1 = charTemp;
        }
        StringBuilder strBuild = new StringBuilder();
        for(; char1 <= char2; char1++){
            strBuild.append(char1);
        }
        System.out.print(strBuild);
    }
}