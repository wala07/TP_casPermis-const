package Tp_CasPermis_Const;

public class Architecte {
    private String conseilRegional ;
    private  String telephone ;
    private Adresse adresse ;

    public Architecte(String nom, String prenom, String conseilRegional,boolean inscriptionOrdre, Adresse adresse, String telephone){

        super(nom , prenom );


        this.conseilRegional = ;
        this.inscriptionOrdre = inscriptionOrdre;
        this.adresse = adresse;
        if (telephoneValide(telephone))
        {
            this.telephone = telephone;
        }else{ this.telephone = "";
        }
        Maj_conseilRegional();
    }


}
