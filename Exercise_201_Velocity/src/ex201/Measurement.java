package ex201;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Measurement implements Serializable {

    public LocalDate dat;
    public LocalTime zeit;
    
    public int vGEM,vERL;
    public int ueberdrueber;
    public String kz;

   
    public Measurement(LocalDate dat, LocalTime uhr, String kz, int sERL, int sGEM, int ueberdrueber) {
        this.dat = dat;
        this.zeit = uhr;
        this.kz = kz;
        this.vERL = sERL;
        this.vGEM = sGEM;
        this.ueberdrueber = sGEM - sERL;
    }

    public int getsErl() {
        return vERL;
    }    
    
    public String getKennzeichen() {
        return kz;
    }
    public int getsGem() {
        return vGEM;
    }

    public int getUeberschreitung() {
        return ueberdrueber;
    }
    
    public LocalDate getDatum() {
        return dat;
    }

    public LocalTime getUhrzeit() {
        return zeit;
    }

   


    
}
