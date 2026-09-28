package view;

import java.util.Scanner;
import controller.ManajemenPanti;

public class Validasi {

    // VALIDASI INPUT ANGKA
    public static int bacaInt(Scanner scanner, String prompt) {
        int nilai;

        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                nilai = scanner.nextInt();
                scanner.nextLine();
                return nilai;
            } else {
                System.out.println("\n====================================================");
                System.out.println("========= ERROR: INPUT HARUS BERUPA ANGKA! =========");
                System.out.println("====================================================\n");
                scanner.nextLine();
            }
        }
    }

    // VALIDASI ID PENGHUNI
    public static boolean validasiIdPenghuni(int idPenghuni) {
        if (idPenghuni <= 0) {
            System.out.println("\n====================================================");
            System.out.println("======= ERROR: ID HARUS BERUPA ANGKA POSITIF! ======");
            System.out.println("====================================================\n");
            return false;
        }
        return true;
    }

    // VALIDASI ID DUPLIKAT
    public static boolean validasiIdDuplikat(
            int idPenghuni, ManajemenPanti controller) {

        if (controller.isIdExist(idPenghuni)) {
            System.out.println("\n=======================================================");
            System.out.println("= ERROR: PENGHUNI DENGAN ID TERSEBUT SUDAH TERDAFTAR! =");
            System.out.println("=======================================================\n");
            return false;
        }
        return true;
    }

    // VALIDASI NAMA PENGHUNI
    public static boolean validasiNama(String nama) {

        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("========= ERROR: NAMA TIDAK BOLEH KOSONG! ==========");
            System.out.println("====================================================\n");
            return false;
        }
        if (!nama.matches("[a-zA-Z ]+")) {
            System.out.println("\n====================================================");
            System.out.println("= ERROR:NAMA TIDAK BOLEH BERISI ANGKA ATAU SIMBOL! =");
            System.out.println("====================================================\n");
            return false;
        }
        return true;
    }

    // VALIDASI USIA PENGHUNI
    public static boolean validasiUsia(int usia) {

        if (usia <= 0) {
            System.out.println("\n====================================================");
            System.out.println("====== ERROR: USIA HARUS BERUPA ANGKA POSITIF! =====");
            System.out.println("====================================================\n");
            return false;
        }

        return true;
    }

    // VALIDASI JENIS KELAMIN
    public static boolean validasiJenisKelamin(String jenisKelamin) {

        if (jenisKelamin == null || jenisKelamin.trim().isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("===== ERROR: JENIS KELAMIN TIDAK BOLEH KOSONG! =====");
            System.out.println("====================================================\n");
            return false;
        }
        if (!jenisKelamin.matches("[a-zA-Z ]+")) {
            System.out.println("\n==============================================================");
            System.out.println("= ERROR: JENIS KELAMIN TIDAK BOLEH BERISI ANGKA ATAU SIMBOL! =");
            System.out.println("==============================================================\n");
            return false;
        }
        return true;
    }

    // VALIDASI NOMOR TELEPON
    public static boolean validasiNoTelp(String noTelp) {

        if (noTelp == null || noTelp.trim().isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("====== ERROR: NOMOR TELEPON TIDAK BOLEH KOSONG! ====");
            System.out.println("====================================================\n");
            return false;
        }
        if (!noTelp.matches("[0-9]+")) {
            System.out.println("\n====================================================");
            System.out.println("===== ERROR: NOMOR TELEPON HARUS BERUPA ANGKA! =====");
            System.out.println("====================================================\n");
            return false;
        }
        return true;
    }

    // VALIDASI KONDISI KESEHATAN
    public static boolean validasiKondisi(String kondisi) {

        if (kondisi == null || kondisi.trim().isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("=== ERROR: KONDISI KESEHATAN TIDAK BOLEH KOSONG! ===");
            System.out.println("====================================================\n");
            return false;
        }
        if (!kondisi.matches("[a-zA-Z ]+")) {
            System.out.println("\n=======================================================");
            System.out.println("= ERROR:KONDISI TIDAK BOLEH BERISI ANGKA ATAU SIMBOL! =");
            System.out.println("=======================================================\n");
            return false;
        }
        return true;
    }

    // VALIDASI HAPUS PENGHUNI
    public static boolean validasiHapusPenghuni(
            int idPenghuni, ManajemenPanti controller) {

        if (!controller.isIdExist(idPenghuni)) {
            System.out.println("\n=======================================================");
            System.out.println("= ERROR: PENGHUNI DENGAN ID TERSEBUT TIDAK DITEMUKAN! =");
            System.out.println("=======================================================\n");
            return false;
        }

        return true;
    }

    // VALIDASI PILIHAN MENU
    public static boolean validasiPilihanMenu(int pilihan, int batasAtas) {
        if (pilihan < 1 || pilihan > batasAtas) {
            System.out.println("\n====================================================");
            System.out.println("============ PILIHAN ANDA TIDAK VALID! =============");
            System.out.println("====================================================\n");
            return false;
        }
        return true;
    }
}