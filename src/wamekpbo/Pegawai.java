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
  String nama;
  char golongan;
  int jamKerja;
  Gaji salary;
  
  String getNama() {
      return this.nama;
  }
  
  void setNama(String nama) {
      this.nama = nama;
  }
  
  char getGolongan() {
      return this.golongan;
  }

  void setGolongan(char golongan) {
      this.golongan = golongan;
      
      switch(this.golongan) {
        case 'A':
            this.salary.gajiPokok = 3000000;
          break;
        case 'B':
            this.salary.gajiPokok = 2000000;
          break;
        case 'C':
            this.salary.gajiPokok = 1000000;
          break;
        default:
          // code block
      }
  }
  
  void setJamKerja(int jamKerja) {
      this.jamKerja = jamKerja;
  }
  
  double getSalary() {
      return this.salary.getGajiBersih();
  }
  
  void getDetail() {}
}
