# Sistem Manajemen Pilates - Geets Pilates Studio
**Putri Anggita Melasari | 2509116010**

## Deskripsi Program
Sistem Manajemen Pilates Geets Pilates Studio merupakan sebuah program yang dirancang untuk membantu proses pengelolaan data pada sebuah studio Pilates secara sederhana. Program ini menyediakan beberapa menu yang dapat digunakan untuk mengelola informasi terkait Member, Instruktur, Jenis Kelas, dan Data Kelas Pilates. Sistem ini dapat membantu pengelola untuk memanajemen proses bisnis yang terdapat dalam Geets Pilates Studio.

## Class yang Terdapat dalam Program
Terdapat beberapa class yang ada di dalam sistem ini yaitu sebagai berikut:

### 1. Pilates.java
Pilates.java adalah class utama  atau entry point dari program. Class ini digunakan untuk menjalankan sistem. Pilates.java menampilkan menu utama kepada pengguna, menerima input pilihan menu, kemudian menjalankan proses sesuai dengan pilihan yang diberikan.

### 2. Member.java
Member.java adalah class model yang berisi data member atau pelanggan yang terdaftar. Atribut yang berada dalam class ini, yaitu:
* ID Member
* Nama Member
* Nomor Telepon
* Usia

### 3. Instruktur.java
Instruktur.java adalah class model yang berisi data instruktur yang bekerja di studio. Atribut yang berada dalam class ini, yaitu:
* ID Instruktur
* Nama Instruktur
* Spesialisasi
* Nomor Telepon

### 4. JenisKelas.java 
JenisKelas.java adalah class model yang berisi data jenis kelas yang terdaftar. Atribut yang berada dalam class ini, yaitu:
* ID jenis
* Nama Kelas
* Level
* Durasi

### KelasPilates.java
KelasPilates.java adalah class model yang berisi data kelas yang akan dilaksanakan beserta member yang melaksanakan kelas, instruktur yang memandu kelas, serta jenis kelas nya. Class ini juga memuat waktu kapan kelas tersebut dilaksanakan. Atribut yang berada dalam class ini, yaitu: 
* ID Kelas
* ID Member
* ID Instruktur
* ID Jenis
* Waktu

## Alur Program
Alur program dimulai ketika pengguna menjalankan program melalui class Pilates.java sebagai class utama. Setelah program dijalankan, sistem akan menampilkan halaman utama  yang berisi beberapa pilihan menu.
Pengguna dapat memilih menu dengan menginput angka sesuai dengan pilihan yang tersedia. Sistem kemudian menggunakan percabangan switch-case untuk menentukan proses yang akan dijalankan.

Jika pengguna memilih menu Member, sistem akan mengarahkan pengguna ke proses lihat atau tambah data member. Jika memilih Instruktur, sistem akan mengarahkan pengguna ke proses lihat atau tambah data instruktur. Jika memilih Jenis Kelas, sistem akan mengarahkan pengguna ke proses lihat atau tambah data Jenis Kelas. Apabila pengguna memilih menu daftar kelas, maka akan diarahkan ke lihat daftar kelas yang sudah ada, menambahkan daftar kelas baru, menghapus daftar kelas yang sudah ada, dan melakukan update pada data daftar kelas. 

Program akan terus berjalan dan menampilkan kembali menu utama selama pengguna belum memilih menu Keluar. Dengan demikian, pengguna dapat melakukan beberapa proses pengelolaan data dalam satu kali menjalankan program.

## Dokumentasi Program
### **1. Tampilan Menu Utama**
<img width="582" height="290" alt="image" src="https://github.com/user-attachments/assets/f7e0f430-52be-4863-82c7-5c29a8bd264a" />

Pada bagian ini pengguna akan diberikan beberapa pilihan menu yang dapat digunakan untuk mengelola data. Terdapat menu member yang berfungsi untuk mengelola data member, menu Instruktur yang digunakan untuk mengelola data instruktur, menu jenis kelas yang digunakan untuk mengelola jenis kelas yang tersedia, serta menu pendaftaran kelas yang digunakan untuk mengelola daftar kelas yang akan dilaksanakan di studio pilates ini.

### **2. Menu Member**


<img width="535" height="312" alt="image" src="https://github.com/user-attachments/assets/f145f8b9-6919-4280-bbfe-b72f2a71c75d" />

Menu member berisi 2 sub menu yaitu lihat dan tambah member yang fungsinya sebagai berikut:


* **Tambah Member**
<img width="538" height="341" alt="image" src="https://github.com/user-attachments/assets/51897b33-2469-4e2a-bc3e-ecd24067e0eb" />

Pada sub menu ini, pengguna dapat menambahkan member baru yang akan bergabung untuk mengikuti kelas di studio dengan memasukkan ID member, nama member, nomor telepon, dan usia member tersebut.


* **Lihat Member**
<img width="517" height="435" alt="image" src="https://github.com/user-attachments/assets/a29c88ee-644e-4b8a-ab31-5fb7316f6d5e" />

Pada sub menu ini, pengguna dapat melihat daftar member yang telah terdaftar pada sistem.


* **Kembali**
<img width="537" height="317" alt="image" src="https://github.com/user-attachments/assets/b8cec285-b1d2-4c33-8e58-194ee1aa4304" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.


### **2. Menu Instruktur**
<img width="536" height="306" alt="image" src="https://github.com/user-attachments/assets/183026db-28fd-4370-83c9-00f35278690f" />

Menu instruktur berisi 2 sub menu yaitu lihat dan tambah instruktur yang fungsinya sebagai berikut:


* **Tambah Instruktur**
<img width="635" height="333" alt="image" src="https://github.com/user-attachments/assets/ce565a18-6147-4eec-b600-32491ca24cb6" />

