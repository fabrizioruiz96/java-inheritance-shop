
import java.util.Random;

public class Smartphone extends Prodotto {

    private int imei;
    private int memoria;

    public Smartphone() {
        Random rnd = new Random();
        imei = rnd.nextInt(100000000, 1000000000);
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

}