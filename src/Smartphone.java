
import java.util.Random;

public class Smartphone extends Prodotto {

    private int imei;
    private int memoria;

    public Smartphone(String nome, String marca, double prezzo, double iva, int memoria) {
        super(nome, marca, prezzo, iva);
        Random rnd = new Random();
        imei = rnd.nextInt(100000000, 1000000000);
        this.memoria = memoria;
    }

    public int getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Nuovo smartphone: " 
                + super.toString()
                + ", prezzo ivato = "+ getPrezzoIvato() 
                + ", imei = " + imei
                + ", memoria = " + memoria;
    }

}