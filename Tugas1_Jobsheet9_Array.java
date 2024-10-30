import java.util.Scanner;

public class Tugas1_Jobsheet9_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMhs;
        int mhsLulus = 0, nilaiTinggi = 0, nilaiRendah = 100;
        double rata2, total = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs = sc.nextInt();
        int nilaiMhs[] = new int[jumlahMhs];

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > nilaiTinggi){
                nilaiTinggi = nilaiMhs[i];
            }else if(nilaiMhs[i] < nilaiRendah){
                nilaiRendah = nilaiMhs[i];
            }
        }
        for(int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("\nJumlah mahasiswa lulus = " + mhsLulus + " mahasiswa");
        System.out.println("Rata-rata nilai = " + rata2);
    }
}
