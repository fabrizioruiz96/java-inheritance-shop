public class Televisori extends Prodotto {

    private int pollici;
    private boolean smart;

    public Televisori(String nome, String marca, double prezzo, double iva, int pollici, boolean smart) {
        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Nuovo televisore: "
                + super.toString()
                + ", prezzo ivato = "+ getPrezzoIvato() 
                + ", pollici = " + pollici
                + ", è smart = " + smart;
    }
}