import java.util.Scanner;
public class StudiKasus225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, jenis;
        int jumlahDokumen, peringkat, statusPKM;
        System.out.print("Nama mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya):");
        jenis = sc.nextLine();
        System.out.print("Jumlah dokumen yang dikumpulkan: ");
        jumlahDokumen = sc.nextInt();
        UPPERCASE: jenis = jenis.toUpperCase();
        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Peringkat Juara : ");
            peringkat = sc.nextInt();
            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Dokumen lengkap. Dana penghargaan Diberikan");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Dokumen tidak lengkap. Dana penghargaan ditolak. Dokumen kurang: " + kurang);
                }
            }
        }
    }
}
