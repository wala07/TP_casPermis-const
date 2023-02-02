package Tp_CasPermis_Const;

public class Deposant extends  Personne{

    private String cevilite ;
    private String mail;

    private Adresse Adresse ;


    public Deposant(String nom, String prenom,String cevilite , String mail , Adresse Adresse  ) {
        super(nom, prenom);
        this.cevilite = validate(cevilite,50);
                this.mail= validate(mail,50);
                        this.Adresse= Adresse;
    }

    @Override
    public String toString() {
        return "cevilite : " + this.cevilite + '\'' + ", mail : " + this.mail + '\'' + this.Adresse.toString() + '}';
    }



}
