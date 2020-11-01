/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetiyadiPerpustakaan;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
    Mahasiswa mahasiswa = new Mahasiswa();
    List<Buku> bukuDipinjam = new ArrayList<Buku> ();
    Scanner scanner = new Scanner(System.in);
    
    void utama()
    {
        this.header();
    }
    
    void menuLihatBukuDipinjam()
    {
        for (Buku buku : bukuDipinjam) {
            System.out.println(buku.getID() + ", " + buku.getJudul());
        }
    }
    
    void menuMahasiswa()
    {
        System.out.print("Masukan NPM : ");
        this.mahasiswa.setNPM(this.scanner.nextLine());
        
        System.out.print("Masukan Nama : ");
        this.mahasiswa.setNama(this.scanner.nextLine());
        
        System.out.print("Masukan Jurusan : ");
        this.mahasiswa.setJurusan(this.scanner.nextLine());
    }

    void menuPilihBuku()
    {
        Buku buku = new Buku();
        boolean bukuExist = false;
        
        System.out.print("Masukan ID : ");
        String ID = this.scanner.nextLine();
        for (int i = 0; i < bukuDipinjam.size(); i++) {
            if (bukuDipinjam.get(i).getID().equals(ID)) {
                System.out.println("Buku dengan ID " + ID + " Sudah Ada !!!");
                bukuExist = true;
            }
        }
        
        if (bukuExist == false)
        {
            buku.setID(ID);
        
            System.out.print("Masukan Judul : ");
            buku.setJudul(this.scanner.nextLine());

            this.bukuDipinjam.add(buku);
        } else
        {
            exit(1);
        }
    }

    void menuHapusBuku()
    {
        boolean bukuExist = false;
        int indexBuku = 0;

        System.out.print("Masukan ID : ");
        String ID = this.scanner.nextLine();
        for (int i = 0; i < bukuDipinjam.size(); i++) {
            if (bukuDipinjam.get(i).getID().equals(ID)) {
                bukuExist = true;
                indexBuku = i;
            }
        }
        
        if (bukuExist == false)
        {
            exit(1);
        } else
        {
            this.bukuDipinjam.remove(indexBuku);
        }
    }

    void menuCetakBuktiPeminjaman()
    {
        System.out.println("Bukti Peminjaman Buku");
        System.out.println("STMIK Dharma Wacana");
        this.separator();
        
        System.out.println("NPM\t: " + this.mahasiswa.getNPM());
        System.out.println("Nama\t: " + this.mahasiswa.getNama());
        System.out.println("Jurusan\t: " + this.mahasiswa.getJurusan());
        this.separator();
        
        this.menuLihatBukuDipinjam();
        this.separator();
    }
    
    void header()
    {
        System.out.println("Perpustakaan");
        System.out.println("STMIK Dharma Wacana");
        this.separator();
    }
    
    void showMenu()
    {
        String menu;
        
        System.out.println("1. Pilih Buku");
        System.out.println("2. Hapus Buku");
        System.out.println("3. Lihat Buku Yang Dipinjam");
        System.out.println("4. Cetak Bukti Peminjaman");        
        System.out.print("Pilih Menu : ");        
        
        menu = this.scanner.nextLine();
        
        switch (menu)
        {
            case "1": 
                this.menuPilihBuku();
                break;
            case "2": 
                this.menuHapusBuku();
                break;
            case "3": 
                this.menuLihatBukuDipinjam();
                break;
            case "4": 
                this.menuCetakBuktiPeminjaman();
                break;
            default:
                this.showMenu();
                break;
        }
    }
    
    void separator()
    {
        System.out.println("========================");   
    }
}
