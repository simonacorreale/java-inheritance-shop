// Televisori smart o no
public class Televisore extends Prodotto {
    private final int pollici;
    private final boolean smartTV;

    public Televisore(int codice, String nome, String marca, double prezzo, double iva, int pollici, boolean smartTV) {
        super(codice, nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smartTV = smartTV;
    }

// getter per pollici
    public int getPollici() {
        return pollici;
    }

// getter per smartTV
    public boolean isSmartTV() {
        return smartTV;
    }
// override
    @Override
    public String toString() {
        return super.toString() + ", Dimensioni = " + pollici + "\", Smart = " + (smartTV);
    }

}
