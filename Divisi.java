package com.ubielabs;

import java.util.ArrayList;

/**
 * Created by Danang Kusuma on 6/24/2015.
 */
public class Divisi {
    private String namaDivisi;
    private Liga liga;
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();

    public Divisi(String namaDivisi,Liga liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public void setDaftarKlub(Klub klub) {
        this.daftarKlub.add(klub);
    }

    public ArrayList<Klub> getDaftarKlub() {
        return daftarKlub;
    }

    public void getDaftarKlubLiga(String cariLiga){
        if (cariLiga == liga.getNamaLiga()){
            for(int i = 0;i < liga.daftarDivisi.size();i++){
                Divisi l = liga.daftarDivisi.get(i);
                System.out.println(l.getNamaDivisi());
                for(int j = 0;j < daftarKlub.size();j++){
                    System.out.println(l.daftarKlub.get(j));
                }
            }
        }
        else{
            System.out.println("Tidak ada Klub di Liga ini");
        }
    }

    public void getDaftarKlubDivisi(String cariDivisi){
        for(int i = 0;i < liga.daftarDivisi.size();i++){
            Divisi l = liga.daftarDivisi.get(i);
            if (cariDivisi == l.getNamaDivisi()){
                for(int j = 0;j < daftarKlub.size();j++){
                    System.out.println(l.daftarKlub.get(j));
                }
            }
        }
        for(int i = 0;i < liga.daftarDivisi.size();i++){
            Divisi l = liga.daftarDivisi.get(0);
            Divisi k = liga.daftarDivisi.get(1);
            if (cariDivisi != k.getNamaDivisi()){
                if (cariDivisi != l.getNamaDivisi()){
                    System.out.println("Nama Klub Tidak Ditemukan");
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDivisi + '\'' +
                '}';
    }
}
