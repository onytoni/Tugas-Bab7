package mainsalon;
public class classnonmember extends SalonKecantikan{
    @Override
    protected void transaksi() {
    double diskon = 0;
    
    System.out.print("Bayar? [Y/N] : ");
        String yesorno = input.next();
        if (yesorno.equalsIgnoreCase("Y")){
            System.out.println("Harga       : "+harga);
            System.out.println("Diskon      : "+diskon);
            System.out.println("Total       : "+harga);
            System.out.print("Tunai       : ");
            int tunai = input.nextInt();
            System.out.println("Kembali     : "+(tunai-harga));
            System.out.println("Terima Kasih");
            System.out.println("Selamat Datang Kembali");
        } else {
            System.out.println("Terima Kasih");
        }
    } 
}
