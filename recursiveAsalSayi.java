import java.util.Scanner;
public class recursiveAsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam=true;

        while(devam) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            if (asalMi(sayi, 2)) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
            System.out.print("Tekrar denemek istiyor musunuz? (E/H): ");
            String cevap = scanner.next();
            if (!cevap.equalsIgnoreCase("E")) {
                devam = false;
            }
        }
    }
    public static boolean asalMi(int sayi, int i) {
        if (sayi <= 2) {
            return sayi == 2;
        }
        if (sayi % i == 0) {
            return false;
        }
        if (i * i > sayi) {
            return true;
        }
        return asalMi(sayi, i+1);
    }
}
