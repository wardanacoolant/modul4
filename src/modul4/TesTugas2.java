package modul4;

public class TesTugas2 {
    public static void main(String args[]) { 
        Truk2 truk = new Truk2(900);
        boolean status;
        System.out.println("Muatan maksimal : " + truk.getMuatanMaks()); 
        status = truk.tambahMuatan(500.0); 
        System.out.print("Tambah muatan : 500"); 
        if (status)
            System.out.println("	ok");
        else
            System.out.println("	gagal"); 
        status = truk.tambahMuatan(300.0); 
        System.out.print("Tambah muatan : 300"); 
        if (status)
            System.out.println("	ok");
        else
            System.out.println("	gagal");
        status=truk.tambahMuatan(150.0); 
        System.out.print("Tambah muatan : 150"); 
        if (status)
            System.out.println("	ok");
        else
            System.out.println("	gagal"); 
        status=truk.tambahMuatan(50.0); 
        System.out.print("Tambah muatan : 50"); 
        if (status)
            System.out.println("	ok");
        else
            System.out.println("	gagal"); 
        System.out.println("Muatan sekarang = " + truk.newtsToKilo(truk.getMuatan()));
    }
}
