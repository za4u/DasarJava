import java.util.HashMap;
import java.util.Map;
public class Y_BukuHashMap {
    public static void main(String[] args) {
        //membuat objek hashmap
        HashMap<String, Buku>books = new HashMap<>();
        //membuat objek buku
        Buku bukuJava=new Buku("Tutorial java", "petani kode");
        Buku bukuKotlin=new Buku("Pemrogramana kotlin","Petani Kode");
        Buku bukuAndroid=new Buku("Pemrogramana Android", "Petani Kode");
        //mengisi objek hashmap dengan objek buku
        books.put("java",bukuJava);
        books.put("kotlin",bukuKotlin);
        books.put("android",bukuAndroid);
        //print keys
        System.out.println("\nDaftar key: ");
        for(String i:books.keySet()){
            System.out.println("Title: "+aBook.getTitle()+", Author: "+aBook.getAuthor());
        }
        //cetak semua buku
        for(Map.Entry b: books.entrySet()){
            Buku buku=(Buku) b.getValue();
            System.out.println(b.getKey()+": "+buku.getTitle());
        }
    }
}