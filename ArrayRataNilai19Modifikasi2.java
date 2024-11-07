import java.util.Scanner;

public class ArrayRataNilai19Modifikasi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;
        double rata2;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        int countLulus = 0;
        for (int nilai : nilaiMhs) {
            total += nilai;
            if (nilai > 70) { 
                totalLulus += nilai;
                countLulus++; 
            } else { 
                totalTidakLulus += nilai;
            }
        }

        rata2 = total / nilaiMhs.length;
        double rataLulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rataTidakLulus = (jumlahMahasiswa - countLulus > 0) ? totalTidakLulus / (jumlahMahasiswa - countLulus) : 0;

        System.out.println("Rata-rata Nilai = " + rata2);
        System.out.println("Rata-rata Nilai Lulus = " + rataLulus);
        System.out.println("Rata-rata Nilai Tidak Lulus = " + rataTidakLulus);
    }
}
