import java.util.Scanner;
public class StudiKasus125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;
        System.out.print("Masukkan jumlah cup kopi yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = sc.nextInt();
        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
            totalBayar = totalHarga - diskon;
            System.out.println("Total harga:Rp " + totalHarga);
            System.out.println("Diskon:Rp " + diskon);
            System.out.println("Total bayar setelah diskon:Rp " + totalBayar);
            if (uangBayar >= totalBayar) {
                kembalian = uangBayar - totalBayar;
                System.out.println("Kembalian:Rp " + kembalian);
            } else {
                kurang = totalBayar - uangBayar;
                System.out.println("Uang tidak cukup, kurang:Rp" + kurang);
            }
        }
    }
}