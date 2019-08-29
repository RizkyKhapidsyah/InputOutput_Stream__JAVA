package com.rizkykhapidsyah.javafundamental.inputoutput;

import java.io.File;

public class AmbilFileMelaluiList {
    public static void main(String[] args) {
        String dirName = "/java/latihan1";
        File fiLe = null;
        String[] paths;

        try {
            fiLe = new File(dirName); //Instansiasi Objek File
            paths = fiLe.list(); //Ambil list file dan masukkan ke string paths

            //Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
    Karena menggunakan mkdirs, kode di atas akan membuat directory latihan1 dan parent directory java.
    Kemudian kita bisa menampilkan list file dari directories dengan memanggil metode list(). Misalnya seperti ini.
 */