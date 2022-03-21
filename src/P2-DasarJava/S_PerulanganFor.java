import java.sql.SQLOutput;
import java.util.Scanner;
public class S_PerulanganFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan jumlah perulangan :");
        int jml = input.nextInt();
        for(int i=0;i<jml;i++)
            System.out.println("Pemrograman Berorientasi objek dengan java");
    }
}