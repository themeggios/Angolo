package angolo;

public class Main {

    public static void main(String[] args) {
        try {
            Angolo angolo1 = new Angolo("Angolo 1", "gradi", 30, 15, 45);
            Angolo angolo2 = new Angolo("Angolo 2", "gradi", 20, 30, 15);

            System.out.println(angolo1.toString());
            System.out.println("Radianti: " + angolo1.convertiGradiARadianti());

            Angolo somma = angolo1.somma(angolo2);
            System.out.println("Somma: " + somma.toString());

            Angolo differenza = angolo1.sottrae(angolo2);
            System.out.println("Differenza: " + differenza.toString());

            angolo1.setGradi(-10); // Should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
