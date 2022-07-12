import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<List<Integer>> partition(List<Integer> liste, int taille){
        //On initie la liste en return
        List<List<Integer>> listofLists = new ArrayList<>();
        if(liste.size()==0){
            return listofLists;
        }
        int longueur=liste.size();

        //On va calculer le nombre de part necessaire
        int nombredepartition=longueur/taille + ((longueur % taille == 0) ? 0 : 1);

        //On va utiliser sublist pour séparer les listes en listes
        for(int i=0;i<nombredepartition; i++){
            int depart=i*taille;
            int arriver=Math.min((i*taille+taille),longueur);
            listofLists.add(liste.subList(depart,arriver));
        }
        return listofLists;
    }

    public static void main(String[] args) {
        //Execution du code
        System.out.println("Hello world!");

        //On met en place les donner taille et les elements de la liste
        int settaille=2;
        List<Integer> listTest = new ArrayList<>();
        listTest.add(4);
        listTest.add(2);
        listTest.add(1);
        listTest.add(7);
        listTest.add(5);
        listTest.add(9);

        System.out.println(partition(listTest, settaille));


    }
}