
package test;

import pendaftaran.Peserta;

public class TestRunner {
    public static void main(String[] args) {

        Peserta pendaftaran = new Peserta();

       
        System.out.println(pendaftaran.cekKelayakan(80, 60, 55));//1
        System.out.println(pendaftaran.cekKelayakan(65, 55, 60));//2
        System.out.println(pendaftaran.cekKelayakan(100, 30, 60));//3
        System.out.println(pendaftaran.cekKelayakan(30, 100, 60));//4
        System.out.println(pendaftaran.cekKelayakan(60, 30, 100));//5
        System.out.println(pendaftaran.cekKelayakan(80, 60, 30));//6
        System.out.println(pendaftaran.cekKelayakan(60, 80, 30));//7
        System.out.println(pendaftaran.cekKelayakan(60, 60, 50));//8
        System.out.println(pendaftaran.cekKelayakan(100, 30, 0));//9
    }
}
