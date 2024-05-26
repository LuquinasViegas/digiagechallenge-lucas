package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {

    public static String itensDistintos() {
        int distintos = 0;
        String proximo = "s";

        Scanner scan = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<String>();

        while (proximo.equals("s")) {
            System.out.println("Digite uma string: ");
            String stringEntrada = scan.nextLine();

            if (!strings.contains(stringEntrada)) {
                distintos++;
            }
            strings.add(stringEntrada);

            System.out.println("Deseja adicionar mais strings? s/n ");
            proximo = scan.nextLine();
        }

        scan.close();

        System.out.println(strings);
        return "A lista contém " + distintos + " itens distintos";
    }


    public static void main(String[] args) {
        System.out.println(itensDistintos());
    }
  
}
