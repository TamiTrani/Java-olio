
package Volvo;


public class S60T6 extends S60 {
    private String vari;
    private int kw;

public S60T6 (String malli, boolean awd, boolean gearbox, String vari, int kw){
    super(malli, awd, gearbox);
    this.vari = vari;
    this.kw = kw;
    }

    public String getVari() {
        return vari;
    }

    public void setVari(String vari) {
        this.vari = vari;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }
    
    public String getTiedot() {
        return super.annaTiedot() + ", väri: " + this.vari + ", Teho: " + this.kw + "kW";
        }
    
}
