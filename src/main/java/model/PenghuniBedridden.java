
package model;


public class PenghuniBedridden extends PenghuniIntensif {
    
    // ENCAPSULATION
    private String tingkatKetergantungan;
    private String ubahPosisi;
    
    // CONSTRUCTOR
    public PenghuniBedridden(int idPenghuni, String nama, int usia, String noTelp, 
            String jenisKelamin, String kondisi, String namaPerawat, String kontrolMedis, 
            String jadwalObat, String tingkatKetergantungan, String ubahPosisi) {
        super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi, namaPerawat, kontrolMedis, jadwalObat);        
        this.tingkatKetergantungan = tingkatKetergantungan;
        this.ubahPosisi = ubahPosisi;
    }

    // GETTER

    public String getTingkatKetergantungan() {
        return tingkatKetergantungan;
    }
    public String getUbahPosisi() {
        return ubahPosisi;
    }
    
    // SETTER
    public void setTingkatKetergantungan(String tingkatKetergantungan) {
        this.tingkatKetergantungan = tingkatKetergantungan;
    }
    public void setUbahPosisi(String ubahPosisi) {
        this.ubahPosisi = ubahPosisi;
    }

    // POLYMORPHISM
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tingkat Ketergantungan   : " + tingkatKetergantungan);
        System.out.println("Jadwal Ubah Posisi Tidur : " + ubahPosisi);
    }
}