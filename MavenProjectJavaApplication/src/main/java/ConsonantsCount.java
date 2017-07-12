
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AhmedHesham
 */
public class ConsonantsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word= ");
        String word = scanner.next();
        int temp =countString(word);
        System.out.println("Final word: "+temp);
    }
    
      public static int countString(String str) {
        char ch;
        int vowels = 0, temp = 0;
        temp = str.length();
        System.out.println("word: " + temp);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
                    || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                vowels++;
            }
        }
        
        return temp -= vowels;
    }
}
