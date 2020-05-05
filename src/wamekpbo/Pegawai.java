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
abstract class Pegawai {
  private String nama;
  private char golongan;
  private int jamKerja;
  private Gaji salary;
  
  public String getNama() {
      return this.nama;
  }
  
  public void setNama(String nama) {
      this.nama = nama;
  }
  
  public char getGolongan() {
      return this.golongan;
  }

  public void setGolongan(char golongan) {
      this.golongan = golongan;
            
      switch(this.golongan) {
        case 'A':
            this.salary.setGajiPokok(3000000);
          break;
        case 'B':
            this.salary.setGajiPokok(2000000);
          break;
        case 'C':
            this.salary.setGajiPokok(1000000);
          break;
        default:
            this.salary.setGajiPokok(0);
      }
  }
  
  public void setJamKerja(int jamKerja) {
      this.jamKerja = jamKerja;
      
      if (this.jamKerja > 8) {
          int uangLemburPerJam = 30000;
          int jamLembur = this.jamKerja - 8;
                    
          this.salary.setUangLembur(uangLemburPerJam * jamLembur);
      }
  }
  
  public double getSalary() {
      return this.salary.getGajiBersih();
  }
  
  public void getDetail() {}
}
