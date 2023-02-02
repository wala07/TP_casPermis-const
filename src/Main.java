import Tp_CasPermis_Const.Adresse;
import Tp_CasPermis_Const.Architecte;
import Tp_CasPermis_Const.Deposant;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse("13","avenu paris,","paris","75011");
        System.out.println(adresse1.toString());


        Deposant deposant1 = new Deposant("wala","ben","homme","bendhiabwalla@gmail.com",adresse1);
        System.out.println(deposant1.toString());
        Architecte architecte1= new Architecte("gogo","pargzy","szaezar",false, adresse1,"0606060606");

        System.out.println(" ARAYLIST");
        ArrayList<Architecte> liste = new ArrayList<Architecte>();
        ArrayList<Deposant> liste = new ArrayList<Deposant>();
        liste.add(deposant1);
        liste.add(architecte1);


    }
}