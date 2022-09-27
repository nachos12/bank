package bank.Client;

import bank.Compte.Compte;
import bank.Exception.BanqueException;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class Client {
    private String nom, prenom;
    private int age;
    private int numero;

    //private Compte[] comptes = new Compte[5];
    private Map<Integer, Compte> listeCompte = new Hashtable<Integer, Compte>();

    public Client(String nom, String prenom, int age, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }

    public Client() {

    }
/*
    public Compte[] getComptes() {
        return comptes;
    }
    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }
*/
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Map<Integer, Compte> getListeCompte() {
        return listeCompte;
    }

    public void setListeCompte(Map<Integer, Compte> listeCompte) {
        this.listeCompte = listeCompte;
    }

    /*
            public void ajouterCompte(Compte compte) throws BanqueException {
                for (int i = 0; i < comptes.length; i++) {
                    if (comptes[i] == null) {
                        comptes[i] = compte;
                        return;
                    }
                }
                System.out.println("trop de compte");
            }*/
    public void ajouterCompte(Compte unCompte) throws BanqueException {
        if (this.listeCompte.size() < 5) {
            this.listeCompte.put(unCompte.getNumero(), unCompte);
        } else {
            throw new BanqueException("deja  5 comptes ");
        }
    }

    /*public Compte getCompte(int numero) {
        for (Compte cpt : comptes) {
            if (cpt.getNumero() == numero) {
                return cpt;
            }
        }
        return null;
    }*/
    public Compte getCompte(int numero) {
        return this.listeCompte.get(numero);
    }


    /*public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }*/

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", listeCompte=" + listeCompte +
                '}';
    }
}
