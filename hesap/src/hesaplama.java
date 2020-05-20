

import java.util.Scanner;
import java.util.*;

public class hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int çifttopla=0;
        Scanner girdi = new Scanner(System.in);
        System.out.println("başlangıç değerini giriniz=");
        int a = girdi.nextInt();
        Scanner çıktı = new Scanner(System.in);
        System.out.println("bitiş değerini giriniz=");
        int b = çıktı.nextInt();
        Scanner zıp = new Scanner(System.in);
        System.out.println("başlangıç değerini giriniz=");
        int c= zıp.nextInt();
        if(a<b){
            for (int i = a; i <= b; i++) {
                if(i%c==0){
                    çifttopla=çifttopla+i;}
                else {           
                  continue;}
            }
            
        }
        else if(a>b){
             for (int i = b; i <= a; i++) {
                if(i%c==0){
                    çifttopla=çifttopla+i;}
                else {           
                  continue;}
            }
        }
        else 
            System.out.println("lütfen düzgün giriniz...");
        
        System.out.println("toplam sonuç="+çifttopla);
    }
    
}
