public class Banchettodiutilizzo {
    public static void main(String[] args) {
        // creazione oggetto cuffie
        Cuffie cuffieTool = new Cuffie(112, "E-445", "Sony", 22.03, 22, "AQUA", false);

        // stampa dettagli cuffie
        System.out.println("Il prodotto selezionsto è" + " " + cuffieTool);// cella di memoria
        System.out.println("Codice" + " " +  cuffieTool.getCodice());
        System.out.println("Marca" + " " +  cuffieTool.getMarca());
        System.out.println("Prezzo" + " " +  cuffieTool.getPrezzo()+ " " + " " + " " + cuffieTool.getCalcolaPrezzoTotale());
    
        
        // creazione oggetto Smartphone
        Smartphone phoneTool = new Smartphone(201, "iPhone 15", "Apple", 999.99, 22, 123456789, 512.0);

        // Stampa dettagli smartphone
        System.out.println("Il prodotto selezionato è: " + phoneTool.getNome());
        System.out.println("Codice: " + phoneTool.getCodice());
        System.out.println("Nome: " + phoneTool.getNome());
        System.out.println("Prezzo totale: " + phoneTool.calcolaPrezzoTotale());
        System.out.println("Codice IMEI: " + phoneTool.getCodiceIMEI());
        System.out.println("Memoria: " + phoneTool.getMemoria() + " GB");

        // creazione oggetto televisore
        Televisore tvTool = new Televisore(301, "Bravia X90J", "Sony", 1299.99, 22, 55, true);

        // stampa dettagli televisore
        System.out.println("Il prodotto selezionato è: " + tvTool);
        System.out.println("Codice: " + tvTool.getCodice());
        System.out.println("Nome: " + tvTool.getNome());
        System.out.println("Prezzo con IVA: " + tvTool.getCalcolaPrezzoTotale());
        System.out.println("Pollici: " + tvTool.getPollici());
        System.out.println("Smart TV: " + (tvTool.isSmartTV() ? "Sì" : "No"));

}
}
