package ex3;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String ch,chv;
		boolean palind;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        ch = input.nextLine();
        input.close();
        int left = 0;
        int right = ch.length() - 1;
        palind = true;
        while (left < right) {
            if (ch.charAt(left) != ch.charAt(right)) {
                palind = false;
            }
            left++;
            right--;
        }
        if(palind) {
        	System.out.println("Palindrome");
        }else {
        	System.out.println("Non Palindrome");
        }
    }
}
