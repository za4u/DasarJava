import java.util.InputMismatchException;
import java.util.Scanner;

public class ZZ_ExceptHeading {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("masukkan nilai (integer):");
            int value = input.nextInt();
            System.out.println("hasil nilai masukkan x2=" + (value * 2));
        }catch (InputMismatchException ex) {
            System.out.println("periksa kembali inputan anda");
        }finally {
            System.out.println("terima kasih");
        }
    }
}