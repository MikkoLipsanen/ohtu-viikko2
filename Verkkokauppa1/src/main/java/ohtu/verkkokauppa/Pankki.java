package ohtu.verkkokauppa;

public class Pankki implements PankkiIO {

    private KirjanpitoIO kirIO;

    public Pankki(KirjanpitoIO kirIO) {
        this.kirIO = kirIO;
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirIO.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
