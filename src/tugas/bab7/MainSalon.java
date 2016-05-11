package mainsalon;
import java.util.Scanner;
public class MainSalon {
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);
        SalonKecantikan sal;     System.out.println("==================================="); System.out.println("            SALON CUCOK       ");
System.out.println("===================================");
        System.out.print("Nama                : ");
        String nama = input.nextLine();
        System.out.println("Jenis Kartu Member  : ");
        System.out.print("1. Premium\n2. Gold\n3. Silver\n Pilihan : ");
        String member = input.nextLine();
        if (member.equalsIgnoreCase("1")){
            sal = new classpremium();
            sal.layanan();
            sal.transaksi();
        } else if (member.equalsIgnoreCase("2")){
            sal = new classgold();
            sal.layanan();
            sal.transaksi();
        } else if (member.equalsIgnoreCase("3")){
            sal = new classsilver();
            sal.layanan();
            sal.transaksi();
        } else {
            sal = new classnonmember();
            sal.layanan();
            sal.transaksi();
        }
    }
}
