# DOKUMENTASI PROJECT 2
# UJIAN TENGAH SEMESTER

---

### PEMOGRAMAN BERORIENTASI OBJEK
### SISTEM MANAJEMEN PANTI JOMPO

Nama: Alisya Octa Noor Ghina

NIM: 2509116017

---

# BAB I PENDAHULUAN

## 1.1	Deskripsi Singkat

### Deskripsi Program

**Sistem Manajemen Panti Jompo Rumah Senja** merupakan program yang dirancang untuk membantu proses pengelolaan dan pendataan penghuni panti secara lebih terstruktur dan sistematis. Program ini memungkinkan pengguna untuk mengelola informasi penghuni melalui beberapa fitur yang telah disediakan.

Fitur utama yang tersedia dalam program meliputi **menambahkan data, menampilkan data, memperbarui data, menghapus data, dan mencari data penghuni**. Pada proses pembaruan data, pengguna dapat memperbarui informasi tertentu, seperti **usia dan kondisi penghuni**. Data umum yang dikelola meliputi **ID penghuni, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan**.

Dalam program ini, penghuni panti dibedakan menjadi dua kategori, yaitu **Penghuni Intensif** dan **Penghuni Mandiri**. Penghuni Intensif merupakan penghuni yang membutuhkan pemantauan dan perawatan lebih lanjut, sehingga memiliki informasi tambahan seperti **nama perawat, jadwal kontrol medis, dan jadwal pemberian obat**. Sementara itu, Penghuni Mandiri merupakan penghuni yang masih dapat melakukan aktivitas sehari-hari secara lebih mandiri dan memiliki informasi tambahan berupa **hobi serta kegiatan harian**.

Dalam pembuatannya, program ini menerapkan beberapa konsep **Object-Oriented Programming (OOP)**, yaitu **enkapsulasi, inheritance, dan polymorphism**. Selain itu, struktur program menggunakan pola **Model-View-Controller (MVC)** untuk memisahkan pengelolaan data, interaksi pengguna, dan pengendalian alur program. Penerapan konsep-konsep tersebut bertujuan agar program memiliki struktur yang lebih terorganisir serta memudahkan proses pengembangan dan pemeliharaan kode.


## 1.2	Tujuan

Sistem Manajemen Panti Jompo dirancang dengan tujuan sebagai berikut:

- Membantu mengelola data penghuni Panti Jompo Rumah Senja secara lebih terstruktur. 
- Mempermudah dalam melakukan proses penambahan, penampilan, pembaruan, penghapusan, dan pencarian data penghuni.

## 1.3  Alur Singkat

Alur program dimulai dengan menampilkan Menu Utama yang berisi beberapa pilihan untuk mengelola data penghuni. Pengguna dapat memilih menu sesuai dengan kebutuhan, yaitu menambahkan data, menampilkan data, memperbarui data, menghapus data, dan mencari data penghuni. Setelah pengguna memilih salah satu menu, sistem akan menjalankan proses sesuai dengan pilihan tersebut.

Pada proses penambahan, penampilan, dan update data, sistem dapat menampilkan pilihan berdasarkan kategori penghuni, yaitu Penghuni Mandiri dan Penghuni Intensif. Ketika menambahkan data, sistem akan meminta pengguna untuk memasukkan informasi yang diperlukan sesuai dengan kategori penghuni yang dipilih. Setiap input yang diberikan akan melalui proses validasi untuk memastikan data yang dimasukkan sesuai dengan ketentuan program.

Setelah proses selesai, sistem akan menampilkan hasil dari proses yang dilakukan, seperti data yang berhasil ditambahkan, ditampilkan, diperbarui, dihapus, atau ditemukan. Pengguna kemudian dapat kembali ke Menu Utama untuk melakukan pengelolaan data lainnya.

Program akan terus berjalan dan menerima pilihan dari pengguna hingga pengguna memilih menu Keluar. Setelah menu tersebut dipilih, program akan mengakhiri proses dan keluar dari sistem.

---

# BAB II ALUR PROGRAM

## 2.1 Menu Utama

