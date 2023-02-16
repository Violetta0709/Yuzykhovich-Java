package org.veta;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {7, 9, 12, 4, 8, 3, 15, 11};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
