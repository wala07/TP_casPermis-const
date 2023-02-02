package Tp_CasPermis_Const;



abstract class Personne {
    private String nom;
    private String prenom;
    private boolean validate;


    public Personne(String nom, String prenom) {
        this.nom = validate(nom, 50);

        this.prenom = validate(prenom, 50);
    }

    private String validate(String chaine, Integer taille) {
        if ( chaine.length() > taille ) {
         chaine = chaine.substring(0, 50);

        }
return chaine ;

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
