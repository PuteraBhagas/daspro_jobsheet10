import java.util.Scanner;

public class BioskopWithScanner25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = sc.nextInt();

            penonton[baris-1][kolom-1]= nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.next();

            if (next.equalsIgnoreCase("n")) {
                break;
                
            }
        }
    }
    
}
