import java.util.ArrayList;
import java.util.List;

public class SpravaMazlicku {

    /** Vrátí průměrný věk mazlíčků v letech. Při prázdném seznamu vrací 0.0. */
    public double vypocetPrumernehoVeku(List<Mazlicek> seznam) {
        if (seznam == null || seznam.isEmpty()) return 0.0;
        double soucet = 0.0;
        for (Mazlicek m : seznam) {
            soucet += m.getVek();
        }
        return soucet / seznam.size();
    }

    /** Vrátí průměrnou váhu mazlíčků v kg. Při prázdném seznamu vrací 0.0. */
    public double vypocetPrumerneVahy(List<Mazlicek> seznam) {
        if (seznam == null || seznam.isEmpty()) return 0.0;
        double soucet = 0.0;
        for (Mazlicek m : seznam){
            soucet += m.getVaha();
        }
        return soucet / seznam.size();
    }

    /** Najde mazlíčka podle jména (case-insensitive). Když nenajde, vrátí null. */
    public Mazlicek najdiMazlickaPodleJmena(String jmeno, List<Mazlicek> seznam) {
        if (jmeno == null || seznam == null) return null;
        String hledane = jmeno.trim();
        for (Mazlicek m : seznam) {
            if (m.getJmeno().equalsIgnoreCase(hledane)){
                return m;
            }
        }
        return null;
    }

    /** Vrátí seznam všech mazlíčků daného druhu (case-insensitive). */
    public List<Mazlicek> filtrujMazlickyPodleDruhu(String druh, List<Mazlicek> seznam) {
        List<Mazlicek> vysledek = new ArrayList<>();
        if (druh == null || seznam == null) return vysledek;
        String hledany = druh.trim();
        for (Mazlicek m : seznam) {
            if (m.getDruh().equalsIgnoreCase(hledany)){
                vysledek.add(m);
            }
        }
        return vysledek;
    }
}
