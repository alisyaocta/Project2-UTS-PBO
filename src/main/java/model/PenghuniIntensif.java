package model;

public class PenghuniIntensif extends PenghuniPanti {
    
    // ENCAPSULATION   
    private String namaPerawat;
    private String kontrolMedis;
    private String jadwalObat;
    
    // CONSTRUCTOR
    public PenghuniIntensif(int idPenghuni, String nama, int usia, String noTelp, 
            String jenisKelamin, String kondisi, String namaPerawat, String kontrolMedis, String jadwalObat) {
        super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi);
        this.namaPerawat = namaPerawat;
        this.kontrolMedis = kontrolMedis;
        this.jadwalObat = jadwalObat;
    }
    
    // GETTER
    public String getNamaPerawat() {
        return namaPerawat;
    }    
    public String getKontrolMedis() {
        return kontrolMedis;
    }
    public String getJadwalObat() {
        return jadwalObat;
    }
    
    // SETTER
    public void setNamaPerawat(String namaPerawat) {
        this.namaPerawat = namaPerawat;
    }
    public void setKontrolMedis(String kontrolMedis) {
        this.kontrolMedis = kontrolMedis;
    }
    public void setJadwalObat(String jadwalObat) {
        this.jadwalObat = jadwalObat;
    }
    
    // POLYMORPHISM
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Perawat             : " + namaPerawat);
        System.out.println("Jadwal Kontrol Medis     : " + kontrolMedis);
        System.out.println("Jadwal Pemberian Obat    : " + jadwalObat);
    }
}