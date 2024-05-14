/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi.penjualan.telur;

/**
 *
 * @author ACER
 */

 import java.util.Scanner;

public class AplikasiPenjualanTelur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama jalan: ");
        String jalan = scanner.nextLine();

        System.out.print("Masukkan nomor rumah: ");
        int nomor = scanner.nextInt();

        System.out.print("Masukkan kota: ");
        scanner.nextLine(); // Membersihkan buffer
        String kota = scanner.nextLine();

        String alamat = nomor + " " + jalan + ", " + kota;
        System.out.println("Alamat anda adalah: " + alamat);
    
    }
    
    public class InputPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("You entered: " + phoneNumber);
    }
    }
    

    
    
    public class InputEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String emailAddress = scanner.nextLine();

        System.out.println("You entered: " + emailAddress);
    }
    }
}
    

