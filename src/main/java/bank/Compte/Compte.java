package bank.Compte;

import bank.Exception.BanqueException;

import java.util.Objects;

public class Compte {
    private double solde;
    private int numero;

    public Compte() {
        this(0, 0);
    }

    public Compte(double solde, int numero) {
        this.solde = solde;
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >= 0) {
            this.numero = numero;
        }
    }

    public void ajouter(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) throws BanqueException {
        this.solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + solde +
                ", numero=" + numero +
                '}';
    }
}
