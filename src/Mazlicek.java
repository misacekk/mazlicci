public class Mazlicek {

    private String jmeno;
    private String druh;
    private int vek;
    private int vaha;

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVaha() {
        return vaha;
    }

    public int getVek() {
        return vek;
    }

    public String getDruh() {
        return druh;
    }

    public Mazlicek (String jmeno, String druh, int vek, int vaha) {
        this.jmeno = jmeno;
        this.druh = druh;
        this.vek = vek;
        this.vaha = vaha;
    }

    public String toString() {
        return jmeno + "\n" + druh + "\n" + vek + "\n" + vaha;
    }
}