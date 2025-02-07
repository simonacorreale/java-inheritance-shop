public class Banchettodiutilizzo {
    public static void main(String[] args) {
        Cuffie cuffieTool = new Cuffie(112, "E-445", "Sony", 22.03, 22, "AQUA", false);
       
        cuffieTool.getNome();
        cuffieTool.getMarca();
        cuffieTool.getPrezzo();


        System.out.println("Il prodotto selezionsto è" + " " + cuffieTool);// cella di memoria
        System.out.println("Il prodotto selezionsto è" + " " +  cuffieTool.getCodice());
        System.out.println("Il prodotto selezionsto è" + " " +  cuffieTool.getMarca());
        System.out.println("Il prodotto selezionsto è" + " " +  cuffieTool.getPrezzo()+ " " + " " + " " + cuffieTool.getCalcolaPrezzoTotale());

        
    }
    
}
