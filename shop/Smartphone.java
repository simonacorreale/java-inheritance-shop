// Codice IMEI e Qualità a memoria

public class Smartphone extends Prodotto {

    private final int imeiCodice;
    private double memorySpace;

    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, int imeiCodice, double memorySpace) {
        super(codice, nome, marca, prezzo, iva);
        this.imeiCodice = imeiCodice; 
        this.memorySpace = memorySpace;
    }

    // getter per il codice IMEI
    public int getCodiceIMEI() {
        return imeiCodice;
    }

    // getter per la memoria
    public double getMemoria() {
        return memorySpace;
    }

    // setter per la memoria
    public void setMemoria(double memorySpace) { 
        this.memorySpace = memorySpace;
    }
}
