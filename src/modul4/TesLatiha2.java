package modul4;
import java.util.Scanner;
public class TesLatiha2 {
    static int saldo, bertambah, berkurang, pilihan;
    String nama;
    static Scanner datain = new Scanner(System.in);
    private static void bertambah(int bertambah){
        saldo = saldo+bertambah;
        System.out.println("\t\t\tTransaksi setoran berhasil!");
    }
    private static void berkurang(int berkurang){
        saldo = saldo-berkurang;
    }
    private static int getSaldo(){
        return saldo;
    }
    private static void tampil(){
        System.out.println("\t\t\tSaldo Anda saat ini : "+getSaldo()+"\n");
    }
    private static void cekSaldoMin(int berkurang){
        if(getSaldo() <= 50000){
            System.out.println("\t\t\tMohon maaf, saldo Anda tidak mencukupi.");
            tampil();
        }
        else if(getSaldo()-berkurang < 100){
            System.out.println("\t\t\tMohon maaf, sisa saldo minimal Rp 100.");
            tampil();
        }
        else if(berkurang > getSaldo()){
            System.out.println("\t\t\tMohon maaf, saldo Anda tidak mencukupi.");
            tampil();
        }
        else{
            berkurang(berkurang);
            System.out.println("\t\t\tTransaksi penarikan sukses!");
            tampil();
        }
    }
    private void menu(){
        System.out.println("\n");
        System.out.println("\t\t\tSelamat datang, Mr/Mrs. "+nama);
        System.out.println("\t\t\tMenu : \n\t\t\t1. Masukkan saldo\n\t\t\t2. Tarik saldo\n\t\t\t3. Cek saldo");
    }
    private static void pilihMenu(int pilihan){
        switch(pilihan){
        case 1:
            System.out.print("\t\t\tMasukkan jumlah yang ingin disetorkan : ");
            bertambah = Integer.parseInt(datain.nextLine());
            bertambah(bertambah);
            tampil();
            break;
        case 2:
            System.out.print("\t\t\tMasukkan jumlah yang ingin ditarik : ");
            berkurang = Integer.parseInt(datain.nextLine());
            cekSaldoMin(berkurang);
            break;
        case 3:
            tampil();
            break;
        default:
            System.out.print("\t\t\tMaaf inputan salah, mohon diulangi.");
            break;
        }
    }
    public TesLatiha2(String namanya){
        this.nama = namanya;
        TesLatiha2.saldo=0;
    }
    public static void main(String[] args) {
        String namanya;
        boolean status = true, status1 = false;
        char set;
        System.out.print("Masukkan nama Anda : ");
        namanya = datain.nextLine();
        TesLatiha2 tab = new TesLatiha2(namanya);
        do{
            tab.menu();
            System.out.print("\t\t\tMasukkan pilihan Anda : ");
            pilihan = Integer.parseInt(datain.nextLine());
            TesLatiha2.pilihMenu(pilihan);
            do{
                System.out.println("Apakah Anda ingin keluar dari program?");
                System.out.println("Ketik T untuk kembali ke menu awal, atau Y untuk keluar dari program:");
                set = datain.nextLine().charAt(0);
                switch (set) {
                    case 't':
                    case 'T':
                        status = true;
                        status1 = true;
                        break;
                    case 'y':
                    case 'Y':
                        status = false;
                        status1 = true;
                        break;
                    default:
                        System.out.println("\nMaaf inputan salah, mohon diulangi.\n");
                        break;
                }
            }
            while(status1 == false);
        }
        while(status == true);
    } 
}
