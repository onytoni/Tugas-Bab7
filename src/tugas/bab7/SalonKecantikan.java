package mainsalon;
import java.util.Scanner;
public abstract class SalonKecantikan {
    public int pilihan1,pilihan2,harga;
    public String layanan;
    Scanner input = new Scanner(System.in);
    protected abstract void transaksi();
    public void layanan(){
        System.out.println("-----------------------------------");
        System.out.println("Silahkan Pilih: ");
        System.out.println("1. Jasa\n2. Produk\nPilihan: [1/2] ");
        pilihan1 = input.nextInt();
        switch (pilihan1){
            case 1 :System.out.println("-----------------------------------");
                    System.out.print("1. Pijat\n2. Facial\n3. Urut");
        System.out.print("Pilihan\n[Pijat/Facial/Urut] : ");
                    layanan = input.next();
                    if(layanan.equalsIgnoreCase("Pijat")){
                        harga = 100000;
                    } else if (layanan.equalsIgnoreCase("Facial")){
                        harga = 150000;
                    } else if (layanan.equalsIgnoreCase("Urut")){
                        harga = 85000;
                    }
                    break;
            case 2 : System.out.println("-----------------------------------");
                     System.out.print("1. Bedak\n2. Parfum\n3. Sabun");                    System.out.print("Pilihan\n[Bedak/Parfum/Sabun] : ");
                    layanan = input.next();
                    if(layanan.equalsIgnoreCase("Bedak")){
                        harga = 55000;
                    } else if (layanan.equalsIgnoreCase("Parfum")){
                        harga = 90000;
                    } else if (layanan.equalsIgnoreCase("Sabun")){
                        harga = 35000;
                    }
                    break;
        }
    }
}
