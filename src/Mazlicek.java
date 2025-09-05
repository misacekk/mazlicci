public class Mazlicek {
    private String jmeno;
    private String druh;   // např. "pes", "kočka", "králík"
    private int vek;       // roky
    private double vaha;   // kg

    public Mazlicek(String jmeno, String druh, int vek, double vaha) {
        this.jmeno = jmeno;
        this.druh = druh;
        this.vek = vek;
        this.vaha = vaha;
    }

    // Gettery
    public String getJmeno() { return jmeno; }
    public String getDruh()  { return druh; }
    public int getVek()      { return vek; }
    public double getVaha()  { return vaha; }

    // Settery
    public void setJmeno(String jmeno) { this.jmeno = jmeno; }
    public void setDruh(String druh)   { this.druh = druh; }
    public void setVek(int vek)        { this.vek = vek; }
    public void setVaha(double vaha)   { this.vaha = vaha; }

    @Override
    public String toString() {
        return "Jméno: " + jmeno + ", Druh: " + druh + ", Věk: " + vek + ", Váha: " + vaha + " kg";
    }
}
