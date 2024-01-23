package exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.print("Masukkan indeks array: ");
            int indeks = scanner.nextInt();
            
            int nilai = numbers[indeks];
            System.out.println("Nilai pada indeks " + indeks + ": " + nilai);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Terjadi ArrayIndexOutOfBoundsException. Indeks diluar batas array.");
        }

        scanner.close();
    }
}

