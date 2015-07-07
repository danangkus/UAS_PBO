package com.ubielabs;

/**
 * Created by Danang Kusuma on 6/30/2015.
 */

public class Main {
    public static void main(String[] args) {
	// write your code here
        Liga italy = new Liga("Italy");
        Liga inggris = new Liga("Inggris");

        Divisi serieA = new Divisi("Serie A",italy);
        Divisi serieB = new Divisi("Serie B",italy);
        Divisi premier = new Divisi("Premier League",inggris);
        Divisi champion = new Divisi("Football League Championship",inggris);

        Klub milan = new Klub("AC Milan",serieA,italy);
        Klub inter = new Klub("Inter Milan",serieA,italy);
        Klub pescara = new Klub("Delfino Pescara",serieB,italy);
        Klub livorno = new Klub("A.S. Livorno Calcio",serieB,italy);
        Klub arsenal = new Klub("Arsenal FC",premier,inggris);
        Klub united = new Klub("Manchester United",premier,inggris);
        Klub fulham = new Klub("Fulham FC",champion,inggris);
        Klub qpr = new Klub("Queens Park Rangers FC",champion,inggris);

        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);
        inggris.setDaftarDivisi(premier);
        inggris.setDaftarDivisi(champion);

        serieA.setDaftarKlub(milan);
        serieA.setDaftarKlub(inter);
        serieB.setDaftarKlub(pescara);
        serieB.setDaftarKlub(livorno);
        premier.setDaftarKlub(arsenal);
        premier.setDaftarKlub(united);
        champion.setDaftarKlub(fulham);
        champion.setDaftarKlub(qpr);

        System.out.println("Soal Nomor 1 Get daftar divisi by nama liga");
        System.out.println("Divisi Liga Italy");
        italy.getDaftarDivisi("Italy");
        System.out.println("Divisi Liga Inggris");
        inggris.getDaftarDivisi("Inggris");
        System.out.println();

        System.out.println("Soal Nomor 2 Get Daftar Klub by nama liga");
        System.out.println("Klub Liga Italy");
        serieA.getDaftarKlubLiga("Italy");
        System.out.println("Klub Liga Inggris");
        premier.getDaftarKlubLiga("Inggris");
        System.out.println();

        System.out.println("Soal Nomor 3 Get Daftar Klub by nama Divisi");
        System.out.println("Klub Serie A");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Klub Premier League");
        premier.getDaftarKlubDivisi("Premier League");
        System.out.println();

        System.out.println("Soal Nomor 4 Get Klub ini berada di divisi mana by nama Klub");
        System.out.println("Queens Park Rangers FC");
        qpr.getDivisi("Queens Park Rangers FC");
        System.out.println();

        System.out.println("Soal Nomor 5 Get Klub ini berada di liga apa by nama Klub");
        System.out.println("Arsenal FC");
        arsenal.getLiga("Arsenal FC");
    }
}

