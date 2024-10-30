
import java.util.Scanner;

public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key, hasil = 0, jumlahInput;

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
                System.out.println();
                System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
                System.out.println();
                break;
            }else{
                System.out.println("\nNilai tidak dapat ditemukan\n");
                break;
            }
        }

        
    }
}
