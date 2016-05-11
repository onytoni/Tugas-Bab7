package mainsalon;
public class classgold extends SalonKecantikan {
    @Override
    protected void transaksi() {
        double diskon = 0.15 * harga;
        double total = harga - diskon;
        System.out.print("Bayar? [Y/N] : ");
        String yesorno = input.next();
        if (yesorno.equalsIgnoreCase("Y")){
            System.out.println("Harga       : " + harga);
            System.out.println("Diskon      : " + diskon);
            System.out.println("Total       : " + total);
            System.out.print("Tunai       : ");
            int tunai = input.nextInt();
            System.out.println("Kembali     : "+(tunai-total));
            System.out.println("Terima Kasih");
            System.out.println("Selamat Datang Kembali");
        } else {
            System.out.println("Terima Kasih");
        }
    }
}
