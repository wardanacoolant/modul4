package modul4;

public class Truk {
    double muatan = 0.0;
    double muatanmax = 0.0;

    public Truk(double muatanmax){
        this.muatanmax = muatanmax;
    }

    public double getMuatan(){
        return muatan;
    }
    public double getMuatanMaks(){
        return muatanmax;
    }
    public String tambahMuatan(double berat){
        
        if ((muatan + berat) > muatanmax) {
            System.out.println("Maaf, muatan melebihi kapasitas maksimal.");
            return "";
        } 
        else {
            muatan = muatan + berat;
            return "";
        }
    }
}
