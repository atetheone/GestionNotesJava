package com.company;

import java.util.Objects;

public class Etudiant implements Compare{
    private String nom, prenom, matricule;
    private int sexe;
    public static final int HOMME = 1,
                      FEMME = 2;
    private int age;
    private double moyenne,
            noteCC,
            noteTP,
            noteEx;

    public Etudiant(String nom, String prenom,  int sexe, int age, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.sexe = sexe;
        this.age = age;
    }

    public Etudiant(String nom, String prenom, int sexe, int age, String matricule, int noteCC, int noteTP, int noteEx) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.matricule = matricule;
        if (noteCC >= 0 && noteCC <= 20)
            this.noteCC = noteCC;
        if (noteTP >= 0 && noteTP <= 20)
            this.noteTP = noteTP;
        if (noteEx >= 0 && noteEx <= 20)
            this.noteEx = noteEx;
    }

    public void attribNoteCC(int noteCC){
        if (noteCC >= 0 && noteCC <= 20)
            this.noteCC = noteCC;
        else
            System.out.println("Note mal formalisée");
    }

    public void attribNoteTP(int noteTP){
        if (noteTP >= 0 && noteTP <= 20)
            this.noteTP = noteTP;
        else
            System.out.println("Note mal formalisée");
    }

    public void attribNoteEx(int noteEx){
        if (noteEx >= 0 && noteEx <= 20)
            this.noteEx = noteEx;
        else
            System.out.println("Note mal formalisée");
    }

    public void attribNotes(int noteCC, int noteTP, int noteEx){
        if ((noteEx >= 0 && noteEx <= 20) && (noteTP >= 0 && noteTP <= 20) && (noteCC >= 0 && noteCC <= 20)) {
            this.noteCC = noteCC;
            this.noteTP = noteTP;
            this.noteEx = noteEx;
        }
        else
            System.out.println("Note mal formalisée");
    }


    public double moyenne() {
        moyenne = noteCC * 0.2 + noteTP * 0.1 + noteEx * 0.7;
        return moyenne;
    }



    @Override
    public String toString() {
        String ch = "Etudiant : " + this.nom + " " + this.prenom + "\nSexe : ";
        switch (sexe){
            case HOMME :
                ch += "Homme";
                break;
            case FEMME :
                ch += "Femme";
                break;
        }
        ch += "\nAge : " + this.age + " ans\nMatricule : " + this.matricule;

        return ch;
    }

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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getNoteCC() {
        return noteCC;
    }

    public void setNoteCC(double noteCC) {
        this.noteCC = noteCC;
    }

    public double getNoteTP() {
        return noteTP;
    }

    public void setNoteTP(double noteTP) {
        this.noteTP = noteTP;
    }

    public double getNoteEx() {
        return noteEx;
    }

    public void setNoteEx(double noteEx) {
        this.noteEx = noteEx;
    }

    public  void afficheResultat(){
        System.out.println(nom + " " + prenom + "\nNote de CC : " + getNoteCC() + "\nNote de TP : " + getNoteTP() + "\n" + "Note de la SN : \n" + getNoteEx() + "Moyenne : " + moyenne() + "\n\n");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(matricule, etudiant.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule);
    }

    public boolean sup( Object x, Object y ) {
        return ((Etudiant) x).moyenne() > ((Etudiant) y).moyenne();
    }
}
