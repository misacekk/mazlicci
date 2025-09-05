import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpravaMazlicku sprava = new SpravaMazlicku();
        List<Mazlicek> seznam = new ArrayList<>();

        // pár ukázkových dat
        seznam.add(new Mazlicek("Rex", "pes", 5, 22.4));
        seznam.add(new Mazlicek("Micka", "kočka", 3, 4.1));

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Přidat mazlíčka");
            System.out.println("2 - Vypsat všechny mazlíčky");
            System.out.println("3 - Vypsat průměrný věk");
            System.out.println("4 - Vypsat průměrnou váhu");
            System.out.println("5 - Vyhledat mazlíčka podle jména");
            System.out.println("6 - Filtrovat mazlíčky podle druhu");
            System.out.println("0 - Konec");
            System.out.print("Volba: ");

            int volba = sc.nextInt();
            sc.nextLine(); // odchytí zbytek řádku po nextInt/nextDouble

            switch (volba) {
                case 1 -> {
                    System.out.print("Jméno: ");
                    String jmeno = sc.nextLine().trim();
                    System.out.print("Druh: ");
                    String druh = sc.nextLine().trim();
                    System.out.print("Věk (roky): ");
                    int vek = sc.nextInt();
                    System.out.print("Váha (kg): ");
                    double vaha = sc.nextDouble();
                    sc.nextLine();

                    seznam.add(new Mazlicek(jmeno, druh, vek, vaha));
                    System.out.println("Mazlíček přidán.");
                }
                case 2 -> {
                    if (seznam.isEmpty()) {
                        System.out.println("Seznam je prázdný.");
                    } else {
                        for (Mazlicek m : seznam) {
                            System.out.println(m);
                        }
                    }
                }
                case 3 -> {
                    double prumerVek = sprava.vypocetPrumernehoVeku(seznam);
                    System.out.printf("Průměrný věk: %.2f let%n", prumerVek);
                }
                case 4 -> {
                    double prumerVaha = sprava.vypocetPrumerneVahy(seznam);
                    System.out.printf("Průměrná váha: %.2f kg%n", prumerVaha);
                }
                case 5 -> {
                    System.out.print("Zadej jméno: ");
                    String hledane = sc.nextLine().trim();
                    Mazlicek nalezen = sprava.najdiMazlickaPodleJmena(hledane, seznam);
                    if (nalezen != null) {
                        System.out.println("Nalezen: " + nalezen);
                    } else {
                        System.out.println("Mazlíček se jménem \"" + hledane + "\" nebyl nalezen.");
                    }
                }
                case 6 -> {
                    System.out.print("Zadej druh: ");
                    String hledanyDruh = sc.nextLine().trim();
                    List<Mazlicek> vysledek = sprava.filtrujMazlickyPodleDruhu(hledanyDruh, seznam);
                    if (vysledek.isEmpty()) {
                        System.out.println("Žádný mazlíček druhu \"" + hledanyDruh + "\" nebyl nalezen.");
                    } else {
                        System.out.println("Nalezeni mazlíčci:");
                        for (Mazlicek m : vysledek) {
                            System.out.println(m);
                        }
                    }
                }
                case 0 -> {
                    System.out.println("Program ukončen. Ahoj!");
                    return;
                }
                default -> System.out.println("Neplatná volba.");
            }
        }
    }
}
