
package pendaftaran;


public class Peserta {
    public String cekKelayakan (int nilaiMatematika, int nilaiFisika, int nilaiKimia){
        
        String kelayakan;
        
        if (nilaiMatematika + nilaiFisika + nilaiKimia > 190){
            kelayakan = ("layak ikut kursus");
            
        }else if (nilaiMatematika + nilaiFisika + nilaiKimia < 190){
            kelayakan = ("tidak layak ikut kursus");
            
        }else{
            kelayakan = ("tidak keduanya");
            
        } 
        
        return kelayakan;
        
    }
}
        