package model;

public class Member {

    private String idMember;
    private String namaMember;
    private String noTelepon;
    private int usia;

    public Member(String idMember, String namaMember, String noTelepon, int usia) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.noTelepon = noTelepon;
        this.usia = usia;
    }
    
    public String getIdMember() {
        return idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public int getUsia() {
        return usia;
    }
}