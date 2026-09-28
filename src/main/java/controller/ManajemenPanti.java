package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.PenghuniBedridden;
import model.PenghuniIntensif;
import model.PenghuniMandiri;
import model.PenghuniPanti;
import view.Validasi;

public class ManajemenPanti {

    private ArrayList<PenghuniPanti> daftarPenghuni;
    private Scanner scanner;

    public ManajemenPanti(Scanner scanner) {
        this.daftarPenghuni = new ArrayList<>();
        this.scanner = scanner;

        // Data Awal (Dummy Data)
        PenghuniMandiri p1 = new PenghuniMandiri(1, "Budi Santoso", 68, "081234567890", "Laki-laki",         
            "Sehat Sejahtera", "Berkebun", "Jalan Pagi & Menyiram Bunga");

        PenghuniIntensif p2 = new PenghuniIntensif(2, "Siti Aminah", 75, "089876543210",       
            "Perempuan", "Hipertensi Ringan", "Perawat Rina", "Senin & Kamis", "3x Sehari Setelah Makan");

        PenghuniBedridden p3 = new PenghuniBedridden(3, "Sukarman", 82, "081311223344",
            "Laki-laki", "Pasca Stroke", "Perawat Doni", "Setiap Hari", "4x Sehari", "Total", "Tiap 2 Jam");

        daftarPenghuni.add(p1);
        daftarPenghuni.add(p2);
        daftarPenghuni.add(p3);
    }

    public boolean isIdExist(int id) {
        for (PenghuniPanti p : daftarPenghuni) {
            if (p.getIdPenghuni() == id) {
                return true;
            }
        }
        return false;
    }

    // TAMBAH PENGHUNI
    public void tambahPenghuni() {
        System.out.println("\n====================================================");
        System.out.println("============== PILIH KATEGORI PENGHUNI =============");
        System.out.println("====================================================");
        System.out.println("| 1. Penghuni Mandiri                              |");
        System.out.println("| 2. Penghuni Intensif                             |");
        System.out.println("| 3. Penghuni Bedridden                            |");
        System.out.println("| 4. Kembali Ke Menu Utama                         |");
        System.out.println("====================================================");

        int jenis = Validasi.bacaInt(scanner, "\nPilih Kategori (1-4): ");

        if (!Validasi.validasiPilihanMenu(jenis, 4) || jenis == 4) {
            return;
        }

        // INPUT ID PENGHUNI
        int idPenghuni;
        do {
            idPenghuni = Validasi.bacaInt(scanner, "ID Penghuni Panti: ");
        } while (!Validasi.validasiIdPenghuni(idPenghuni)
                || !Validasi.validasiIdDuplikat(idPenghuni, this));

        // INPUT NAMA PENGHUNI
        String nama;
        do {
            System.out.print("Nama Penghuni Panti: ");
            nama = scanner.nextLine();
        } while (!Validasi.validasiNama(nama));

        // INPUT USIA PENGHUNI
        int usia;
        do {
            usia = Validasi.bacaInt(scanner, "Usia Penghuni Panti: ");
        } while (!Validasi.validasiUsia(usia));

        // INPUT NOMOR TELEPON KELUARGA
        String noTelp;
        do {
            System.out.print("Nomor Telepon Keluarga: ");
            noTelp = scanner.nextLine();
        } while (!Validasi.validasiNoTelp(noTelp));

        // INPUT JENIS KELAMIN
        String jenisKelamin;
        do {
            System.out.print("Jenis Kelamin: ");
            jenisKelamin = scanner.nextLine();
        } while (!Validasi.validasiJenisKelamin(jenisKelamin));

        // INPUT KONDISI KESEHATAN
        String kondisi;
        do {
            System.out.print("Kondisi Kesehatan Penghuni: ");
            kondisi = scanner.nextLine();
        } while (!Validasi.validasiKondisi(kondisi));

        // INPUT BERDASARKAN KATEGORI PENGHUNI
        if (jenis == 1) {
            System.out.print("Hobi: ");
            String hobi = scanner.nextLine();

            System.out.print("Kegiatan Harian: ");
            String kegiatanHarian = scanner.nextLine();

            PenghuniMandiri pm = new PenghuniMandiri(idPenghuni, nama, usia, noTelp,
                    jenisKelamin, kondisi, hobi, kegiatanHarian);
            daftarPenghuni.add(pm);

        } else if (jenis == 2) {
            System.out.print("Nama Perawat: ");
            String namaPerawat = scanner.nextLine();

            System.out.print("Jadwal Kontrol Medis: ");
            String kontrolMedis = scanner.nextLine();

            System.out.print("Jadwal Pemberian Obat: ");
            String jadwalObat = scanner.nextLine();

            PenghuniIntensif pi = new PenghuniIntensif(idPenghuni, nama, usia, noTelp,
                    jenisKelamin, kondisi, namaPerawat, kontrolMedis, jadwalObat);
            daftarPenghuni.add(pi);

        } else if (jenis == 3) {
            System.out.print("Nama Perawat: ");
            String namaPerawat = scanner.nextLine();

            System.out.print("Jadwal Kontrol Medis: ");
            String kontrolMedis = scanner.nextLine();

            System.out.print("Jadwal Pemberian Obat: ");
            String jadwalObat = scanner.nextLine();

            System.out.print("Tingkat Ketergantungan: ");
            String tingkatKetergantungan = scanner.nextLine();

            System.out.print("Jadwal Ubah Posisi Tidur: ");
            String ubahPosisi = scanner.nextLine();

            PenghuniBedridden pb = new PenghuniBedridden(idPenghuni, nama, usia, noTelp,
                    jenisKelamin, kondisi, namaPerawat, kontrolMedis, jadwalObat,
                    tingkatKetergantungan, ubahPosisi);
            daftarPenghuni.add(pb);
        }

        System.out.println("\n====================================================");
        System.out.println("======= DATA PENGHUNI BARU BERHASIL DITAMBAH =======");
        System.out.println("====================================================\n");
    }

