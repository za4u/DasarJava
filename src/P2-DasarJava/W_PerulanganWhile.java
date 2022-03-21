public class W_PerulanganWhile {
    public static void main(String[] args) {
        //While loop
        int x=0;
        System.out.println("Example of While Loop--");
        while(x<=10){
            System.out.printf("%d ",x);
            x++;
        }
        System.out.print("\n");
        //do-while loop
        int y=0;
        do {
            y = y + 10;
            System.out.println("I am insidee do block---" + y);
        }
        while (y<=50);
    }
}