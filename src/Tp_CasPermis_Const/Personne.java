package Tp_CasPermis_Const;

package Personne{

abstract class Personne {
    private String nom;
    private String prenom;

    public Personne() {
        super();
    }

    public Personne(String nom, String prenom) {
        this.nom = validate(nom, 5);

        this.prenom = validate(prenom, 3);
    }

    private String validate(String chaine, Integer taille) {


        public void validerChaine(String chaine , int taille){


        }


    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    //ABSTACTE
    public abstract String toString() ;
}
}