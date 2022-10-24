package cartas;

import java.util.Scanner;
import service.serviceCartas;

public class MainCartas {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        serviceCartas sc = new serviceCartas();

        sc.barajar();
        sc.siguienteCarta();
        sc.cartasDisponibles();
        System.out.println("");
        System.out.println("Cuantas cartas desea sacar");
        int pedir = read.nextInt();
        sc.darCartas(pedir);
        sc.cartasMonton();
        sc.mostrarBaraja();
    }

}
