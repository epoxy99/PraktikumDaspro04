import java.util.Scanner;
public class StudiKasus104 {
    public static void main(String[] args) {
        int HargaPerCup = 18000;
        int jumlahCup = 0, uangBayar, totalHarga, diskon, totalBayar,kembalian,kurang;
        totalHarga = jumlahCup * HargaPerCup;
        diskon=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = input.nextInt();
        totalBayar = totalHarga - diskon;
        kembalian = uangBayar - totalBayar;
        kurang = totalBayar - uangBayar;
        if (totalBayar >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        
        if (uangBayar>=totalBayar) {
            System.out.println("Kembalian: " + (uangBayar - totalBayar));
        } else {
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

    }
}