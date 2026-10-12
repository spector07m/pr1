package ru.mirea.lab1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 3, 19, 7, 1, 14, 6, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + avg);
    }
}