<img width="583" height="320" alt="image" src="https://github.com/user-attachments/assets/e4088109-ba06-4bce-aef4-f9e229b0fb41" />

Gambar di atas menampilkan Menu Utama dari program Sistem Manajemen Panti Jompo Rumah Senja. Menu ini menjadi tampilan awal yang digunakan sebagai pusat navigasi bagi pengguna dalam mengelola data penghuni panti. Terdapat beberapa pilihan menu, yaitu Tambah Data untuk menambahkan data penghuni baru, Tampilkan Data untuk melihat data penghuni yang telah tersimpan, Hapus Data untuk menghapus data penghuni, Update Data untuk memperbarui informasi penghuni, Cari Data Penghuni untuk mencari data berdasarkan informasi tertentu, serta Keluar untuk mengakhiri program.

Pengguna dapat memilih menu sesuai dengan kebutuhan pengelolaan data melalui pilihan nomor yang tersedia. Dengan adanya Menu Utama ini, proses pengelolaan data penghuni dapat dilakukan secara lebih terstruktur dan mudah digunakan.

## 2.2 Menu Tambah

<img width="381" height="136" alt="image" src="https://github.com/user-attachments/assets/de44096a-b9bc-4192-a01a-847802811053" />

Gambar di atas menampilkan Menu Tambah Data pada program Sistem Manajemen Panti Jompo Rumah Senja. Pada menu ini, pengguna dapat memilih jenis penghuni yang ingin ditambahkan, yaitu Penghuni Intensif atau Penghuni Mandiri. Setiap jenis penghuni memiliki data yang perlu diinput sesuai dengan kategorinya. Setelah pengguna memilih jenis penghuni, sistem akan meminta pengguna untuk memasukkan informasi yang diperlukan, seperti ID, nama, usia, nomor telepon, jenis kelamin, serta kondisi penghuni. Dengan adanya pilihan tersebut, data penghuni dapat dikelompokkan berdasarkan jenisnya sehingga pengelolaan data menjadi lebih terstruktur.

### 2.2.1 Tambah Data Penghuni Mandiri

<img width="583" height="325" alt="image" src="https://github.com/user-attachments/assets/ba62c8c2-1040-4cea-a132-2eddb5f569d5" />

Gambar di atas menampilkan informasi yang perlu diinput untuk menambahkan data Penghuni Mandiri. Informasi yang dimasukkan terdiri dari data umum penghuni, yaitu ID, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan. Selain itu, terdapat informasi tambahan khusus untuk Penghuni Mandiri, yaitu hobi dan kegiatan harian. Data tersebut digunakan untuk memberikan informasi yang lebih lengkap mengenai penghuni.

<img width="586" height="584" alt="image" src="https://github.com/user-attachments/assets/bd25cfc3-d2b9-483e-bd26-ad6e33cd87f3" />

Gambar di atas menunjukkan bahwa data Penghuni Mandiri berhasil ditambahkan ke dalam sistem.

### 2.2.2 Tambah Data Penghuni Intensif

<img width="584" height="344" alt="image" src="https://github.com/user-attachments/assets/154e4528-0f5e-4ef9-a545-15bf9542c45e" />

Gambar di atas menampilkan informasi yang perlu diinput untuk menambahkan data Penghuni Intensif. Informasi yang dimasukkan terdiri dari data umum penghuni, yaitu ID, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan. Selain itu, terdapat informasi tambahan khusus untuk Penghuni Intensif, yaitu nama perawat, jadwal kontrol medis, dan jadwal pemberian obat. Informasi tambahan tersebut digunakan untuk mendukung pengelolaan dan pemantauan kebutuhan khusus penghuni intensif.

<img width="589" height="641" alt="image" src="https://github.com/user-attachments/assets/7d2c5491-e8f6-45d2-8573-86ba7cd58db8" />

Gambar di atas menunjukkan bahwa data Penghuni Intensif berhasil ditambahkan ke dalam sistem.

### 2.2.2 Tambah Data Penghuni Bedridden

