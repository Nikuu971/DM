import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

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

    @Test
    public void TestPartition() {
        int taille=3;

        List<Integer> listTest = new ArrayList<>();
        listTest.add(2);
        listTest.add(6);
        listTest.add(7);
        listTest.add(4);
        listTest.add(1);

        assertNotNull(partition(listTest,taille));
        assertTrue(partition(listTest,taille) instanceof List<List<Integer>>);
    }
}