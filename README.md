# Tugas 2 - Pemrograman Berorientasi Objek (PBO)
**Topik :** Bangun Datar  
**Kelompok :** 6  

---

## 📌 Deskripsi Proyek
Proyek ini dibuat untuk memenuhi penugasan praktikum Pemrograman Berorientasi Objek (PBO). Fokus utama penugasan adalah implementasi konsep dasar OOP Java—khususnya enkapsulasi melalui atribut *private*, *method setter & getter*, perhitungan matematis keliling dan luas, serta pemanggilan seluruh objek ke dalam `Main Class`.

Pengerjaan proyek menerapkan prinsip kolaborasi Git dan GitHub, di mana masing-masing anggota kelompok bertanggung jawab mengunggah satu berkas class bangun datar secara mandiri.

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Stable-brightgreen?style=for-the-badge)
![Studio](https://img.shields.io/badge/DigiVora--Studio-orange?style=for-the-badge)

</div>

---

## 📜 License

Project ini menggunakan lisensi MIT.

---

## 👥 Anggota Kelompok & Pembagian Tugas

Setiap anggota mengimplementasikan satu class bangun datar lengkap dengan atribut, enkapsulasi (*getter & setter*), serta method perhitungan luas dan keliling:

| No | Nama Anggota | Nama Branch | Class yang Dikerjakan | Atribut Utama |
|:--:|:---|:---|:---|:---|
| 1 | Achmad Khusnul Yakin | Persegi | `Persegi.java` | `sisi` |
| 2 | Shofi Putri Febrianti | Segitiga | `PersegiPanjang.java` | `panjang`, `lebar` |
| 3 | Khabib Mustofa | Persegi Panjang | `Segitiga.java` | `alas`, `tinggi`, `sisiA`, `sisiB`, `sisiC` |
| 4 | Muhammad Audi Luqman Mahfudz | Lingkaran | `Lingkaran.java` | `jariJari` |
| 5 | Zaki Reza Pahlevi | JajarGenjang | `JajarGenjang.java` | `alas`, `tinggi`, `sisiMiring` |
| 6 | M. Aditya Tri Hadi Tama | BelahKetupat | `BelahKetupat.java` | `diagonal1`, `diagonal2`, `sisi` |

---

## 📐 Rincian Rumus Bangun Datar

* **Persegi**
  * Luas = $\text{sisi} \times \text{sisi}$
  * Keliling = $4 \times \text{sisi}$
* **Persegi Panjang**
  * Luas = $\text{panjang} \times \text{lebar}$
  * Keliling = $2 \times (\text{panjang} + \text{lebar})$
* **Segitiga**
  * Luas = $0{,}5 \times \text{alas} \times \text{tinggi}$
  * Keliling = $\text{sisiA} + \text{sisiB} + \text{sisiC}$
* **Lingkaran**
  * Luas = $\pi \times r^2$
  * Keliling = $2 \times \pi \times r$
* **Jajar Genjang**
  * Luas = $\text{alas} \times \text{tinggi}$
  * Keliling = $2 \times (\text{alas} + \text{sisiMiring})$
* **Belah Ketupat**
  * Luas = $0{,}5 \times d_1 \times d_2$
  * Keliling = $4 \times \text{sisi}$

---

## 📂 Struktur Proyek

```text
src/
 └── bangun_datar/
      ├── Main.java                # Main class pemanggil semua objek
      ├── Persegi.java             # Dikerjakan oleh Achmad Khusnul Yakin
      ├── PersegiPanjang.java      # Dikerjakan oleh Shofi Putri Febrianti
      ├── Segitiga.java            # Dikerjakan oleh Khabib Mustofa
      ├── Lingkaran.java           # Dikerjakan oleh Muhammad Audi Luqman Mahfudz
      ├── JajarGenjang.java        # Dikerjakan oleh Zaki Reza Pahlevi
      └── BelahKetupat.java        # Dikerjakan oleh M. Aditya Tri Hadi Tama
```

## ⚙️Cara Menjalankan Proyek
1. *Clone* repositori ini ke laptop lokal :
   ```
   https://github.com/DigiVora/pbo-tugas2-kelompok-6.git
   ```
3. Buka aplikasi **Apache Netbeans.**
4. Buka menu **File → Open Project...,** lalu arahkan ke folder repositori yang telah di-*clone.*
5. Pastikan berkas `Main.java` berstatus sebagai Main Class.
6. Jalankan proyek dengan menekan tombol **Run Project**

## 🤝 Aturan Kolaborasi Anggota

1. **Wajib Akun Sendiri**
   Setiap anggota wajib melakukan *commit* dan *push* menggunakan akun GitHub masing-masing karena penilaian dosen berbasis riwayat kontribusi (*commit history*). Anggota tanpa riwayat *commit* tidak akan mendapat nilai.

2. **Satu Anggota, Satu Class**
   Setiap anggota hanya mengerjakan satu berkas class bangun datar yang menjadi bagian tugasnya, lengkap dengan atribut `private`, *method setter* & *getter*, serta rumus luas dan keliling.

3. **Pull Sebelum Mulai Koding**
   Selalu lakukan `Git Pull` sebelum mulai menulis kode di NetBeans agar salinan proyek di laptop lokal selalu sinkron dan terhindar dari konflik.

4. **Gunakan Branch Terpisah**
   Kerjakan tugas pada *branch* fitur mandiri (contoh: `fitur-persegi`). Dilarang langsung melakukan *push* ke *branch* utama (`main`).

5. **Merge via Pull Request**
   Setelah berkas class selesai dan di-*push*, ajukan *Pull Request* (PR) di GitHub. Penggabungan ke *branch* `main` dan penyusunan instansiasi objek di `Main.java` dikoordinasikan oleh ketua kelompok.

6. **Bebas Galat & Pesan Commit Jelas**
   Pastikan kode berhasil dikompilasi tanpa *error* sebelum di-*commit*, serta gunakan pesan *commit* yang deskriptif (contoh: `feat: buat class Persegi dan rumusnya`).

## 🤝 Hubungi Saya

<p align="center">
  <a href="https://www.linkedin.com/in/achmad-khusnul-yakin-25b87a3a2?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn" style="margin-bottom: 5px;">
  </a>
  <a href="https://www.instagram.com/digivora.studio" target="_blank">
    <img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white" alt="Instagram" style="margin-bottom: 5px;">
  </a>
  <a href="https://wa.me/6283116152891" target="_blank">
    <img src="https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white" alt="WhatsApp" style="margin-bottom: 5px;">
  </a>
  <a href="https://github.com/DigiVora" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" style="margin-bottom: 5px;">
  </a>
</p>
<br>

---

<p align="center">
  <img src="https://img.shields.io/badge/Copyright%20%C2%A9%202026-DigiVora%20Studio-orange?style=flat-square" alt="Copyright">
  <br>
  <sub>Sistem ini dikembangkan dengan dedikasi oleh:
  <br>
  <b>Achmad Khusnul Yakin, S.I.</b></sub>
</p>
