package modul4;
import java.util.Scanner;
public class TesLatihan2 {
    private String nim, notelp, nama, alamat;
        private void setnim(String a){
        this.nim = a;
    }
    private String getnim(){
        return nim;
    }
    private void setnama(String a){
        this.nama = a;
    }
    private String getnama(){
        return nama;
    }
    private void setalamat(String a){
        this.alamat = a;
    }
    private String getalamat(){
        return alamat;
    }
    private void setnotelp(String a){
        this.notelp = a;
    }
    private String gettelp(){
        return notelp;
    }
    public static void main(String[] args) {
        boolean running = true;
        String a;
        String jawab;
        Scanner datain = new Scanner(System.in);
        while ( running ){
            int i;
            TesLatihan2 mhs[] = new TesLatihan2[10];
            for(i = 0; i<3; i++)
                mhs[i] = new TesLatihan2();
            for(i = 0; i<3; i++){
                System.out.print("Masukkan NIM mahasiswa ke-"+ (i+1) + " : ");
                a = datain.nextLine();
                mhs[i].setnim(a);
                System.out.print("Masukkan nama mahasiswa ke-"+ (i+1) + " : ");
                a = datain.nextLine();
                mhs[i].setnama(a);
                System.out.print("Masukkan alamat mahasiswa ke-"+ (i+1) + " : ");
                a = datain.nextLine();
                mhs[i].setalamat(a);
                System.out.print("Masukkan no. telp mahasiswa ke-"+ (i+1) + " : ");
                a = datain.nextLine();
                mhs[i].setnotelp(a);
                System.out.print ("Tambah data mahasiswa? (Maksimal 3 data) [Y/T] : ");
                jawab = datain.nextLine();
                System.out.println(" ");
                if (jawab.equals("T")){
                    running = false;
                    System.out.println("MENGGUNAKAN GETTER");
                    for(int j = 0; j<3;j++)
                    {
                        System.out.println("NIM mahasiswa ke-"+ (j+1) + " : "+ (mhs[j].getnim()));
                        System.out.println("Nama mahasiswa ke-"+ (j+1) + " : "+ (mhs[j].getnama()));
                        System.out.println("Alamat mahasiswa ke-"+ (j+1) + " : "+ (mhs[j].getalamat()));
                        System.out.println("No. telp mahasiswa ke-"+ (j+1) + " : "+ (mhs[j].gettelp()));
                    }
                    break;
                } 
            } 
        } 
    } 
}