<img width="378" height="214" alt="image" src="https://github.com/user-attachments/assets/69ea4d6f-b268-4ed6-9106-7e95e7816e03" />

Gambar di atas menampilkan informasi yang perlu diinput untuk menambahkan data Penghuni Bedridden. Informasi yang dimasukkan terdiri dari data umum penghuni, yaitu ID, nama, usia, jenis kelamin, nomor telepon keluarga, dan kondisi kesehatan. Selain itu, terdapat informasi tambahan khusus untuk Penghuni Intensif, yaitu nama perawat, jadwal kontrol medis, dan jadwal pemberian obat, serta informais tambahan lagi untuk Penghuni Bedridden, yaitu tingkat ketergantungan dan jadwal ubah posisi. Informasi tambahan tersebut digunakan untuk mendukung pengelolaan dan pemantauan kebutuhan khusus penghuni bedridden.

<img width="371" height="239" alt="image" src="https://github.com/user-attachments/assets/f639af37-619b-423a-a249-885b0ae658c1" />

Gambar di atas menunjukkan bahwa data Penghuni Bedridden berhasil ditambahkan ke dalam sistem.

## 2.3 Menu Tampilkan

<img width="592" height="273" alt="image" src="https://github.com/user-attachments/assets/75427902-e45b-49a5-8324-47cd3aba0469" />

Gambar di atas menampilkan Menu Tampilkan Data pada program Sistem Manajemen Panti Jompo Rumah Senja. Pada menu ini, pengguna dapat memilih jenis data yang ingin ditampilkan, yaitu seluruh data penghuni, data Penghuni Mandiri, atau data Penghuni Intensif. Pilihan tersebut memudahkan pengguna dalam melihat data sesuai dengan kebutuhan.

### 2.3.1 Tampilkan Seluruh Data Penghuni

<img width="392" height="580" alt="image" src="https://github.com/user-attachments/assets/8e19dc88-0484-4854-9ca1-63ee3215061b" />

Gambar di atas menunjukkan seluruh data penghuni Panti Jompo Rumah Senja, yang terdiri dari Penghuni Mandiri, Penghuni Intensif, dan Penghuni Bedridden. Ketika pengguna memilih menu untuk menampilkan seluruh data, sistem akan menampilkan informasi dari kedua jenis penghuni tersebut.

### 2.3.2 Tampilkan Data Penghuni Intensif

<img width="591" height="377" alt="image" src="https://github.com/user-attachments/assets/de304a99-03db-4577-bd91-49f1c1c032cd" />

Gambar di atas menunjukkan data Penghuni Intensif. Ketika pengguna memilih menu ini, sistem hanya akan menampilkan informasi penghuni yang termasuk dalam kategori Penghuni Intensif, sehingga data dapat dilihat secara lebih spesifik sesuai dengan jenis penghuni yang dipilih.

### 2.3.3 Tampilkan Data Penghuni Mandiri

<img width="588" height="348" alt="image" src="https://github.com/user-attachments/assets/22a3cfdf-ad7d-47b1-99a6-3902361f8ce1" />

Gambar di atas menunjukkan data Penghuni Mandiri. Ketika pengguna memilih menu ini, sistem hanya akan menampilkan informasi penghuni yang termasuk dalam kategori Penghuni Mandiri, sehingga data dapat dilihat secara lebih spesifik sesuai dengan jenis penghuni yang dipilih.

### 2.3.4 Tampilkan Data Penghuni Bedridden

<img width="380" height="478" alt="image" src="https://github.com/user-attachments/assets/53a3a715-dbc6-4b76-854d-19ab78ee3c53" />

Gambar di atas menunjukkan data Penghuni Bedridden. Ketika pengguna memilih menu ini, sistem hanya akan menampilkan informasi penghuni yang termasuk dalam kategori Penghuni Bedridden, sehingga data dapat dilihat secara lebih spesifik sesuai dengan jenis penghuni intensif yang dipilih.


## 2.4 Menu Update

<img width="375" height="189" alt="image" src="https://github.com/user-attachments/assets/e9aaf726-aaa1-40db-8496-f91d7757019b" />

