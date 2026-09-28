package model;

public class PenghuniMandiri extends PenghuniPanti {
    
    // ENCAPSULATION
    private String hobi;
    private String kegiatanHarian;
    
    // CONSTRUCTOR
    public PenghuniMandiri(int idPenghuni, String nama, int usia, String noTelp, 
            String jenisKelamin, String kondisi, String hobi, String kegiatanHarian) {
        super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi);
        this.hobi = hobi;
        this.kegiatanHarian = kegiatanHarian;
    }

    // GETTER
    public String getHobi() {
        return hobi;
    }
    public String getKegiatanHarian() {
        return kegiatanHarian;
    }
    
    // SETTER
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
    public void setKegiatanHarian(String kegiatanHarian) {
        this.kegiatanHarian = kegiatanHarian;
    }
    
    // POLYMORPHISM
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Hobi                     : " + hobi);
        System.out.println("Kegiatan Harian          : " + kegiatanHarian);
    }
}