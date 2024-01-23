package exception;

import java.util.Scanner;

import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pembilang: ");
            int pembilang = scanner.nextInt();
            
            System.out.print("Masukkan angka penyebut: ");
            int penyebut = scanner.nextInt();
            
            int hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: Terjadi ArithmeticException. Pembagian oleh nol tidak diperbolehkan.");
        }

        scanner.close();
    }
}
