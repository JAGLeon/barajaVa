package service;

import entidad.Cartas;
import java.util.ArrayList;
import java.util.Collections;

public class serviceCartas {

    ArrayList<Cartas> c = new ArrayList();
    ArrayList<Cartas> cRem = new ArrayList();

    public void barajar() {
        for (int i = 1; i < 11; i++) {
            switch (i) {
                case 8: {
                    Integer aux = 11;
                    c.add(new Cartas("Espadas", aux));
                    c.add(new Cartas("Copas", aux));
                    c.add(new Cartas("Basto", aux));
                    c.add(new Cartas("Oro", aux));
                    break;
                }
                case 9: {
                    Integer aux = 12;
                    c.add(new Cartas("Espadas", aux));
                    c.add(new Cartas("Copas", aux));
                    c.add(new Cartas("Basto", aux));
                    c.add(new Cartas("Oro", aux));
                    break;
                }
                default:
                    c.add(new Cartas("Espadas", i));
                    c.add(new Cartas("Copas", i));
                    c.add(new Cartas("Basto", i));
                    c.add(new Cartas("Oro", i));
                    break;
            }
        }
        Collections.shuffle(c);
    }

    public void siguienteCarta() {
        if (c.isEmpty()) {
            System.out.println("");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("Se llego al final del mazo");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("");

        } else {
            System.out.println("");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("Entregando la siguiente carta");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("");

            System.out.println(c.get(0));
            cRem.add(new Cartas(c.get(0).getPalo(), c.get(0).getNumero()));
            c.remove(0);
        }
    }

    public void cartasDisponibles() {
        System.out.println("");
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        System.out.println("Cartas disponibles");
        System.out.println("/-/-/-/-/-/-/-/-/-/");
        System.out.println("");

        System.out.println(c.size());
    }

    public void darCartas(int entregar) {
        if (c.size() > entregar) {
            System.out.println("");
            System.out.println("/-/-/-/-/-/-/-/-/");
            System.out.println("Entregando cartas");
            System.out.println("/-/-/-/-/-/-/-/-/");
            System.out.println("");

            for (int i = entregar; i > 0; i--) {
                System.out.println(c.get(i));
                cRem.add(new Cartas(c.get(i).getPalo(), c.get(i).getNumero()));
                c.remove(i);
            }
        } else {
            System.out.println("");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("No tenemos cartas suficientes");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("");

        }
    }

    public void cartasMonton() {
        System.out.println("");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Cartas que salieron del mazo");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("");
        cRem.forEach((cartas) -> {
            System.out.println(cartas);
        });
    }

    public void mostrarBaraja() {
        System.out.println("");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Mostrando las cartas sin sacar");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("");
        c.forEach((cartas) -> {
            System.out.println(cartas);
        });
    }

}
