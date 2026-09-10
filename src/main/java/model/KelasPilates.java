package model;

public class KelasPilates {

    private String idKelas;
    private String idMember;
    private String idInstruktur;
    private String idJenis;
    private String waktu;

    public KelasPilates(String idKelas, String idMember,
                        String idInstruktur, String idJenis,
                        String waktu) {

        this.idKelas = idKelas;
        this.idMember = idMember;
        this.idInstruktur = idInstruktur;
        this.idJenis = idJenis;
        this.waktu = waktu;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public String getIdMember() {
        return idMember;
    }

    public String getIdInstruktur() {
        return idInstruktur;
    }

    public String getIdJenis() {
        return idJenis;
    }

    public String getWaktu() {
        return waktu;
    }

    // Setter
    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public void setIdInstruktur(String idInstruktur) {
        this.idInstruktur = idInstruktur;
    }

    public void setIdJenis(String idJenis) {
        this.idJenis = idJenis;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}