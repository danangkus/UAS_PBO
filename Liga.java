package com.ubielabs;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;

/**
 * Created by Danang Kusuma on 6/24/2015.
 */
public class Liga {
    private String namaLiga;
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {
        this.daftarDivisi.add(divisi);
    }

    public void getDaftarDivisi(String liga){
        if (liga == getNamaLiga()){
            for(int a = 0;a < daftarDivisi.size();a++){
                System.out.println(daftarDivisi.get(a));
            }
        }
        else {
            System.out.println("Tidak Ada Divisi");
        }
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                ", daftarDivisi=" + daftarDivisi +
                '}';
    }
}
