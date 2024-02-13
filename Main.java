import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Girilecek Kitap Adedi: ");
        int deger = in.nextInt();

        String k1, y1;
        for (int i = 1; i <= deger; i++) {
            System.out.print(i + ". kitap ismi: ");
            k1=in.next();
            System.out.print(i + ". kitap yazarı: ");
            y1=in.next();
            String[] dizi = {k1, y1};
            System.out.println(Arrays.toString(dizi));
        }


    }

}
