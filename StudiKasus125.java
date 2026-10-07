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
