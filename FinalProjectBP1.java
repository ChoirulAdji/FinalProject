/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;
import java.util.Scanner;
/**
 *
 * @author Choirul Adji
 */
public class FinalProjectBP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int menu, c1,c2, grandTotal=0, hargabaru, jumlah, total = 0;
        int tea=15000, coffee=25000, thaitea=30000;
        int size, r=0, s=-2000, l=2000;
        int toping, boba=3000, regal=4000, oreo=3500;
        int sugar, less=-1000, nosugar=-1000, normal=0;
        int hargaminum, hargasize, hargagula, hargatoping;
        
        do{
            System.out.println("   SELAMAT DATANG DI TOKO  ");
            System.out.println(" ========================= ");
            System.out.println("1. Masuk ke menu kasir\n2. Masuk ke menu admin");
            System.out.println("3. Exit");
            System.out.print("Silahkan pilih menu diatas : ");
            menu=sc.nextInt();
            switch(menu){
                case 1 :
                    do{
                    System.out.println(" \nBerikut menu yang kami sediakan ");
                    System.out.println("1. Tea       [" +tea+    "]");
                    System.out.println("2. Coffee    [" +coffee+ "]");
                    System.out.println("3. Thai Tea  [" +thaitea+ "]");
                    System.out.println("4. Exit  ");
                    System.out.print(" Silahkan pilih menu anda : ");
                    c1=sc.nextInt();
                    switch(c1){
                        case 1 :
                            System.out.println(" Pilih Jumlah yang anda inginkan ");
                            System.out.print(" Pilih jumlah : ");
                            jumlah=sc.nextInt();
                            System.out.println(" Silahkan Pilih Size Gelas ");
                            System.out.println(" 1. Reguler [ Normal Price ]");
                            System.out.println(" 2. Small   [" +s +       "] ");
                            System.out.println(" 3. Large   [" +l +       "] "); 
                            System.out.print("Pilih Size : ");
                            size=sc.nextInt();
                            switch(size){
                                case 1:
                                    total=tea*jumlah+r;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Tea + Reguler Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 2:
                                    total=tea*jumlah+s;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Tea + Small Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 3:
                                    total=tea*jumlah+l;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Tea + Reguler Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                default:
                                    System.out.println(" Pilihan tidak ada ");
                                               
                            }
                            System.out.println(" Silahkan pilih menu sugar ");
                            System.out.println(" 1. Normal     [ Normal Price ]");
                            System.out.println(" 2. Less Sugar [" +less+     "]");
                            System.out.println(" 3. No Sugar   [" +nosugar+  "]");
                            System.out.print("Pilih Gula : ");
                            sugar=sc.nextInt();
                            switch(sugar){
                                case 1:
                                    total=total+normal;
                                    grandTotal=grandTotal+normal;
                                    System.out.println(" Tea + Normal Sugar ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 2:
                                    total=total+less;
                                    grandTotal=grandTotal+less;
                                    System.out.println(" Tea + Less Sugar ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 3:
                                    total=total+nosugar;
                                    grandTotal=grandTotal+nosugar;
                                    System.out.println(" Tea + No Sugar   ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                default:
                                    System.out.println(" Pilihan tidak ada ");
                                
                            }
                            System.out.println(" Grand Total Anda : "+grandTotal);
                            break;
                        
                        case 2 :
                            System.out.println(" Silahkan pilih jumlah yang diinginkan ");
                            System.out.print(" Pilih Jumlah : ");
                            jumlah=sc.nextInt();
                            System.out.println(" Silahkan Pilih Size Gelas ");
                            System.out.println(" 1. Reguler [ Normal Price ]");
                            System.out.println(" 2. Small   [" +s +       "] ");
                            System.out.println(" 3. Large   [" +l +       "] "); 
                            System.out.print("Pilih Size : ");
                            size=sc.nextInt();
                            switch(size){
                                case 1:
                                    total=coffee*jumlah+r;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Coffee + Reguler Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 2:
                                    total=coffee*jumlah+s;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Coffee + Small Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 3:
                                    total=coffee*jumlah+l;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Coffee + Reguler Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                default:
                                    System.out.println(" Pilihan tidak ada ");
                                               
                            }
                            System.out.println(" Silahkan pilih menu sugar ");
                            System.out.println(" 1. Normal     [ Normal Price ]");
                            System.out.println(" 2. Less Sugar [" +less+     "]");
                            System.out.println(" 3. No Sugar   [" +nosugar+  "]");
                            System.out.print("Pilih Gula : ");
                            sugar=sc.nextInt();
                            switch(sugar){
                                case 1:
                                    total=total+normal;
                                    grandTotal=grandTotal+normal;
                                    System.out.println(" Coffee + Normal Sugar ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 2:
                                    total=total+less;
                                    grandTotal=grandTotal+less;
                                    System.out.println(" Coffee + Less Sugar ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 3:
                                    total=total+nosugar;
                                    grandTotal=grandTotal+nosugar;
                                    System.out.println(" Coffee + No Sugar ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                default:
                                    System.out.println(" Pilihan tidak ada ");
                                
                            }
                            System.out.println(" Total Yang Harus Dibayar : "+grandTotal);
                            break;
                            
                        case 3 :
                            System.out.println(" Silahkan pilih jumlah yang diinginkan ");
                            System.out.print(" Pilih Jumlah : ");
                            jumlah=sc.nextInt();
                            System.out.println(" Silahkan Pilih Size Gelas ");
                            System.out.println(" 1. Reguler [ Normal Price ]");
                            System.out.println(" 2. Small   [" +s +       "] ");
                            System.out.println(" 3. Large   [" +l +       "] "); 
                            System.out.print("Pilih Size : ");
                            size=sc.nextInt();
                            switch(size){
                                case 1:
                                    total=thaitea*jumlah+r;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Thai Tea + Reguler Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 2:
                                    total=thaitea*jumlah+s;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Thai Tea + Small Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 3:
                                    total=thaitea*jumlah+l;
                                    grandTotal=grandTotal+total;
                                    System.out.println(" SIZE DIPILIH ");
                                    System.out.println(" Thai Tea + Reguler Size ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                default:
                                    System.out.println(" Pilihan tidak ada ");
                                               
                            }
                            System.out.println(" Silahkan pilih menu sugar ");
                            System.out.println(" 1. Normal     [ Normal Price ]");
                            System.out.println(" 2. Less Sugar [" +less+     "]");
                            System.out.println(" 3. No Sugar   [" +nosugar+  "]");
                            System.out.print("Pilih Gula : ");
                            sugar=sc.nextInt();
                            switch(sugar){
                                case 1:
                                    total=total+normal;
                                    grandTotal=grandTotal+normal;
                                    System.out.println(" Thai Tea + Normal Sugar ");
                                    System.out.println(" Total  : "+total);
                                    break;
                                    
                                case 2:
                                    total=total+less;
                                    grandTotal=grandTotal+less;
                                    System.out.println(" Thai Tea + Less Sugar ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 3:
                                    total=total+nosugar;
                                    grandTotal=grandTotal+nosugar;
                                    System.out.println(" Thai Tea + No Sugar ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                default:
                                    System.out.println(" Pilihan tidak ada ");
                                
                            }
                            System.out.println(" Apakah Anda Ingin menambahkan toping? ");
                            System.out.println(" 1. Boba       [" +boba+     "]");
                            System.out.println(" 2. Regal      [" +regal+    "]");
                            System.out.println(" 3. No Sugar   [" +oreo+     "]");
                            System.out.println(" 4. Skip                       ");
                            System.out.print("Pilih Toping : ");
                            toping=sc.nextInt();
                            switch(toping){
                                case 1:
                                    total=total+boba;
                                    grandTotal=grandTotal+boba;
                                    System.out.println(" Thai Tea + Boba ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 2:
                                    total=total+regal;
                                    grandTotal=grandTotal+regal;
                                    System.out.println(" Thai Tea + Regal ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                case 3:
                                    total=total+oreo;
                                    grandTotal=grandTotal+oreo;
                                    System.out.println(" Thai Tea + Oreo ");
                                    System.out.println(" Total : "+total);
                                    break;
                                    
                                default:
                                    System.out.println(" Tidak ada toping dipilih ");
                                
                            }
                            
                            System.out.println(" Total Yang Harus Dibayar : "+grandTotal);                     
                    }
                    
                        
                    }while(c1!=4);
                    System.out.println("Back to Menu");
                    break;
                case 2:
                    do{
                        System.out.println(" \nWELCOME ADMIN ");
                        System.out.println(" Silahkan Pilih Menu dibawah ");
                        System.out.println("1. Ubah Harga Minuman\n2. Ubah Harga Size\n3. Ubah Harga Gula ");
                        System.out.println("4. Ubah Harga Toping\n5. Exit ");
                        System.out.print(" Pilih Menu : ");
                        c2=sc.nextInt();
                        switch(c2){
                            case 1:
                                System.out.println(" Ubah Harga Minuman ");
                                System.out.println("1. Tea\n2. Coffee\n3. Thai Tea");
                                System.out.println(" Silahkan pilih yang ingin anda ubah ");
                                System.out.print(" Pilih Menu : ");
                                hargaminum=sc.nextInt();
                                switch(hargaminum){
                                    case 1:
                                        System.out.println(" UBAH HARGA TEA ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        tea=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    case 2:
                                        System.out.println(" UBAH HARGA COFFEE ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        coffee=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    case 3:
                                        System.out.println(" UBAH HARGA THAI TEA ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        thaitea=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    default:
                                        System.out.println(" Pilihan tidak ada ");
                                        
                                }break;
                            case 2 :
                                System.out.println(" Ubah Harga Size Gelas ");
                                System.out.println("1. Reguler\n2. Small\n3. Large");
                                System.out.println(" Silahkan pilih yang ingin anda ubah ");
                                System.out.print(" Pilih Menu : ");
                                hargasize=sc.nextInt();
                                switch(hargasize){
                                    case 1:
                                        System.out.println(" UBAH HARGA REGULER SIZE ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        r=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    case 2:
                                        System.out.println(" UBAH HARGA SMALL SIZE ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        s=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    case 3:
                                        System.out.println(" UBAH HARGA LARGE SIZE ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        l=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    default:
                                        System.out.println(" Pilihan tidak ada ");
                                        
                                }break;
                            case 3 :
                                System.out.println(" Ubah Harga Gula ");
                                System.out.println("1. Normal\n2. Less Sugar\n3. No Sugar");
                                System.out.println(" Silahkan pilih yang ingin anda ubah ");
                                System.out.print(" Pilih Menu : ");
                                hargagula=sc.nextInt();
                                switch(hargagula){
                                    case 1:
                                        System.out.println(" UBAH HARGA NORMAL SUGAR ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        normal=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    case 2:
                                        System.out.println(" UBAH HARGA LESS SUGAR ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        less=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    case 3:
                                        System.out.println(" UBAH HARGA NO SUGAR ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        nosugar=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    default:
                                        System.out.println(" Pilihan tidak ada ");
                                        break;
                                        
                                }break;
                            case 4 :
                                System.out.println(" Ubah Harga Toping ");
                                System.out.println("1. Boba\n2. Regal\n3. Oreo");
                                System.out.println(" Silahkan pilih yang ingin anda ubah ");
                                System.out.print(" Pilih Menu : ");
                                hargatoping=sc.nextInt();
                                switch(hargatoping){
                                    case 1:
                                        System.out.println(" UBAH HARGA BOBA ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        boba=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    case 2:
                                        System.out.println(" UBAH HARGA REGAL ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        regal=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    case 3:
                                        System.out.println(" UBAH HARGA OREO ");
                                        System.out.print(" input harga baru : ");
                                        hargabaru=sc.nextInt();
                                        oreo=hargabaru;
                                        System.out.println(" HARGA DIPERBARUI ");
                                        break;
                                    default:
                                        System.out.println(" Pilihan tidak ada ");
                                        
                                }break;

                            default :
                                System.out.println(" Kembali Ke Menu ");
                        }
                        
                        
                    }while(c2!=5);
          
            }
            
        }while(menu!=3);
                
                
    }
    
}
