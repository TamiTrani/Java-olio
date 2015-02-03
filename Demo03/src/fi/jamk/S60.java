/*

 */
package Volvo;


public class S60 {
    private String malli;
    private boolean awd;
    private boolean gearbox;
    
    public S60(String malli, boolean awd, boolean gearbox){
        this.malli = malli;
        this.awd = awd;
        this.gearbox = gearbox;
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public boolean isAwd() {
        return awd;
    }

    public void setAwd(boolean awd) {
        this.awd = awd;
    }

    public boolean isGearbox() {
        return gearbox;
    }

    public void setGearbox(boolean gearbox) {
        this.gearbox = gearbox;
    }
    
    public String annaTiedot(){
        return "Volvo S60 " + this.malli + ", neliveto: " + this.awd + ", manuaali: " + this.gearbox;
    }
    
}
