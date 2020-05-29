package modul4;
public class HelloWorldApp {
    int panjang, lebar, tinggi, hasil;
    public int volume (){
        hasil = panjang * lebar * tinggi;
        return hasil;
    }
    public void vol (){
        System.out.println ("Volume method void : "+(panjang*tinggi*lebar));
    }
    public static void main (String[] args)
    {
        HelloWorldApp object = new HelloWorldApp();
        object.panjang = 10;
        object.lebar = 2;
        object.tinggi = 4;
        System.out.println ("Volume method return : "+object.volume());
        object.vol();
    } 
}
