package Tp_CasPermis_Const;

public class Deposant extends  Personne{

    public String cevilite ;
    public String mail;
    public String Adresse;

    @Override
    public String toString() {
        return "Deposant{" + "cevilite='" + cevilite + '\'' + ", mail='" + mail + '\'' + ", Adresse='" + Adresse + '\'' + '}';
    }

    public Deposant(String nom, String prenom) {
        super(nom, prenom);
    }

}
