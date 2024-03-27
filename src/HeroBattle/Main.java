package HeroBattle;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Menmbuat fungsi scanner
        Scanner input = new Scanner(System.in);

        // Menampilkan halaman awal dan meminta input hero pertama
        System.out.println("Permainan adu hero");
        System.out.println("Player 1 : Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("=================================");
        System.out.print("Nama Hero     : ");
        String name1 = input.nextLine();
        System.out.print("Health Point  : ");
        double hp1 = input.nextDouble();
        System.out.print("Attack        : ");
        double attack1 = input.nextDouble();
        System.out.print("Defense       : ");
        double defense1 = input.nextDouble();
        input.nextLine();

        // Inisiasi hero pertama menggunakan setter
        Hero player1 = new Hero(); // Menggunakan constructor kosong
        player1.setName(name1); 
        player1.setHp(hp1); 
        player1.setAttack(attack1); 
        player1.setDefense(defense1); 

        // Menampilkan halaman selanjutnya dan meminta input hero kedua
        System.out.println("\nPermainan adu hero");
        System.out.println("Player 2 : Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("=================================");
        System.out.print("Nama Hero     : ");
        String name2 = input.nextLine();
        System.out.print("Health Point  : ");
        double hp2 = input.nextDouble();
        System.out.print("Attack        : ");
        double attack2 = input.nextDouble();
        System.out.print("Defense       : ");
        double defense2 = input.nextDouble();
        System.out.println("============================================");
        System.out.println("============================================");

        // Inisiasi hero kedua menggunakan constructor full (Overloading Constructor)
        Hero player2 = new Hero(name2, hp2, attack2, defense2);
        int round = 0; // Inisiasi jumlah ronde

        // Looping while untuk melakukan pertarungan antar kedua hero sampai salah satu HP hero habis
        while(player1.getHp() > 0 && player2.getHp() > 0 ){
            round++;
            System.out.println("Ronde " + round);
            player2.firstAttack(player2, player1);
            player1.nextAttack(player1, player2);
        }

        // Seleksi if else untuk menampilkan hasil pertarungan
        if (player1.getHp() > 0) { // Jika HP player 2 habis
            System.out.println("Pertarungan telah usai!");
            System.out.println(player2.getName() + " telah kalah");
            System.out.println("============================================");
            System.out.println(player1.getName() + " adalah pemenangnya");
        } else { // Jika HP player 1 habis
            System.out.println("Pertarungan telah usai!");
            System.out.println(player1.getName() + " telah kalah");
            System.out.println("============================================");
            System.out.println(player2.getName() + " adalah pemenangnya");
        }
    }
}