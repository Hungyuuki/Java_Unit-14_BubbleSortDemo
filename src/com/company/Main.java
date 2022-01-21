package com.company;

import static com.company.BubbleSort.bubbleSort;
import static com.company.BubbleSort.list;

public class Main {

    public static void main(String[] args) {
        System.out.println("List trước khi được sắp xếp là");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println(" ");
        bubbleSort(list);
        System.out.println("List sau khi được sắp xếp là");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
