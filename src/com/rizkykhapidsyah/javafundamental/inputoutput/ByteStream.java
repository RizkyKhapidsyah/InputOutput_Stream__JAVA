package com.rizkykhapidsyah.javafundamental.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("Latihan_Input.txt");
            out = new FileOutputStream("Latihan_Output.txt");
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
    Byte streams digunakan untuk proses input output dengan ukuran 8-bit bytes. Contoh komponen byte stream adalah
    FileInputStream dan FileOutputStream. Ada banyak komponen byte streams lainnya tapi kurang lebih penggunaanya sama.
 */