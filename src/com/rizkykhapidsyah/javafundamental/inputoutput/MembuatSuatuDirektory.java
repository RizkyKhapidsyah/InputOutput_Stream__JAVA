package com.rizkykhapidsyah.javafundamental.inputoutput;

import java.io.File;

public class MembuatSuatuDirektory {
    public static void main(String[] args) {
        String DirName = "/java/latihan1";
        File fiLe = new File(DirName);

        fiLe.mkdirs(); //Membuat Direktory
    }
}