Pada sub menu ini, pengguna dapat menambahkan instruktur baru yang akan bergabung untuk memandu kelas di studio dengan memasukkan ID instruktur, nama instruktur, spesialisasi, dan nomor telepon instruktur tersebut.


* **Lihat Instruktur**
<img width="508" height="433" alt="image" src="https://github.com/user-attachments/assets/32bbd639-f7f1-480d-b6ae-f47dab2dbb0d" />

Pada sub menu ini, pengguna dapat melihat daftar instruktur yang telah terdaftar pada sistem.


* **Kembali**
<img width="546" height="367" alt="image" src="https://github.com/user-attachments/assets/76478418-4dd6-4598-a761-1f9ac7fb8dfd" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.


### **3. Menu Jenis Kelas**
<img width="527" height="308" alt="image" src="https://github.com/user-attachments/assets/13fe85f0-b6f9-49be-9cc5-7b6e589a9bde" />

Menu jenis kelas berisi 2 sub menu yaitu lihat dan tambah jenis kelas yang fungsinya sebagai berikut:


* **Tambah Jenis Kelas**
<img width="672" height="337" alt="image" src="https://github.com/user-attachments/assets/21302c52-bfd1-4b16-ad01-fff0945557ce" />

Pada sub menu ini, pengguna dapat menambahkan jenis kelas baru yang akan diadakan di studio dengan memasukkan ID jenis, nama pilates, level, dan durasi jenis kelas tersebut.


* **Lihat Jenis Kelas**
<img width="531" height="442" alt="image" src="https://github.com/user-attachments/assets/8f569e0b-4426-45fe-8e5d-1cfd502d3b4c" />

Pada sub menu ini, pengguna dapat melihat daftar jenis kelas yang telah terdaftar pada sistem.


* **Kembali**
<img width="566" height="376" alt="image" src="https://github.com/user-attachments/assets/49edb120-73a7-4c3c-a465-dc10d6548ca6" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.


### **4. Pendaftaran Kelas**
<img width="537" height="372" alt="image" src="https://github.com/user-attachments/assets/3f9d282c-942c-43ad-9b34-f7f6a5c5f1be" />

Menu pendaftaran kelas berisi 4 sub menu yaitu lihat, tambah, hapus, dan perbarui daftar kelas yang fungsinya sebagai berikut:


* **Lihat Daftar Kelas**
<img width="641" height="375" alt="image" src="https://github.com/user-attachments/assets/b327fb56-d4b3-48aa-881d-49a6ff5537e9" />

Pada sub menu ini, pengguna dapat melihat daftar kelas yang telah terdaftar pada sistem dan siap untuk dilaksanakan pada studio. Data ini berisi identitas member yang melaksanakan kelas, instruktur yang memandu kelas, jenis kelas yang dilaksanakan dan waktunya.


* **Pendaftaran Kelas**
<img width="545" height="195" alt="image" src="https://github.com/user-attachments/assets/170f6379-c89c-4dd6-bb33-7b41efa2f044" />

Pada sub menu ini, sistem akan menampilkan id member, id instruktur, dan id jenis kelas agar pengguna dapat memilih member, instruktur, dan jenis kelas apa yang ingin ditambahkan. Setelah itu, akan muncul output dimana kelas berhasil ditambahkan dan tertera identitas member, instruktur, dan jenis kelas yang akan dilaksanakan.


* **Hapus Kelas**
<img width="538" height="255" alt="image" src="https://github.com/user-attachments/assets/24dfaedb-50a7-47ae-87a3-8f76cbaa25e4" />

Pada sub menu ini, sistem akan mengarahkan pengguna untuk menginput ID kelas yang akan dihapus. Selanjutnya, sistem akan menghapus kelas sesuai dengan ID yang di input oleh pengguna. Sub menu ini dapat digunakan apabila sesi kelas telah selesai dilaksanakan dan member tidak ingin memperpanjang sesi kelas nya kembali.


* **Update Kelas**
<img width="560" height="352" alt="image" src="https://github.com/user-attachments/assets/f6b7e4e7-184d-49ea-a8a2-372fe30b31e6" />

Pada sub menu ini, sistem akan memngarahkan pengguna untuk menginput ID kelas yang ingin diperbarui terlebih dahulu. Selanjutnya, pengguna dapat memasukkan ID instruktur yang baru, ID jenis, dan waktu yang telah diperbarui. Sub menu ini dapat digunakan apabila member ingin memperpanjang sesi kelasnya sehingga cukup di update dan tidak perlu menambahkan jadwal baru.


* **Kembali**
<img width="558" height="330" alt="image" src="https://github.com/user-attachments/assets/c67a9821-a226-467c-9f92-7e91ff95c6d7" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.


### **Keluar**
<img width="587" height="491" alt="image" src="https://github.com/user-attachments/assets/70d8bf4c-c7f2-4f02-bcbe-39b0d4d8a9e2" />

Pada menu ini, pengguna akan diarahkan untuk keluar dari sistem.


## Penerapan Nilai Tambah 
Terdapat dua nilai tambah yang diterapkan dalam program, yaitu sebagai berikut:


### 1. Access Modifier
Sistem ini menerapkan access modifier untuk mengatur tingkat akses terhadap entitas yang ada, khusunya entitas yang sifatnya adalah data pribadi seperti class Member dan Instruktur yang di private. Akses terhadap data-data tersebut dapat dikontrol melalui method Getter dan Setter


### 2. Encapsulation
Sistem ini menerapkan konsep encapsulation dengan membatasi akses langsung terhadap atribut tersebut. Atribut dibuat menggunakan access modifier private, kemudian diakses atau diubah melalui getter dan setter. Penerapan ini membantu menjaga keamanan data pada class seperti Member, Instruktur, JenisKelas, dan KelasPilates.
