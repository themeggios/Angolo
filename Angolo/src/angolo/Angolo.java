package angolo;

public class Angolo extends ElementoGeometrico {
    private double gradi;
    private double primi;
    private double secondi;

    public Angolo(String nome, String unitaDiMisura, double gradi, double primi, double secondi) {
        super(nome, unitaDiMisura);
        if (gradi < 0 || primi < 0 || secondi < 0) {
            throw new IllegalArgumentException("Valori negativi non ammessi");
        }
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }

    public double getGradi() {
        return gradi;
    }

    public double getPrimi() {
        return primi;
    }

    public double getSecondi() {
        return secondi;
    }

    public void setGradi(double gradi) {
        if (gradi < 0) {
            throw new IllegalArgumentException("Valore negativo non ammesso");
        }
        this.gradi = gradi;
    }

    public void setPrimi(double primi) {
        if (primi < 0) {
            throw new IllegalArgumentException("Valore negativo non ammesso");
        }
        this.primi = primi;
    }

    public void setSecondi(double secondi) {
        if (secondi < 0) {
            throw new IllegalArgumentException("Valore negativo non ammesso");
        }
        this.secondi = secondi;
    }

    //conversioni
    public double convertiGradiARadianti() {
        return Math.PI * (gradi + primi / 60 + secondi / 3600) / 180;
    }

    public double convertiRadiantiAGradi(double radianti) {
        if (radianti < 0) {
            throw new IllegalArgumentException("Valore negativo non ammesso");
        }
        return radianti * 180 / Math.PI;
    }

    //operazioni aritmetiche
    public Angolo somma(Angolo altroAngolo) {
        double newGradi = this.gradi + altroAngolo.gradi;
        double newPrimi = this.primi + altroAngolo.primi;
        double newSecondi = this.secondi + altroAngolo.secondi;
        return new Angolo("Somma", "gradi", newGradi, newPrimi, newSecondi);
    }

    public Angolo sottrae(Angolo altroAngolo) {
        double newGradi = this.gradi - altroAngolo.gradi;
        double newPrimi = this.primi - altroAngolo.primi;
        double newSecondi = this.secondi - altroAngolo.secondi;
        return new Angolo("Differenza", "gradi", newGradi, newPrimi, newSecondi);
    }

    @Override
    public String toString() {
        return "Angolo: " + gradi + "° " + primi + "' " + secondi + "\"";
    }
}