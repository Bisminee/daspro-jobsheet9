import java.util.Scanner;
public class ArrayNilaiRata07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMhs;
        int mhsLulus = 0;
        double rata2, rata2TidakLulus, total = 0, totalTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs = sc.nextInt();
        int nilaiMhs[] = new int[jumlahMhs];

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70){
                mhsLulus++;
            }
        }
        for(int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] <= 70){
                totalTidakLulus += nilaiMhs[i];
            }else {
                total += nilaiMhs[i];
            }

        }

        rata2 = total/mhsLulus;
        rata2TidakLulus = totalTidakLulus/(jumlahMhs-mhsLulus);
        System.out.println("\nJumlah mahasiswa lulus = " + mhsLulus + " mahasiswa");
        System.out.println("Jumlah mahasiswa tidak lulus = " +(jumlahMhs - mhsLulus) + "mahasiswa");
        System.out.println("Rata-rata nilai mahasiswa lulus = " + rata2);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        
    }
}
