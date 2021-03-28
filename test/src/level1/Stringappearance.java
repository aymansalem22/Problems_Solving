package level1;

import java.util.Scanner;

public class Stringappearance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String word = sc.nextLine();
        System.out.println("enter the letter which search");
        String letter = sc.nextLine();
        int counter = 0;
        for (; word.indexOf(letter) != -1;) {

            counter++;
            word = word.substring(word.indexOf(letter) + 1);

        }
        System.out.println(counter);

        System.out.println("******second solution*****");

        counter = 0;
        System.out.println("enter the word");
        String word2 = sc.nextLine();
        System.out.println("enter the letter which search");

        String letter2 = sc.nextLine();
        while (word2.indexOf(letter2) != -1) {

            counter += 1;
            word2 = word2.substring(word2.indexOf(letter2) + 1);
        }

        System.out.println(counter);
    }

}
