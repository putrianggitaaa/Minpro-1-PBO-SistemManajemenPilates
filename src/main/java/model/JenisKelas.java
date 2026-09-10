package model;

public class JenisKelas {

    private String idJenis;
    private String namaJenis;
    private String level;
    private String durasi;

    public JenisKelas(String idJenis, String namaJenis, String level, String durasi) {
        this.idJenis = idJenis;
        this.namaJenis = namaJenis;
        this.level = level;
        this.durasi = durasi;
    }
    
     public String getIdJenis() {
        return idJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public String getLevel() {
        return level;
    }

    public String getDurasi() {
        return durasi;
    }
}