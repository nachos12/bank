package bank.Compte;

public class CompteASeuil extends Compte {
    private double seuil;

    public CompteASeuil() {
    }

    public CompteASeuil(int numero, double solde, double seuil) {
        super(solde,numero);
        this.seuil = seuil;
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "seuil=" + seuil +
                '}';
    }

    public void retirer(double val) {
        if(this.getSolde()-val > this.seuil) {
            this.setSolde(this.getSolde()-val);
            System.out.println("ok");
        }else {
            System.out.println("seuil depasser");
        }
    }
}
