package com.ubielabs;

/**
 * Created by Danang Kusuma on 6/30/2015.
 */
public class Klub {
    private String namaKlub;
    private Divisi divisi;
    private Liga liga;

    public Klub(String namaKlub,Divisi divisi,Liga liga) {
        this.namaKlub = namaKlub;
        this.divisi = divisi;
        this.liga = liga;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public void getDivisi(String Klub) {
        for(int d = 0;d < liga.daftarDivisi.size();d++){
            Divisi a = liga.daftarDivisi.get(d);
            for(int c = 0; c < divisi.daftarKlub.size();c++){
                a.daftarKlub.get(c);
                Klub i = a.daftarKlub.get(c);
                if(Klub == i.getNamaKlub()){
                    System.out.println(a.getNamaDivisi());
                }
            }
        }
    }

    public void setDivisi(Divisi divisi) {
        this.divisi = divisi;
    }

    public void getLiga(String Klub){
        for(int d = 0;d < liga.daftarDivisi.size();d++){
            Divisi a = liga.daftarDivisi.get(d);
            for(int c = 0; c < divisi.daftarKlub.size();c++){
                a.daftarKlub.get(c);
                Klub i = a.daftarKlub.get(c);
                if(Klub == i.getNamaKlub()){
                    System.out.println(liga.getNamaLiga());
                }
            }
        }
    }

    public void setLiga(Liga liga){
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Klub{" +
                "namaKlub='" + namaKlub + '\'' +
                '}';
    }
}
