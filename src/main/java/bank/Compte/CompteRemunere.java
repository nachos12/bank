package bank.Compte;

public class CompteRemunere extends Compte {
    private double taux;

    public CompteRemunere(double taux) {
        this.taux = taux;
    }

    public CompteRemunere(int numero, double solde, double taux) {
        super(solde, numero);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double calculerInterets() {
        return this.getTaux() * this.getSolde();
    }

    public void verserInterets() {
        double interets = this.calculerInterets();
        double newSolde = this.getSolde() + interets;
        this.setSolde(newSolde);
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "taux=" + taux +
                '}';
    }
}
