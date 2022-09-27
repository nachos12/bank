package bank.Compte;

import bank.Interface.ICompteASeuil;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil {

    private double seuil;

    public CompteASeuilRemunere(int numero, double solde, double taux, double seuil) {
        super(numero, solde, taux);
        this.seuil = seuil;
    }

    @Override
    public double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    public void retirer(double val) {
        if (this.getSolde() - val > this.seuil) {
            this.setSolde(this.getSolde() - val);
            System.out.println("ok");
        } else {
            System.out.println("seuil depasser");
        }
    }

    @Override
    public String toString() {
        return "CompteASeuilRemunere{" +
                "seuil=" + seuil +
                "} " + super.toString();
    }
}
