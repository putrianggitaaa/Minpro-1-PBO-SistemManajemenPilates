package servicee;

import java.util.ArrayList;
import java.util.Scanner;

import model.Member;
import model.KelasPilates;
import model.JenisKelas;
import model.Instruktur;

public class Service {

    private ArrayList<Member> daftarMember;
    private ArrayList<Instruktur> daftarInstruktur;
    private ArrayList<JenisKelas> daftarJenisKelas;
    private ArrayList<KelasPilates> daftarKelas;

    private Scanner scanner;

    // Constructor
    public Service(Scanner scanner) {

        this.daftarMember = new ArrayList<>();
        this.daftarInstruktur = new ArrayList<>();
        this.daftarJenisKelas = new ArrayList<>();
        this.daftarKelas = new ArrayList<>();

        this.scanner = scanner;

   
        daftarMember.add(new Member(
                "M001", "Gita", "0852458335528", 20
        ));

        daftarInstruktur.add(new Instruktur(
                "I001", "Davi", "Mat Pilates", "081234567890"
        ));

        daftarJenisKelas.add(new JenisKelas(
                "P001", "Mat Pilates", "Beginner", "60 Menit"
        ));

        daftarKelas.add(new KelasPilates(
                "K001","M001" , "I001", "P001", "Kamis, 10 September 2026 16.00" 
        ));
        
    }


    public void tambahMember(){
        System.out.print("ID Member: "); 
        String idMember = scanner.nextLine();

        System.out.print("Nama: "); 
        String namaMember = scanner.nextLine();

        System.out.print("No Telepon: "); 
        String noTelepon = scanner.nextLine();
        
        System.out.print("Usia: "); 
        int usia = scanner.nextInt();
        scanner.nextLine();
        
        Member memberBaru = new Member(idMember, namaMember, noTelepon, usia);

        daftarMember.add(memberBaru);

        System.out.println(">> Selamat Bergabung, GeetsMates ^'^!");
    }
    
    public void lihatMember() {

        for (int i = 0; i < daftarMember.size(); i++) {

            Member M = daftarMember.get(i);

            System.out.println("ID Member: " + M.getIdMember());
            System.out.println("Nama Member: " + M.getNamaMember());
            System.out.println("No Telepon: " + M.getNoTelepon());
            System.out.println("Usia: " + M.getUsia());
            System.out.println("--------------------------------");
        }
    }

    public void tambahInstruktur(){
        System.out.print("ID Instruktur: "); 
        String idInstruktur = scanner.nextLine();

        System.out.print("Nama: "); 
        String namaInstruktur = scanner.nextLine();

        System.out.print("Spesialisasi: "); 
        String spesialisasi = scanner.nextLine();
        
        System.out.print("noTelepon: "); 
        String noTelepon = scanner.nextLine();
        
        Instruktur InstrukturBaru = new Instruktur(idInstruktur, namaInstruktur, spesialisasi, noTelepon);

        daftarInstruktur.add(InstrukturBaru);

        System.out.println(">> Selamat Bergabung, Instruktur GeetsMates! ^'^");
    }
    
    public void lihatInstruktur() {

        for (int i = 0; i < daftarInstruktur.size(); i++) {

            Instruktur I = daftarInstruktur.get(i);

            System.out.println("ID Instruktur: " + I.getIdInstruktur());
            System.out.println("Nama Instruktur: " + I.getNamaInstruktur());
            System.out.println("Spesialisasi: " + I.getSpesialisasi());
            System.out.println("No Telepon: " + I.getNoTelepon());
            System.out.println("--------------------------------");
        }
    }
    public void tambahJenisKelas(){
        System.out.print("ID Jenis: "); 
        String idJenis = scanner.nextLine();

        System.out.print("Nama Pilates: "); 
        String namaJenis = scanner.nextLine();

        System.out.print("Level: "); 
        String level = scanner.nextLine();
        
        System.out.print("Durasi: "); 
        String durasi = scanner.nextLine();
        
        JenisKelas JenisBaru = new JenisKelas(idJenis, namaJenis, level, durasi);

        daftarJenisKelas.add(JenisBaru);

        System.out.println(">> Selamat Menikmati Jenis Kelas Baru, GeetsMates!");
    }
    
      public void lihatJenisKelas() {

        for (int i = 0; i < daftarJenisKelas.size(); i++) {

            JenisKelas J = daftarJenisKelas.get(i);

            System.out.println("ID Jenis: " + J.getIdJenis());
            System.out.println("Nama Jenis: " + J.getNamaJenis());
            System.out.println("Level: " + J.getLevel());
            System.out.println("Durasi: " + J.getDurasi());
            System.out.println("--------------------------------");
        }
    }
    

