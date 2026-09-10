import java.util.Scanner;

public class programFlowchart {
    
    public static void main (String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        x = 1;
        System.out.println("Program Menentukan Bilangan Ganjil-Genap dari Angka 1 hingga ke-n");
        System.out.println("Silakan memasukkan bilangan terahir(bilangan ke-n)!");
        y = input.nextInt();

        while (x <=y) {
            if (x%2 ==0){
                System.out.println(x+ " adalah bilangan genap");
            } else {
                System.out.println(x+ " adalah bilangan ganjil");
            }
            x++;
        }
    }
}