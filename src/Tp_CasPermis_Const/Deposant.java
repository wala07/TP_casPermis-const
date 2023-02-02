package Tp_CasPermis_Const;

public class Deposant extends  Personne{

    private String cevilite ;
    private String mail;

    private Adresse Adresse ;


    public Deposant(String nom, String prenom,String cevilite , String mail , Adresse Adresse  ) {
        super(nom, prenom);
        this.cevilite = cevilite;
                this.mail= mail;
                        this.Adresse= Adresse;
    }

    @Override
    public String toString() {
        return "Deposant{" + "cevilite='" + cevilite + '\'' + ", mail='" + mail + '\'' + ", Adresse='" + Adresse + '\'' + '}';
    }



}
