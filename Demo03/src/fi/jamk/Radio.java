
package fi.jamk;

public class Radio {
    private String nimi;
    private boolean power;
    private int volume;
    private double hz;
    
    public Radio(String nimi, boolean power, int volume, double hz) {
        this.nimi = nimi;
        this.power = power;
        this.volume = volume;
        this.hz = hz;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 1 && volume <=10) // Määritetään volume alue 1-10
        this.volume = volume;
        else if (volume < 0) // Jos volumea laskee alle yhden, sammuu radio
        power = false;
    }

    public double getHz() {
        return hz;
    }

    public void setHz(double hz) {
        if (hz >= 80.0 && hz <110.0) // Määritetään taajuusalue
        this.hz = hz;
    }
    
        public String annaTiedot () {
        return this.nimi + ", päällä? " + this.power + " volume:" + this.volume + " " + this.hz + " Hz";
    }
    
    
    
}
