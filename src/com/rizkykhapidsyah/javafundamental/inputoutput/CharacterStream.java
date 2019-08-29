package com.rizkykhapidsyah.javafundamental.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("Latihan_Input.txt");
            out = new FileWriter("Latihan_Output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }

                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
    Java menggunakan Unicode conventions untuk menyimpan data characternya. Character stream digunakan untuk memproses
    input output dari 16-bit unicode. Ada banyak komponen character streams tapi yang sering digunakan adalah FileReader
    dan FileWriter. Contoh kodenya seperti ini.
 */