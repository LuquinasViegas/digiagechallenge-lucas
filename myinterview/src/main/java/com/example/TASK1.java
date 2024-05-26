package com.example;
import java.util.Scanner;
/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {

    public static String palindromo() {

        System.out.print("Digite uma palavra, frase, número ou sequência de caracteres: ");
        Scanner scan = new Scanner(System.in);
        String stringEntrada = scan.nextLine().replace(" ", "");
        scan.close();
 
        StringBuilder builder = new StringBuilder(String.valueOf(stringEntrada));
        builder.reverse();
        String stringInvertida = builder.toString();
 
        if (stringEntrada.equals(stringInvertida)) {
 
            return "É um palindromo";
        }
        return "Não é um palindromo";
     }
 
     public static void main(String[] args) {
 
         System.out.println(palindromo());
     }
 
}