Pada menu Update Data, pengguna dapat memilih informasi yang ingin diperbarui. Sistem menyediakan empat pilihan informasi yang dapat diubah, yaitu Usia Penghuni, Kondisi Kesehatan Penghuni, Update Informasi Khusus Penghuni Intensif, dan Update Informasi Khusus Penghuni Mandiri. 

### 2.4.1 Update Umur Penghuni

<img width="377" height="125" alt="image" src="https://github.com/user-attachments/assets/c98e4e1e-0ce6-4052-b7b8-5864bd102050" />

Pada menu Update Usia, pengguna perlu memasukkan ID penghuni yang ingin diperbarui usianya. Setelah ID penghuni ditemukan, pengguna dapat memasukkan usia terbaru penghuni tersebut. Kemudian sistem akan memperbarui data usia sesuai dengan input yang diberikan.

### 2.4.2 Update Kondisi Penghuni

<img width="378" height="124" alt="image" src="https://github.com/user-attachments/assets/a884c5c9-a034-4610-8026-e7b0bba3f8b1" />

Pada menu Update Kondisi, pengguna perlu measukkan ID penghuni yang ingin diperbarui kondisi kesehatannya. Pembaruan kondisi Kesehatan ini diperlukan untuk memastikan informasi yang tersimpan sesuai dengan kondisi terkini penghuni sehingga dapat membantu pihak panti dalam melakukan pemantauan dan pengelolaan kesehatan para lansianya.

### 2.4.3 Update Informasi Khusus Penghuni Intensif

<img width="374" height="136" alt="image" src="https://github.com/user-attachments/assets/7f9ee51d-aa0c-4eed-9d88-17795a73166a" />

Pada menu ini, pengguna dapat memperbarui jadwal pemberian obat dan jadwal kontrol medis. Apabila pengguna hanya ingin memperbarui jadwal kontrol medis saja, maka pengguna cukup mengetikkan kembali jadwal pemberian obat yang sama seperti sebelumnya, sehingga perubahan pada jadwal kontrol medis tetap dapat tersimpan dan ditampilkan.

### 2.4.4 Update Informasi Khusus Penghuni Mandiri

<img width="411" height="124" alt="image" src="https://github.com/user-attachments/assets/a4fcaf53-88a1-4d74-8218-53f465759f30" />

Pada menu ini, pengguna hanya dapat memperbarui jadwal kegiatan harian penghuni mandiri.

## 2.5 Menu Hapus

<img width="375" height="114" alt="image" src="https://github.com/user-attachments/assets/340be7a9-e811-45be-b39b-aba81841a001" />

Pada menu Hapus Data, pengguna dapat menghapus data penghuni dengan memasukkan ID penghuni yang ingin dihapus. Sistem nantinya akan mencari data berdasarkan ID yang dimasukkan, kemudian menghapus data penghuni tersebut dari daftar aspabila ID ditemukan. 

<img width="425" height="91" alt="image" src="https://github.com/user-attachments/assets/c0cbf498-363f-466d-b77a-bb3f3606f640" />

Gambar di atas merupakan tampilan ketika pengguna mencari penghuni dengan nama tersebut yang sebelumya sudah dihapus, sistem pasti akan menampilkan pesan bahwa pasien dengan nama tersebut tidak ditemukan.

## 2.6 Menu Cari

<img width="379" height="256" alt="image" src="https://github.com/user-attachments/assets/09893c65-cb3d-4901-badb-9adc9491f58d" />

Pada menu Cari Data Penghuni, pengguna dapat mencari informasi mengenai penghuni panti jompo dengan memasukkan nama penghuni yang ingin dicari. Penggunaan nama sebagai kata kunci pencarian dipilih karena pengguna cenderung lebih mudah mengingat nama penghuni dibandingkan dengan ID.

## 2.7 Menu Keluar

<img width="373" height="268" alt="image" src="https://github.com/user-attachments/assets/4f5313e2-a1e5-4937-98a9-428b87cef665" />

