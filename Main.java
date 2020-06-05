package com.company;

public class Main {

    public static void main(String[] args) {
         Etudiant a = new Etudiant("Ate", "Tougué", 1, 19, "18S08384"),
                b = new Etudiant("Ali", "Ahmat", 1, 22, "17S45781"),
                c = new Etudiant("Abdel", "Idriss", 1, 20, "18S09489"),
                 d = new Etudiant("Marie", "Antoinette", 2, 21, "17S99998"),
                e = new Etudiant("Mariam", "Jeanne", 2, 18, "18S08901"),
                f = new Etudiant("Erpès", "Sid", 1, 23, "16S01249"),
                g = new Etudiant("Naroco", "Vidco", 1, 19, "18SC0V1D");

        Etudiant[] etu = {a, b, c, d, e, f, g};

        a.attribNotes(14, 18, 20);
        b.attribNotes(12, 13, 9);
        c.attribNotes(10, 12, 10);
        d.attribNotes(18, 19, 19);
        e.attribNotes(8, 9, 7);
        f.attribNotes(15, 16, 8);
        g.attribNotes(19, 20, 19);

	    Classe in = new Classe("IN2", etu);
        //in.saisirNotes();

	    in.afficheResultatEtudiants();

    }
}
