package ohtu.verkkokauppa;

public class Kauppa {

    
    private PankkiIO paIO;
    private ViiteIO viIO;
    private VarastoIO vaIO;
    private Ostoskori ostoskori;
    private String kaupanTili;

    public Kauppa(VarastoIO vaIO, PankkiIO paIO, ViiteIO viIO) {
        
        this.vaIO = vaIO;
        this.paIO = paIO;
        this.viIO = viIO;
        kaupanTili = "33333-44455";
    }

    public void aloitaAsiointi() {
        ostoskori = new Ostoskori();
    }

    public void poistaKorista(int id) {
        Tuote t = vaIO.haeTuote(id); 
        vaIO.palautaVarastoon(t);
    }

    public void lisaaKoriin(int id) {
        if (vaIO.saldo(id)>0) {
            Tuote t = vaIO.haeTuote(id);             
            ostoskori.lisaa(t);
            vaIO.otaVarastosta(t);
        }
    }

    public boolean tilimaksu(String nimi, String tiliNumero) {
        int viite = viIO.uusi();
        int summa = ostoskori.hinta();
        
        return paIO.tilisiirto(nimi, viite, tiliNumero, kaupanTili, summa);
    }

}