Pada menu Keluar, pengguna dapat memilih menu tersebut apabila telah selesai menggunakan sistem. Setelah menu dipilih, program akan menghentikan seluruh proses dan keluar dari sistem sehingga pengguna tidak dapat melakukan pengelolaan data lagi sampai program dijalankan kembali.

## 2.8 Validasi

<img width="376" height="51" alt="image" src="https://github.com/user-attachments/assets/326379f8-f7e9-4193-b0e8-3b6a32ac89d2" />

Gambar di atas menampilkan validasi pilihan menu. Jika pengguna memasukkan pilihan yang melebihi batas yang tersedia, sistem akan menampilkan pesan peringatan seperti pada gambar.

<img width="394" height="50" alt="image" src="https://github.com/user-attachments/assets/69834fab-c8f9-4d22-90c4-18c1a9f6b2e2" />

Gambar di atas menampilkan validasi input ID. Pengguna tidak diperbolehkan memasukkan huruf pada atribut ID karena ID hanya dapat berupa angka.

<img width="395" height="51" alt="image" src="https://github.com/user-attachments/assets/06896225-93cd-4ee6-a2a7-2aa6ceef1f33" />

Gambar di atas menampilkan validasi ID. Jika pengguna memasukkan ID penghuni yang sudah tersimpan di dalam sistem, sistem akan menampilkan pesan peringatan, hal ini dilakukan untuk mencegah terjadinya duplikasi data.

<img width="390" height="55" alt="image" src="https://github.com/user-attachments/assets/3cf87de6-ce53-48da-a261-50214d06b814" />

Gambar di atas menampilkan validasi nama. Pengguna tidak diperbolehkan mengisi atribut nama dengan angka untuk menjaga kesesuaian format data nama.

<img width="379" height="51" alt="image" src="https://github.com/user-attachments/assets/36176c43-1e0e-404c-b384-eff11d33e91c" />

Gambar di atas menampilkan validasi nama. Pengguna tidak diperbolehkan mengosongkan atribut nama saat memasukkan data.

<img width="374" height="49" alt="image" src="https://github.com/user-attachments/assets/a203177c-0d37-4c4f-b041-6d3f748ebbe9" />

Gambar di atas menampilkan validasi usia. Pengguna tidak diperbolehkan memasukkan usia dengan angka negatif.

<img width="378" height="50" alt="image" src="https://github.com/user-attachments/assets/e065ca77-4a49-4c8e-a4ea-90a7fa5062e1" />

Gambar di atas menampilkan validasi nomor telepon. Pengguna tidak diperbolehkan mengisi atribut nomor telepon dengan huruf karena nomor telepon hanya dapat berupa angka.

<img width="443" height="49" alt="image" src="https://github.com/user-attachments/assets/1a7d8a9c-982d-42be-8c4b-d40f473d1c34" />

Gambar di atas menampilkan validasi jenis kelamin. Pengguna tidak diperbolehkan memasukkan angka pada atribut jenis kelamin.

<img width="394" height="45" alt="image" src="https://github.com/user-attachments/assets/3f6ee38b-e22a-41ba-9163-3572c046de2c" />

Gambar di atas menampilkan validasi kondisi kesehatan. Pengguna tidak diperbolehkan memasukkan angka pada atribut kondisi kesehatan.

---

# BAB III PEMBAHASAN

## 3.1 MVC

<img width="319" height="234" alt="image" src="https://github.com/user-attachments/assets/87410130-008b-48dc-95b5-0d060913678f" />

MVC (Model, View, Controller) merupakan pola atau struktur dalam pembuatan proyek yang digunakan untuk memisahkan bagian data, tampilan, dan proses pengendalian program. Penerapan MVC bertujuan agar kode program lebih terstruktur, mudah dipahami, serta memudahkan proses pengembangan dan pemeliharaan program.

Pada proyek Sistem Manajemen Panti Jompo Rumah Senja, penerapan MVC dibagi menjadi tiga package, yaitu:

**1. Package Model**

