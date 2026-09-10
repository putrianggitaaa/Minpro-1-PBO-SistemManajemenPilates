package model;

public class Instruktur {

    private String idInstruktur;
    private String namaInstruktur;
    private String spesialisasi;
    private String noTelepon;

    public Instruktur(String idInstruktur, String namaInstruktur, String spesialisasi, String noTelepon) {
        this.idInstruktur = idInstruktur;
        this.namaInstruktur = namaInstruktur;
        this.spesialisasi = spesialisasi;
        this.noTelepon = noTelepon;
    }
    
    public String getIdInstruktur() {
        return idInstruktur;
    }

    public String getNamaInstruktur() {
        return namaInstruktur;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

}