    // TAMPILKAN PENGHUNI
    public void tampilkanPenghuni() {
        if (daftarPenghuni.isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
            System.out.println("====================================================\n");
            return;
        }

        System.out.println("\n====================================================");
        System.out.println("============== PILIH KATEGORI PENGHUNI =============");
        System.out.println("====================================================");
        System.out.println("| 1. Tampilkan Seluruh Data Penghuni               |");
        System.out.println("| 2. Tampilkan Data Penghuni Mandiri               |");
        System.out.println("| 3. Tampilkan Data Penghuni Intensif              |");
        System.out.println("| 4. Tampilkan Data Penghuni Bedridden             |");
        System.out.println("| 5. Kembali Ke Menu Utama                         |");
        System.out.println("====================================================");

        int pilihan = Validasi.bacaInt(scanner, "\nPilih Kategori (1-5): ");

        if (!Validasi.validasiPilihanMenu(pilihan, 5) || pilihan == 5) {
            return;
        }

        boolean adaData = false;

        System.out.println("\n====================================================");
        if (pilihan == 1) {
            System.out.println("=========== SELURUH DATA PENGHUNI PANTI ============");
        } else if (pilihan == 2) {
            System.out.println("============ DATA PENGHUNI PANTI MANDIRI ===========");
        } else if (pilihan == 3) {
            System.out.println("=========== DATA PENGHUNI PANTI INTENSIF ===========");
        } else if (pilihan == 4) {
            System.out.println("========== DATA PENGHUNI PANTI BEDRIDDEN ===========");
        }
        System.out.println("====================================================");

        for (PenghuniPanti p : daftarPenghuni) {
            if (pilihan == 1) {
                p.tampilkanInfo();
                System.out.println("====================================================");
                adaData = true;
            } else if (pilihan == 2 && p instanceof PenghuniMandiri) {
                p.tampilkanInfo();
                System.out.println("====================================================");
                adaData = true;
            } else if (pilihan == 3 && p.getClass() == PenghuniIntensif.class) {
                p.tampilkanInfo();
                System.out.println("====================================================");
                adaData = true;
            } else if (pilihan == 4 && p instanceof PenghuniBedridden) {
                p.tampilkanInfo();
                System.out.println("====================================================");
                adaData = true;
            }
        }

        if (!adaData) {
            System.out.println("======== TIDAK ADA DATA UNTUK KATEGORI INI =========");
        }
        System.out.println("====================================================\n");
    }