Package model berisikan class PenghuniPanti, PenghuniIntensif, dan PenghuniMandiri. Package ini bertugas untuk merepresentasikan dan mengelola data serta atribut yang dimiliki oleh setiap penghuni. Class PenghuniIntensif dan PenghuniMandiri merupakan turunan dari class PenghuniPanti sehingga dapat menerapkan konsep inheritance dalam pemrograman berorientasi objek.

**2. Package View**

Package view berisikan class InputValidasi. Package ini bertugas untuk menangani bagian yang berhubungan dengan interaksi pengguna, seperti menerima input dan melakukan validasi terhadap data yang dimasukkan agar sesuai dengan ketentuan program.

**3. Package Controller**

Package controller berisikan class ManajemenPanti. Package ini bertugas sebagai penghubung antara Model dan View serta mengatur alur proses program. Class ManajemenPanti menangani proses seperti menambahkan, menampilkan, menghapus, memperbarui, dan mencari data penghuni berdasarkan input yang diberikan oleh pengguna.

## 3.2 Inheritance

<img width="319" height="93" alt="image" src="https://github.com/user-attachments/assets/7288bed8-6f89-482b-8783-124d07fee217" />

Inheritance merupakan mekanisme dalam pemrograman berorientasi objek yang memungkinkan sebuah Subclass mewarisi atribut dan method dari kelas Superclass. Konsep ini digunakan untuk mengurangi pengulangan kode serta memudahkan pengelolaan kelas yang memiliki karakteristik yang saling berkaitan.

Pada project Sistem Manajemen Panti Jompo Rumah Senja, class PenghuniPanti berperan sebagai Superclass, sedangkan class PenghuniIntensif dan PenghuniMandiri berperan sebagai Subclass. Kedua subclass tersebut mewarisi atribut dan method umum dari class PenghuniPanti, kemudian memiliki informasi tambahan yang berbeda sesuai dengan jenis penghuni. Dengan menerapkan inheritance, data dan perilaku yang bersifat umum dapat diletakkan pada superclass, sedangkan karakteristik khusus dapat ditambahkan pada masing-masing subclass.

**1. Penghuni Intensif**

<img width="720" height="181" alt="image" src="https://github.com/user-attachments/assets/efbff4e5-a59f-4c29-9c3a-47b76c8ccbb4" />

Gambar di atas menunjukkan penerapan konsep inheritance pada program. Pada kode tersebut terdapat keyword extends yang digunakan untuk menunjukkan bahwa class PenghuniIntensif mewarisi atribut dan method dari class PenghuniPanti sebagai superclass. Dengan demikian, PenghuniIntensif dapat menggunakan data dan perilaku yang sudah didefinisikan pada class PenghuniPanti serta menambahkan atribut atau method khusus sesuai dengan jenis penghuninya.

**2. Penghuni Mandiri**

<img width="692" height="159" alt="image" src="https://github.com/user-attachments/assets/a2d7ebcd-211b-407a-872d-39922184f37c" />

Gambar di atas juga menunjukkan penerapan konsep inheritance pada program. Pada kode tersebut terdapat keyword extends yang digunakan untuk menunjukkan bahwa class PenghuniMandiri mewarisi atribut dan method dari class PenghuniPanti sebagai superclass. Dengan demikian, PenghuniMandiri dapat menggunakan data dan perilaku yang sudah didefinisikan pada class PenghuniPanti serta menambahkan atribut atau method khusus sesuai dengan jenis penghuninya.

**3. Penghuni Bedridden**

<img width="499" height="158" alt="image" src="https://github.com/user-attachments/assets/772d9934-07e9-474c-86a2-b105b3187fe7" />

Gambar di atas menunjukkan penerapan konsep Multilevel Inheritance pada program. Pada kode tersebut terdapat keyword extends yang digunakan untuk menunjukkan bahwa class PenghuniBedridden mewarisi atribut dan method dari class PenghuniIntensif yang merupakan subclas sekaligus superclass. Dengan demikian, PenghuniBedridden dapat menggunakan data dan perilaku yang sudah didefinisikan pada class PenghuniIntensif serta menambahkan atribut atau method khusus sesuai dengan jenis penghuninya.

