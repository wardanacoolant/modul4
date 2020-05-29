package modul4;

public class Truk2{
    private double muatan = 0.0;
    private double muatanmaks = 0.0;
    public Truk2 (double beratmaks){
        this.muatanmaks = beratmaks;
    }
    public double getMuatan(){
        return muatan;
    }
    public double getMuatanMaks(){
        return muatanmaks;
    }
    public boolean tambahMuatan(double berat){
        berat = kiloToNewts(berat);
        double muatanLocal = getMuatan();
        if((muatanLocal + berat) > kiloToNewts(getMuatanMaks())){
            return false;
        }
        else{
            muatan = muatan + berat;
            return true;
        }
    }
    public double newtsToKilo(double berat){
        berat = berat / 9.8;
        return berat;
    }
    public double kiloToNewts(double berat){
        berat = berat * 9.8;
        return berat;
    }
}
