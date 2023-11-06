package SoalTugas;

import java.util.Scanner;

public class InputMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PENGINPUTAN MATRIKS");
        System.out.print("kolom: ");
        int kolom = input.nextInt();
        System.out.print("Baris: ");
        int baris = input.nextInt();
        int [][] matriks = new int [baris][kolom];
         System.out.println("Masukkan elemen-elemen matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen matriks kolom " + (i + 1) + " baris " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }
        System.out.println("Matriks yang Anda input:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("["+matriks[i][j] + "] ");
            }
            System.out.println();
    }
}
}