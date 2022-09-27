package org.example;

import bank.Client.Client;
import bank.Compte.CompteASeuil;
import bank.Compte.CompteASeuilRemunere;
import bank.Compte.CompteRemunere;
import bank.Exception.BanqueException;


public class Main {
    public static void main(String[] args) {

       /* System.out.println("Hello world!");
        Point2D p;

        Point2D p2 = new Point2D(1, 2);
        Point3D p3 = new Point3D(1, 2, 3);
        p3.afficher();
        p3.translater(1, 2, 3);
        p2.afficher();
        p2.translater(1, 2);
        p2.afficher();
        p3.afficher();
*/
     /*   Client client2 = new Client("toto", "titi", 27, 1);
        System.out.println(client2.toString());
        Compte c = new Compte(1, 100);
        client2.ajouterCompte(c);
        client2.ajouterCompte(c);
        c.ajouter(150);
        client2.ajouterCompte(c);
        c.retirer(50);
        System.out.println(client2.toString());
        System.out.println(  c.toString());
        Client client = new Client("toto", "titi",27,01);
        Compte compteCourant = new Compte(478,100);
        client.ajouterCompte(compteCourant);
        System.out.println(client.toString());
        System.out.println(Arrays.toString(client.getComptes()));
        CompteRemunere cr = new CompteRemunere(500, 1000, 0.002);
        CompteASeuil cj = new CompteASeuil(12,14000,0);
        CompteASeuilRemunere cas = new CompteASeuilRemunere(81, 250, 0.0025, 25);
        client.ajouterCompte(cr);
        client.ajouterCompte(cj);
        client.ajouterCompte(cas);
        System.out.println(client.toString());
        System.out.println(Arrays.toString(client.getComptes()));
        System.out.println(client.getCompte(81).getSolde());
        client.getCompte(81).retirer(20);
        System.out.println(client.getCompte(81).getSolde());
        client.getCompte(81).retirer(20);
        System.out.println(client.getCompte(81).getSolde());
*/
        Client c = new Client("toto", "titi", 1, 1);

        try{
            c.ajouterCompte(new CompteRemunere(1,1000,0.002));
            c.ajouterCompte(new CompteASeuilRemunere(2, 5000, 0.04, 1));
            c.ajouterCompte(new CompteASeuil(3, 15000, 1));
        } catch (BanqueException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c);
    }
}
