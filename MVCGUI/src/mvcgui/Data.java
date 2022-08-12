/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;

/**
 *
 * @author fayruz
 * @co-author zainudin
 */
public class Data {
    private int bilangan1;
    private int bilangan2;
    private int hasil;
    
    public Data(){
        this.hasil = 0;
        this.bilangan1 = 0;
        this.bilangan2 = 0;
    }
    
    public void setBilangan1 (int bil){
        this.bilangan1 = bil;
    }
    
    public void setBilangan2 (int bil){
        this.bilangan2 = bil;
    }
    
    public int getBilangan1(){
        return this.bilangan1;
    }

    public int getBilangan2(){
        return this.bilangan2;
    }
    public int getHasil(){
        return hasil;
    }
    
    public void Penjumlahan(){
        this.hasil = this.bilangan1 + this.bilangan2;
    }
    
    public void Pengurangan(){
        this.hasil = this.bilangan1 - this.bilangan2;
    }
    public void Pembagian(){
        this.hasil = this.bilangan1 / this.bilangan2;
    }
    
    public void Perkalian(){
        this.hasil = this.bilangan1 * this.bilangan2;
    }
    public void Clear(){
        this.bilangan1 = 0;
        this.hasil = 0;
    }
    
}
