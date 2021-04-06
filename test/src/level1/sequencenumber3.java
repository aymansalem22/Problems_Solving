package level1;

import java.util.Scanner;

public class sequencenumber3 {
    // take input n = 50
    // 1    4   9   16  25  36  49
    //  +3   +5  +7   +9  +11 +13
    // input n = 90
    // 1    4   9   16  25  36  49  64  81

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("insert n : ");
        int n = sc.nextInt();
        int diff = 1;
        for (int i = 1; i < n; i += diff) {
            System.out.println(i);
            diff += 2;
        }

        System.out.println("second soultions");
        System.out.print("insert n : ");
        n = sc.nextInt();
        for (int j = 1, dif = 1; j < n; dif += 2, j += dif) {
            System.out.println(j);
        }

    }

}