    public void lihatPendaftarKelas() {

        for (int i = 0; i < daftarKelas.size(); i++) {

            KelasPilates K = daftarKelas.get(i);

            String namaMember = "";
            String namaInstruktur = "";
            String namaJenis = "";

            for (Member M : daftarMember) {
                if (M.getIdMember().equals(K.getIdMember())) {
                    namaMember = M.getNamaMember();
                    break;
            }
        }

            for (Instruktur I : daftarInstruktur) {
                if (I.getIdInstruktur().equals(K.getIdInstruktur())) {
                    namaInstruktur = I.getNamaInstruktur();
                    break;
            }
        }

            for (JenisKelas J : daftarJenisKelas) {
                if (J.getIdJenis().equals(K.getIdJenis())) {
                    namaJenis = J.getNamaJenis();
                    break;
            }
        }

            System.out.println("ID Kelas       : " + K.getIdKelas());
            System.out.println("Nama Member    : " + namaMember);
            System.out.println("Nama Instruktur: " + namaInstruktur);
            System.out.println("Jenis Pilates  : " + namaJenis);
            System.out.println("Waktu          : " + K.getWaktu());
            System.out.println("--------------------------------");
    }
}
    public void tambahKelas() {
        System.out.println("\n========================================");
        System.out.println("         Lihat Daftar GeetsMates          ");
        System.out.println("==========================================");
        lihatMember();

        System.out.print("Pilih ID Member: ");
        String idMember = scanner.nextLine();

        Member memberDipilih = null;

        for (Member M : daftarMember) {
            if (M.getIdMember().equals(idMember)) {
                memberDipilih = M;
                break;
        }
    }

        if (memberDipilih == null) {
            System.out.println(">> Daftarkan Member Dulu Yaa!");
            return;
    }


        System.out.println("\n========================================");
        System.out.println("       Lihat Jenis Kelas GeetsMates       ");
        System.out.println("==========================================");
        lihatJenisKelas();

        System.out.print("Pilih ID Jenis: ");
        String idJenis = scanner.nextLine();

        JenisKelas jenisDipilih = null;

        for (JenisKelas J : daftarJenisKelas) {
            if (J.getIdJenis().equals(idJenis)) {
                jenisDipilih = J;
                break;
        }
    }

        if (jenisDipilih == null) {
            System.out.println(">> Sorry, Jenis Kelas Belum Tersedia Yaa!");
            return;
    }

        System.out.println("\n========================================");
        System.out.println("       Lihat Instruktur GeetsMates        ");
        System.out.println("==========================================");
        lihatInstruktur();

        System.out.print("Pilih ID Instruktur: ");
        String idInstruktur = scanner.nextLine();

        Instruktur instrukturDipilih = null;

        for (Instruktur I : daftarInstruktur) {
            if (I.getIdInstruktur().equals(idInstruktur)) {
                instrukturDipilih = I;
                break;
        }
    }

        if (instrukturDipilih == null) {
            System.out.println(">> Instruktur tidak ditemukan!");
            return;
    }


        System.out.print("ID Kelas: ");
        String idKelas = scanner.nextLine();

        System.out.print("Waktu: ");
        String waktu = scanner.nextLine();

        KelasPilates kelasBaru = new KelasPilates(idKelas,idMember,idInstruktur,idJenis,waktu);

        daftarKelas.add(kelasBaru);

        System.out.println("\n>> Selamat Mengikuti Kelas, GeetMates!");
        System.out.println("Member     : " + memberDipilih.getNamaMember());
        System.out.println("Jenis      : " + jenisDipilih.getNamaJenis());
        System.out.println("Instruktur : " + instrukturDipilih.getNamaInstruktur());
        System.out.println("Waktu      : " + waktu);
}

    public void hapusDaftarKelas(){
        System.out.print("Masukkan ID Kelas: ");
        String idKelas = scanner.nextLine();

        for(int i = 0; i < daftarKelas.size(); i++){
            if(daftarKelas.get(i).getIdKelas().equals(idKelas)) {    
                daftarKelas.remove(i);
                System.out.println(">> Sampai Ketemu Lagi, GeetsMates!");
                break;
            }
        }
    }

    public void updateKelas() {

        System.out.print("Masukkan ID Kelas: ");
        String idKelas = scanner.nextLine();

        for (KelasPilates K : daftarKelas) {

            if (K.getIdKelas().equals(idKelas)) {

                System.out.print("ID Instruktur Baru: ");
                String idInstruktur = scanner.nextLine();

                System.out.print("ID Jenis Baru: ");
                String idJenis = scanner.nextLine();

                System.out.print("Waktu Baru: ");
                String waktu = scanner.nextLine();

                K.setIdInstruktur(idInstruktur);
                K.setIdJenis(idJenis);
                K.setWaktu(waktu);

                System.out.println(">> See You di Kelas Terbaru, GeetsMates!");
                return;
        }
    }

    System.out.println(">> Sorry, Ketik Nomor Menu dengan Benar Yaa!!");
}
}