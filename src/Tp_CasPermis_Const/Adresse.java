package Tp_CasPermis_Const;

public class Adresse   {

private String numero ;
private String voie ;
private String ville ;
private String cp ;
private  String nom ;
private  String prenom ;

public Adresse (String numero ,String voie,String ville,String cp,String nom, String prenom){

    this.cp=cp ;
    this.numero=numero;
    this.ville=ville;
    this.voie=voie;
    this.nom = validate(nom, 50);

    this.prenom = validate(prenom, 50);
}

    private String validate(String chaine, Integer taille) {
        if ( chaine.length() > taille ) {
            chaine = chaine.substring(0, 50);

        }
        return chaine ;

    }


}
