package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    private String nom;

    private List<Etudiant> etudiants;


    public Classe(String nom) {
        this.nom = nom;
        this.etudiants = new ArrayList<>();

    }
    public Classe(String nom, Etudiant[] e) {
        this.nom = nom;
        this.etudiants = new ArrayList<>();
        for(Etudiant s: e){
            this.etudiants.add(s);
        }
    }




    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void saisirNotes() {
        Scanner in = new Scanner(System.in);

        for (Etudiant e: etudiants) {
            System.out.println(e.getNom() + " " + e.getPrenom() + "\nMatricule : " + e.getMatricule() + "\nNote de CC : ");
            e.setNoteCC(in.nextDouble());
            System.out.println("\nNote de TP : ");
            e.setNoteTP(in.nextDouble());
            System.out.println("\nNote de la SN : ");
            e.setNoteEx(in.nextDouble());
            System.out.println("\n\n");
        }
    }

    public  void afficheResultatEtudiants(){
        System.out.println("----------------------Resultat des etudiants-----------------");
        String ch = "";
        int i = 1;
        Algogene.tri(etudiants, new Etudiant("A", "B", 1, 2,  "18s") );
        for (Etudiant e:etudiants) {
            ch += "Rang : " + i + "e\n" + e.getNom() + " " + e.getPrenom() + "\nMatricule : " + e.getMatricule() + "\nNote de CC : " + e.getNoteCC() + "\nNote de TP : " + e.getNoteTP() + "\n" + "Note de la SN : " + e.getNoteEx() + "\nMoyenne : " + e.moyenne() + "\n\n\n";
            i++;
        }

        System.out.println(ch);
    }
}
