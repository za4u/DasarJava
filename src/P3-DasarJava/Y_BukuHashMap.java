import java.util.HashMap;
import java.util.Map;
public class Y_BukuHashMap {
    public static void main(String[] args) {
        //membuat objek hashmap
        HashMap<String, X_Buku>books = new HashMap<>();
        //membuat objek buku
        X_Buku bukuJava = new X_Buku("Tutorial java", "Petani Kode");
        X_Buku bukuKotlin = new X_Buku("Pemrograman kotlin","Petani Kode");
        X_Buku bukuAndroid = new X_Buku("Pemrograman Android", "Petani Kode");
        //mengisi objek hashmap dengan objek buku
        books.put("java",bukuJava);
        books.put("kotlin",bukuKotlin);
        books.put("android",bukuAndroid);
        //print keys
        System.out.println("\nDaftar key: ");
        for(String i:books.keySet()){
            System.out.println(i);
        }
        //print value
        System.out.println("\nDaftar value: ");
        for(X_Buku aBook:books.values()) {
            System.out.println("Title: " + aBook.getTitle() + ", Author: " + aBook.getAuthor());
        }
        //cetak semua buku
        for(Map.Entry b: books.entrySet()){
            X_Buku buku=(X_Buku) b.getValue();
            System.out.println(b.getKey()+": "+buku.getTitle());
        }
    }
}