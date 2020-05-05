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
public class Gaji {
    double gajiPokok;
    double uangLembur;
    
    void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
   void setUangLembur(double uangLembur) {
       this.uangLembur = uangLembur;
   }
   
   double getGajiBersih() {
       return this.gajiPokok + this.uangLembur;
   }
}
