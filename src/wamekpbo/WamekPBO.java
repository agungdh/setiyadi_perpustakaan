/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wamekpbo;

/**
 *
 * @author user
 */
public class WamekPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perusahaan perusahaanBPKAD = new Perusahaan();
        perusahaanBPKAD.setNamaPerusahaan("BPKAD - Lampung Tengah");
        perusahaanBPKAD.setAlamat("Jl. Raya Padang Ratu No.1, Gn. Sugih, Kec. Gn. Sugih, Kabupaten Lampung Tengah, Lampung 34161");
        
        Manager managerAgung = new Manager();
        managerAgung.setNama("Agung Sapto Margono Dh");
        managerAgung.setGolongan('A');
        managerAgung.setJamKerja(10);
        managerAgung.setDepartemen("IT");
        
        Staf stafNabil = new Staf();
        stafNabil.setNama("Nabiel Rahardian");
        stafNabil.setGolongan('B');
        stafNabil.setJamKerja(9);

        Staf stafNanda = new Staf();
        stafNanda.setNama("Dwi Nanda Widiatama");
        stafNanda.setGolongan('C');
        stafNanda.setJamKerja(8);
        
        Staf stafFajar = new Staf();
        stafFajar.setNama("Fajar Setiyadi");
        stafFajar.setGolongan('C');
        stafFajar.setJamKerja(4);
        
        System.out.println("Perusahaan: " + perusahaanBPKAD);
    }
    
}
