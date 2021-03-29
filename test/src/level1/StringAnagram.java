package level1;

import java.util.Scanner;

public class StringAnagram {

    public static void main(String[] args) {
        /**
         * Assignment 2 input: String s1 = "aabbc", s2 = "abcab" Anagram
         *
         * s1 = "aabbc", s2 = "abcas" Not anagram
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first word");
        String s1 = sc.nextLine();
        System.out.println("enter second word");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("no anagram");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s2 = s2.substring(0, j) + s2.substring(j + 1);
                    //bring all letter before j and put it in j +1 

                }

            }
        }
        if (s2.length() == 0) {
            System.out.println("anagram");
        } else {
            System.out.println("no anagram");
        }

    }

}
