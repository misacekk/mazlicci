import java.util.List;

public class SpravaMazlicku {
    public static double vypocetPrumernehoVeku(List<Mazlicek> seznam) {
        if (seznam.isEmpty()) return 0;
        double soucet = 0;
        for (Mazlicek m : seznam) {
            soucet += m.getVek();
        }
        return soucet / seznam.size();
    }
    public static double vypocetPrumerneVahy(List<Mazlicek> seznam) {
        if (seznam.isEmpty()) return 0;
        double soucet = 0;
        for (Mazlicek m : seznam) {
            soucet += m.getVaha();
        }
        return soucet / seznam.size();
    }
}