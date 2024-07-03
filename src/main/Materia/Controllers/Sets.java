package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    // Constructor 
    public Sets(){
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        construirTreeSetConComparador();

    }

    //hashset
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Pera");
        conjunto.add("Manzana");
        conjunto.add("Bolon");
        conjunto.add("Gran Malo");
        conjunto.add("Zhumir");
        System.out.println("HasSet: "+ conjunto);



        
    }
    
    //linkedhash
    public void construirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        
        //AGREGAR ELEMENTOS
        conjunto.add("Manzana");
        conjunto.add("Pera");
        conjunto.add("Manzana");
        conjunto.add("Bolon");
        conjunto.add("Gran Malo");
        conjunto.add("Zhumir");

        System.out.println("LinkedHashSet" + conjunto);

    }

    //
    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        
        //AGREGAR ELEMENTOS
        conjunto.add("Manzana");
        conjunto.add("Pera");
        conjunto.add("Manzana");
        conjunto.add("Bolon");
        conjunto.add("Gran Malo");
        conjunto.add("Zhumir");

        System.out.println("TreeSet" + conjunto);

    }
    public void construirTreeSetConComparador(){

        //Comparador personalizado
        Comparator<String> comparadorOrdenInverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        };


        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        
        //AGREGAR ELEMENTOS
        conjunto.add("Manzana");
        conjunto.add("Pera");
        conjunto.add("Manzana");
        conjunto.add("Bolon");
        conjunto.add("Gran Malo");
        conjunto.add("Zhumir");

        System.out.println("TreeSet" + conjunto);

    }
    

}
