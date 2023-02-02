package Tp_CasPermis_Const;

public class Adresse   {

private String numero ;
private String voie ;
private String ville ;
private String cp ;


public Adresse (String numero ,String voie,String ville,String cp){

    this.cp=cp ;
    this.numero=numero;
    this.ville=ville;
    this.voie=voie;

}

    private String validate(String chaine, Integer taille) {
        if ( chaine.length() > taille ) {
            chaine = chaine.substring(0, 50);

        }
        return chaine ;

    }
    public String toString(){
        return this.numero+" "+this.voie+ " "+this.ville+ " "+this.cp;
    }


}
