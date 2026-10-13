import java.util.Scanner;
public class StudiKasus204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jenis;
        int juara, dokumen, pendanaan;

        System.out.println("=== CEK DANA PENGHARGAAN PRESTASI MAHASISWA ===");
        System.out.print("Nama mahasiswa  : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        jenis = input.nextLine().trim();

        System.out.println();
        System.out.println("--- HASIL PENGECEKAN ---");
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis kegiatan  : " + jenis);

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("Mandiri")) {

            System.out.print("Jumlah dokumen diupload (0-4)     : ");
            dokumen = input.nextInt();
            System.out.print("Peringkat juara (1/2/3, 0 jika bukan juara) : ");
             juara = input.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen >= 4) {
                    System.out.println("Status          : Berhak memperoleh dana penghargaan");
                    System.out.println("Alasan          : Juara " + juara + " dan dokumen lengkap (4 dokumen)");
                } else {
                    System.out.println("Status          : Tidak memperoleh dana penghargaan");
                    System.out.println("Alasan          : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen)");
                }
            } else {
                System.out.println("Status          : Tidak memperoleh dana penghargaan");
                System.out.println("Alasan          : Dana hanya untuk Juara 1, 2, atau 3");
            }

        }else if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen diupload (0-4)     : ");
             dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
             pendanaan = input.nextInt();
             
             if (pendanaan == 1) {
                if (dokumen >= 4) {
                    System.out.println("Status          : Berhak memperoleh dana penghargaan");
                    System.out.println("Alasan          : PKM lolos pendanaan dan dokumen lengkap (4 dokumen)");
                } else {
                    System.out.println("Status          : Tidak memperoleh dana penghargaan");
                    System.out.println("Alasan          : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen)");
                }
            } else {
                System.out.println("Status          : Tidak memperoleh dana penghargaan");
                System.out.println("Alasan          : PKM tidak lolos pendanaan");
            }

        } else if (jenis.equalsIgnoreCase("Lainnya")) {
            System.out.println("Status          : Tidak memperoleh dana penghargaan");
            System.out.println("Alasan          : Jenis kegiatan tidak termasuk ketentuan dana penghargaan");

        } else {
            System.out.println("Status          : Tidak dapat diproses");
            System.out.println("Alasan          : Jenis kegiatan tidak dikenali");
        }

        }
    }

