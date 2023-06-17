import java.util.Random;
import java.util.Scanner;

public class Seminar_1 {
    public static void main(String[] args) {

        // --------
        int[] ints = new int[12];
        Random random = new Random();
        for (int j = 0; j < ints.length; j++) {
            ints[j] = random.nextInt(2000);

        }
        int[] tmp = new int[ints.length + 3];
        for (int j = 0; j < ints.length; j++)
            tmp[j] = ints[j];
        ints = tmp;

        int i = 0;
        for (int j = 0; j < 12; j++) {
            i += j;
        }
        System.out.println(i);

        int b = 0;
        if (b < 1)
            System.out.println(b);
        String str = "Привет мир";
        str += "?";
        System.out.println(str);

        
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            s = sc.nextLine();
            System.out.println(s);
        } while (s.equals("q"));

    }
}