## 3.3 Encapsulation

**1. Penghuni Panti**

<img width="555" height="263" alt="image" src="https://github.com/user-attachments/assets/15d5c32f-4a46-4b60-9456-5a0fab8b37f1" />

Gambar di atas menampilkan penggunaan konsep enkapsulasi pada class PenghuniPanti. Atribut pada class PenghuniPanti diatur menggunakan access modifier private. Penggunaan access private bertujuan untuk membatasi akses langsung dari luar class sehingga nilai atribut tidak dapat dimodifikasi secara langsung dan sembarangan.

Dengan menerapkan enkapsulasi, perubahan dan pengambilan data penghuni dilakukan melalui method yang telah disediakan oleh class. Hal ini membantu menjaga data agar lebih terkontrol dan sesuai dengan aturan yang telah ditentukan dalam program.

**2. Penghuni Intensif**

<img width="697" height="192" alt="image" src="https://github.com/user-attachments/assets/f0db1747-3f03-42bb-b3d0-016a1ad2b6bb" />

Gambar di atas menampilkan penggunaan konsep enkapsulasi pada class PenghuniIntensif. Atribut pada class PenghuniIntensif diatur menggunakan access modifier private. Penggunaan access private bertujuan untuk membatasi akses langsung dari luar class sehingga nilai atribut tidak dapat dimodifikasi secara langsung dan sembarangan.

**3. Penghuni Mandiri**

<img width="680" height="148" alt="image" src="https://github.com/user-attachments/assets/0638725f-9a8e-4dc6-af3e-8dbe1247d515" />

Gambar di atas menampilkan penggunaan konsep enkapsulasi pada class PenghuniMandiri. Atribut pada class PenghuniMandiri diatur menggunakan access modifier private. Penggunaan access private bertujuan untuk membatasi akses langsung dari luar class sehingga nilai atribut tidak dapat dimodifikasi secara langsung dan sembarangan.

## 3.4 Constructor

**1. Penghuni Panti**

<img width="950" height="294" alt="image" src="https://github.com/user-attachments/assets/440893bd-ec3b-4c82-82c6-16a7cf95f5e2" />

Class PenghuniPanti menggunakan constructor untuk menginisialisasi nilai atribut ketika sebuah objek penghuni dibuat. Melalui constructor ini, data awal seperti ID, nama, usia, nomor telepon, jenis kelamin, dan kondisi kesehatan penghuni dapat langsung diberikan pada saat objek dibentuk, sehingga setiap objek PenghuniPanti yang dibuat sudah memiliki data lengkap tanpa perlu proses inisialisasi tambahan setelahnya. 

**2. Penghuni Intensif**

<img width="975" height="168" alt="image" src="https://github.com/user-attachments/assets/dd5e02ca-1a86-42a4-9401-acc30ec5cc9f" />

Gambar di atas menampilkan constructor dari kelas PenghuniIntensif, yang merupakan subclass dari kelas PenghuniPanti. Constructor ini menerima parameter data umum penghuni (idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi) serta parameter khusus tambahan yang hanya dimiliki oleh penghuni intensif, yaitu namaPerawat, kontrolMedis, dan jadwalObat.

Baris super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi) digunakan untuk memanggil constructor dari kelas induk (PenghuniPanti) agar atribut-atribut umum tersebut diinisialisasi oleh constructor kelas induknya, sehingga tidak perlu ditulis ulang di kelas anak. Setelah itu, ketiga atribut tambahan (namaPerawat, kontrolMedis, jadwalObat) diinisialisasi secara langsung menggunakan this, karena atribut-atribut tersebut memang khusus dimiliki oleh kelas PenghuniIntensif dan tidak ada di kelas induknya.

**3. Penghuni Mandiri**

<img width="975" height="198" alt="image" src="https://github.com/user-attachments/assets/0a61519c-4d21-49a5-8e2d-2206cfd0fa3d" />