    // HAPUS PENGHUNI
    public void hapusPenghuni() {
        if (daftarPenghuni.isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
            System.out.println("====================================================\n");
            return;
        }

        int idTarget = Validasi.bacaInt(scanner, "Masukkan ID Penghuni yang ingin dihapus: ");

        if (!Validasi.validasiHapusPenghuni(idTarget, this)) {
            return;
        }

        for (int i = 0; i < daftarPenghuni.size(); i++) {
            if (daftarPenghuni.get(i).getIdPenghuni() == idTarget) {
                daftarPenghuni.remove(i);
                System.out.println("\n====================================================");
                System.out.println("========== DATA PENGHUNI BERHASIL DIHAPUS! =========");
                System.out.println("====================================================\n");
                break;
            }
        }
    }

    // UPDATE PENGHUNI
    public void updatePenghuni() {
        if (daftarPenghuni.isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
            System.out.println("====================================================\n");
            return;
        }

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n====================================================");
            System.out.println("========= UPDATE DATA PENGHUNI RUMAH SENJA =========");
            System.out.println("====================================================");
            System.out.println("| 1. Update Umur Penghuni                          |");
            System.out.println("| 2. Update Kondisi Penghuni                       |");
            System.out.println("| 3. Update Informasi Khusus Penghuni Mandiri      |");
            System.out.println("| 4. Update Informasi Khusus Penghuni Intensif     |");
            System.out.println("| 5. Update Informasi Khusus Penghuni Bedridden    |");
            System.out.println("| 6. Kembali Ke Menu Utama                         |");
            System.out.println("====================================================");

            int pilihan = Validasi.bacaInt(scanner, "\nPilih Menu (1-6): ");

            if (!Validasi.validasiPilihanMenu(pilihan, 6)) {
                continue;
            }

            switch (pilihan) {
                case 1 -> {
                    int idTarget = Validasi.bacaInt(scanner, "Masukkan ID Penghuni: ");
                    PenghuniPanti p = cariByObjekId(idTarget);
                    if (p != null) {
                        int usiaBaru;
                        do {
                            usiaBaru = Validasi.bacaInt(scanner, "Update Usia Penghuni: ");
                        } while (!Validasi.validasiUsia(usiaBaru));

                        p.setUsia(usiaBaru);
                        System.out.println("\n====================================================");
                        System.out.println("===== USIA PENGHUNI PANTI BERHASIL DIPERBARUI ======");
                        System.out.println("====================================================\n");
                    } else {
                        System.out.println("\n====================================================");
                        System.out.println("======= ERROR: ID PENGHUNI TIDAK DITEMUKAN! ========");
                        System.out.println("====================================================\n");
                    }
                }

                case 2 -> {
                    int idTarget = Validasi.bacaInt(scanner, "Masukkan ID Penghuni: ");
                    PenghuniPanti p = cariByObjekId(idTarget);
                    if (p != null) {
                        String kondisiBaru;
                        do {
                            System.out.print("Update Kondisi Terbaru Penghuni: ");
                            kondisiBaru = scanner.nextLine();
                        } while (!Validasi.validasiKondisi(kondisiBaru));
                        
                        p.setKondisi(kondisiBaru);
                        System.out.println("\n====================================================");
                        System.out.println("== KONDISI KESEHATAN PENGHUNI BERHASIL DIPERBARUI ==");
                        System.out.println("====================================================\n");
                    } else {
                        System.out.println("\n====================================================");
                        System.out.println("======= ERROR: ID PENGHUNI TIDAK DITEMUKAN! ========");
                        System.out.println("====================================================\n");
                    }
                }

                case 3 -> {
                    int idTarget = Validasi.bacaInt(scanner, "Masukkan ID Penghuni Mandiri: ");
                    PenghuniPanti p = cariByObjekId(idTarget);

                    if (p instanceof PenghuniMandiri pm) {
                        System.out.print("Masukkan Kegiatan Harian Baru: ");
                        String kegiatanBaru = scanner.nextLine();
                        pm.setKegiatanHarian(kegiatanBaru);

                        System.out.println("\n====================================================");
                        System.out.println("======= KEGIATAN HARIAN BERHASIL DIPERBARUI! =======");
                        System.out.println("====================================================\n");
                    } else {
                        System.out.println("\n====================================================");
                        System.out.println("============= ERROR: ID TIDAK DITEMUKAN ============");
                        System.out.println("====================================================\n");
                    }
                }

                case 4 -> {
                    int idTarget = Validasi.bacaInt(scanner, "Masukkan ID Penghuni Intensif: ");
                    PenghuniPanti p = cariByObjekId(idTarget);

                    if (p instanceof PenghuniIntensif pi) {
                        System.out.print("Masukkan Jadwal Obat Baru: ");
                        String obatBaru = scanner.nextLine();
                        pi.setJadwalObat(obatBaru);
                        
                        System.out.print("Masukkan Jadwal Kontrol Medis Terbaru: ");
                        String kontrolBaru = scanner.nextLine();
                        pi.setKontrolMedis(kontrolBaru);

                        System.out.println("\n====================================================");
                        System.out.println("====== INFORMASI TERBARU BERHASIL DIPERBARUI! ======");
                        System.out.println("====================================================\n");
                    } else {
                        System.out.println("\n====================================================");
                        System.out.println("============ ERROR: ID TIDAK DITEMUKAN ============");
                        System.out.println("====================================================\n");
                    }
                }

                case 5 -> {
                    int idTarget = Validasi.bacaInt(scanner, "Masukkan ID Penghuni Bedridden: ");
                    PenghuniPanti p = cariByObjekId(idTarget);

                    if (p instanceof PenghuniBedridden pb) {
                        System.out.print("Masukkan Tingkat Ketergantungan Baru: ");
                        String tingkatBaru = scanner.nextLine();
                        pb.setTingkatKetergantungan(tingkatBaru);
                        
                        System.out.print("Masukkan Jadwal Ubah Posisi Tidur Baru: ");
                        String posisiBaru = scanner.nextLine();
                        pb.setUbahPosisi(posisiBaru);

                        System.out.println("\n====================================================");
                        System.out.println("====== INFORMASI BEDRIDDEN BERHASIL DIPERBARUI! ====");
                        System.out.println("====================================================\n");
                    } else {
                        System.out.println("\n====================================================");
                        System.out.println("============ ERROR: ID TIDAK DITEMUKAN ============");
                        System.out.println("====================================================\n");
                    }
                }

                case 6 -> berjalan = false;
            }
        }
    }

    // CARI PENGHUNI
    public void cariPenghuni() {
        if (daftarPenghuni.isEmpty()) {
            System.out.println("\n====================================================");
            System.out.println("========== BELUM ADA DATA PENGHUNI PANTI ===========");
            System.out.println("====================================================\n");
            return;
        }

        System.out.print("Masukkan Nama Penghuni Panti: ");
        String namaTarget = scanner.nextLine();

        boolean ditemukan = false;

        for (PenghuniPanti p : daftarPenghuni) {
            if (p.getNama().equalsIgnoreCase(namaTarget)) {
                if (!ditemukan) {
                    System.out.println("\n====================================================");
                    System.out.println("============== HASIL PENCARIAN PENGHUNI ============");
                    System.out.println("====================================================");
                }
                p.tampilkanInfo();
                ditemukan = true;
            }
        }
        if (ditemukan) {
            System.out.println("====================================================\n");
        } else {
            System.out.println("\n===========================================================");
            System.out.println("==== ERROR: DATA DENGAN NAMA TERSEBUT TIDAK DITEMUKAN! ====");
            System.out.println("===========================================================\n");
        }
    }

    private PenghuniPanti cariByObjekId(int idPenghuni) {
        for (PenghuniPanti p : daftarPenghuni) {
            if (p.getIdPenghuni() == idPenghuni) {
                return p;
            }
        }
        return null;
    }
}