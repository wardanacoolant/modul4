package modul4;
import java.util.Random;
import java.util.Scanner;

public class Dadu
{
    int gamePemain, gameLawan, gameSeri;
    public int random()
    {
        Random acak = new Random();
        int dadu = acak.nextInt(6)+1;
        return dadu;
    }
    public void setPemain()
    {
        this.gamePemain++;
    }
    public void setLawan()
    {
        this.gameLawan++;
    } 
    public void setSeri()
    {
        this.gameSeri++;
    }
    public int getPemain()
    {
        return gamePemain;
    }
    public int getLawan()
    {
       return gameLawan;
    }
    public int getSeri()
    {
        return gameSeri;
    }
    public void garis(){
        System.out.println("____________________________________");
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        Dadu dadu = new Dadu();
        char pil;
        int dadu1 = 0, dadu2 = 0;
        System.out.print("Masukan jumlah putaran permainan : ");
        int putaran = Integer.parseInt(input.nextLine());
        dadu.garis();
        for(int m=0; m<putaran; m++){
            System.out.println("Putaran ke-" + (m+1));
            System.out.println("Giliran pemain 1");
            System.out.print("Lempar dadu sekarang? (Y/N) : ");
            pil = input.nextLine().charAt(0);
            
            if(pil == 'y' || pil =='Y')
            {    
                dadu1 = dadu.random();
                System.out.println("Dadu pemain 1 : "+dadu1);
                dadu.garis();
            }
            else
            {
                System.out.println("Pemain 2 menang secara aklamasi!");
                break;
            }
            System.out.println("Giliran pemain 2");
            System.out.print("Lempar dadu sekarang? (Y/N) : ");
            pil = input.nextLine().charAt(0);
            if(pil == 'y' || pil =='Y')
            {    
                dadu2 = dadu.random();
                System.out.println("Dadu pemain 2 : "+dadu2);
                dadu.garis();
            }
            else
            {
                System.out.println("Pemain 1 menang secara aklamasi!");
                break;
            }
            if(dadu1>dadu2)
            {
                dadu.setPemain();
            }
            if(dadu1<dadu2)
            {
                dadu.setLawan();
            }
            if(dadu1==dadu2)
            {
                dadu.setSeri();
            }
        }
            System.out.println("Hasil :");
            System.out.println("Jumlah menang pemain 1 : "+dadu.getPemain());
            System.out.println("Jumlah menang pemain 2 : "+dadu.getLawan());
            System.out.println("Jumlah seri : "+dadu.getSeri());
            dadu.hasilAkhir();
    }
    public void hasilAkhir()
    {
        if(gamePemain > gameLawan)
            System.out.println("Pemain 1 menang!");
        if(gamePemain < gameLawan)
            System.out.println("Pemain 2 menang!");
        if(gamePemain == gameLawan)
            System.out.println("Draw!");
        else
            System.out.println("");
    }   
}