Gambar di atas menampilkan constructor dari kelas PenghuniIntensif, yang merupakan subclass dari kelas PenghuniPanti. Constructor ini menerima parameter data umum penghuni (idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi) serta parameter khusus tambahan yang hanya dimiliki oleh penghuni intensif, yaitu hobi dan kegiatanHarian.

Baris super(idPenghuni, nama, usia, noTelp, jenisKelamin, kondisi) digunakan untuk memanggil constructor dari kelas induk (PenghuniPanti) agar atribut-atribut umum tersebut diinisialisasi oleh constructor kelas induknya, sehingga tidak perlu ditulis ulang di kelas anak. Setelah itu, kedua atribut tambahan (hobi dan kegiatanHarian) diinisialisasi secara langsung menggunakan this, karena atribut-atribut tersebut memang khusus dimiliki oleh kelas PenghuniMandiri dan tidak ada di kelas induknya.

## 3.5 Polymorphism
 
**1. Penghuni Panti**

<img width="841" height="263" alt="image" src="https://github.com/user-attachments/assets/6f832336-fcb2-4e6f-a7d2-932a9319c34a" />

**2. Penghuni Intensif**

<img width="841" height="245" alt="image" src="https://github.com/user-attachments/assets/8a954d1a-c982-4ce7-9a05-7ecf2ed687b0" />

Gambar di atas menunjukkan penerapan polymorphism pada class PenghuniIntensif. Penggunaan polymorphism pada kode tersebut ditandai dengan adanya anotasi @Override. Pada project Sistem Manajemen Panti Jompo Rumah Senja, metode polymorphism yang digunakan adalah method overriding, yaitu kondisi ketika subclass mendefinisikan kembali method yang sebelumnya sudah terdapat pada superclass dengan implementasi yang disesuaikan dengan kebutuhan subclass tersebut.

Metode overriding digunakan karena PenghuniIntensif memiliki karakteristik dan kebutuhan informasi yang berbeda dari PenghuniPanti. Dengan overriding, method yang diwarisi dari superclass dapat disesuaikan sehingga ketika dipanggil pada objek PenghuniIntensif, sistem akan menjalankan implementasi method yang terdapat pada class PenghuniIntensif. Hal ini membuat setiap subclass dapat memiliki perilaku yang sesuai dengan karakteristiknya masing-masing.

**3. Penghuni Mandiri**

<img width="861" height="206" alt="image" src="https://github.com/user-attachments/assets/b51f6129-cc72-43b2-a8ad-f43309826dc5" />

Gambar di atas juga menunjukkan penerapan polymorphism pada class PenghuniMandiri. Penggunaan polymorphism pada kode tersebut ditandai dengan adanya anotasi @Override. Pada project Sistem Manajemen Panti Jompo Rumah Senja, metode polymorphism yang digunakan adalah method overriding.

Metode overriding digunakan karena PenghuniMandiri memiliki karakteristik dan kebutuhan informasi yang berbeda dari PenghuniPanti. Dengan overriding, method yang diwarisi dari superclass dapat disesuaikan sehingga ketika dipanggil pada objek PenghuniMandiri, sistem akan menjalankan implementasi method yang terdapat pada class PenghuniMandiri. Hal ini membuat setiap subclass dapat memiliki perilaku yang sesuai dengan karakteristiknya masing-masing.

**4. Memanggil Polymorpyhsm**

<img width="975" height="393" alt="image" src="https://github.com/user-attachments/assets/8bb15250-d024-4014-8967-9e8711ce47ec" />

Gambar di atas menampilkan sebuah kode untuk menampilkan data penghuni panti berdasarkan kategori yang dipilih pengguna. Penggunaan instanceof memastikan hanya objek dari subclass yang sesuai yang akan dieksekusi method-nya. Jika pengguna memilih tipe tertentu seperti PenghuniMandiri atau PenghuniIntensif, operator instanceof memastikan hanya objek dari subclass yang sesuai yang akan dieksekusi method-nya. Dengan polymorphism, panggilan p.tampilkanInfo() secara otomatis akan menyesuaikan tampilan data sesuai dengan bentuk asli objek tersebut di dalam memori.
