package com.company;
import java.util.Scanner;

public class Main {


        public static void main(String[] args){
                Scanner co = new Scanner(System.in);
                System.out.print("Input a number: ");
                int num = co.nextInt();
                if(num == 1) {
                Scanner scann = new Scanner(System.in);
                String ss = scann.nextLine();
                String s = ss.replaceAll("[ .,:;-]", "");
                System.out.println("Your phrase without any distracting features — " + s + "\n");
                Palindrome(s);
            }
                else if(num == 2){
                    Scanner scann1 = new Scanner(System.in);
                    String sss = scann1.nextLine();
                    String word = sss.replaceAll("[ .,:;-]", "");
                    StringBuilder builder = new StringBuilder(word);

                    String as = builder.reverse().toString();

                    System.out.println("Your phrase without any distracting features — " + word + "\n");
                    System.out.println(as + " — is your phrase in reverse.\n");

                    // порівнюємо записане слово, і те саме слово, записане навпаки
                    if (word.equals(as)) {
                        System.out.println("It is a palindrome!");
                    } else {
                        System.out.println("It is not a palindrome.");
                    }
                }
                else if(num == 3){
                    Scanner scann2 = new Scanner(System.in);
                    String ssss = scann2.nextLine();
                    String word = ssss.replaceAll("[ .,:;-]", "");
                    boolean isPalindrom = true;
                    for (int i = 0; i < word.length(); i++) {
                        if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                            isPalindrom = false;
                            break;
                        }
                    }
                    System.out.println("Your phrase without any distracting features — " + word + "\n");
                    System.out.println("this string is a palindrome? - " + isPalindrom);

                }
        }
        public static String reverseString(String s){
                String r = "";
                for (int i = s.length() - 1; i >= 0; --i)
                    r += s.charAt(i);
                return r;


        }
        public static Boolean Palindrome(String s) {
            if(s.equals(reverseString(s))){
                System.out.println("Паліндром");
            }else{
                System.out.println("Не паліндром");
            }
            return s.equals(reverseString(s));

        }
    }
