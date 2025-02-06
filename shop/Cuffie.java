public class Cuffie extends Prodotto {

    private String colore;
    private boolean wireless;


    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
        super(codice, nome, marca, prezzo, iva);  
        this.colore = colore;
        this.wireless = wireless;
    }

// getter e setter cuffie
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
// getter e setter wirless
    public boolean getWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }


}
