
package ohtu.verkkokauppa;

import java.util.ArrayList;

public class Kirjanpito implements KirjanpitoIO {
     
    private ArrayList<String> tapahtumat;
        private KirjanpitoIO kirIO;

    public Kirjanpito() {
        this.kirIO = kirIO;
        tapahtumat = new ArrayList<String>();
    }
    
    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
