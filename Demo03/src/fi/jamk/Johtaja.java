

package fi.jamk;

public class Johtaja extends Tyontekija {
        private String auto;
        private double bonus;
    
    public Johtaja(String nimi, String asema, double palkka, String auto, double bonus){
        super(nimi, asema, palkka);
        this.auto = auto;
        this.bonus = bonus;
        
    }

        public String getAuto() {
            return auto;
        }

        public void setAuto(String auto) {
            this.auto = auto;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }
        
        public String getTiedot() {
            return super.annaTiedot() + " " + this.auto + " Bonukset: " + this.bonus;
        }
        
      //  Johtaja boss = new Johtaja("Bill Gates", "Pomo", 200000, "Volvo S60", 50000);
        
}