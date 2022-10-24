package entidad;

public class Cartas {
    private String palo;
    private Integer numero;

    public Cartas() {
    }

    public Cartas(String palo, Integer numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  "Palo= " + palo + " Numero= " + numero;
    }
    
}