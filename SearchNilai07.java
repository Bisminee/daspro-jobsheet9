
import java.util.Scanner;

public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key, hasil = 0, jumlahInput;
        boolean penemuan = false;

        System.out.print("Masukkan banyaknya nilai yang ingin dimmasukkan: ");
        jumlahInput = sc.nextInt();

        int arrNilai[] = new int[jumlahInput];
        for(int i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan key: ");
        key = sc.nextInt();


        for(int i = 0; i < arrNilai.length; i++){
            if(key == arrNilai[i]){
                hasil = i;
                penemuan = true;
                break;
            }else{
                penemuan = false;
            }
        }

        if(penemuan){
            System.out.println();
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
            System.out.println();
        }else{
            System.out.println("Menu Tidak Tersedia");
        }
    }
}
