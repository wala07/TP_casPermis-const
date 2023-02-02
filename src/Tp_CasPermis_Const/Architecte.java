package Tp_CasPermis_Const;

import  java.lang.String ;
public class Architecte extends Personne{
    private String conseilRegional ;
    private  String telephone ;
    private Adresse adresse ;
    private boolean inscriptionOrdre ;

    public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone){

        super(nom , prenom );



        this.conseilRegional = validate(conseilRegional,50) ;
        this.inscriptionOrdre = inscriptionOrdre;
        this.adresse = adresse;
        if (telephoneValide(telephone))
        {
            this.telephone = telephone;
        }
        else
        {
            this.telephone = "";
        }
        Maj_conseilRegional();
    }

    private boolean telephoneValide(String telephone){
      boolean state = false ;
      return  telephone.length()==10 ;
    }
    public void Maj_conseilRegional() {
        System.out.println(this.toString());
    }
    public String toString () {
        String chaine = this.nom + " "+this.prenom+ " "+this.telephone+" "+this.conseilRegional;
        if(!inscriptionOrdre){
            chaine += " "+ " non inscrit";
        } else {
            chaine += " "+ "inscrit";
        }
        return chaine;
    }




}
