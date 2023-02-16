package org.veta;

import java.util.Scanner;

public class Task3optional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        sc.close();
    }
}
