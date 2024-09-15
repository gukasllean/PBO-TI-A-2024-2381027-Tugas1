package Tugas1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int[] bilangan = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
        bilangan[0] = input.nextInt();
        System.out.println("Masukkan bilangan kedua: ");
        bilangan[1] = input.nextInt();
        System.out.println("Masukkan bilangan ketiga: ");
        bilangan[2] = input.nextInt();


        int hasil = bilangan[0] + bilangan[1] + bilangan[2];
        System.out.println(bilangan[0]+ " + " + bilangan[1] + " + " + bilangan[2] + " = " + hasil);
        System.out.println("Jumlah dari ketiga bilangan: " + hasil);

        input.close();
    }
}
