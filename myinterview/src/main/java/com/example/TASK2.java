package com.example;

import java.util.LinkedList;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */


public class TASK2 {

    public static void apagaMeio() {
        LinkedList<String> linkedList = new LinkedList<String>();
        for (int x = 0; x < 11; x++) {
            linkedList.add("Elemento " + x);
        }

        System.out.println(linkedList);
        linkedList.remove(linkedList.size()/2);
        System.out.println(linkedList);
    }

    public static void main(String[] args) {

        apagaMeio();
    } 

}