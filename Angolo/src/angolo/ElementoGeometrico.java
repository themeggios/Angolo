package angolo;

public abstract class ElementoGeometrico {
    private String nome;
    private String unitaDiMisura;

    public ElementoGeometrico(String nome, String unitaDiMisura) {
        this.nome = nome;
        this.unitaDiMisura = unitaDiMisura;
    }

    public String getNome() {
        return nome;
    }

    public String getUnitaDiMisura() {
        return unitaDiMisura;
    }

    @Override
    public String toString() {
        return "Elemento Geometrico: " + nome + " (" + unitaDiMisura + ")";
    }
}