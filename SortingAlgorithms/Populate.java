package SortingAlgorithms;
import java.util.*;
public class Populate {

    public  static ArrayList<Integer> DuplicateList(int size){

    ArrayList<Integer> list = new ArrayList<Integer>();
    Random rand= new Random();
    int TempNumber=0;

       for(int count=0; count<size ; count++){

        TempNumber=rand.nextInt(0,size);
        list.add(TempNumber);

       }

        return list;
    }

    public static ArrayList<Integer> UniqueList (int size){

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        int TempNumber = 0;


        while(list.size()<size){

            TempNumber=rand.nextInt(0,size);

            if(!list.contains(TempNumber)){
                System.out.println(TempNumber +" is added to the List: "+ list);
                list.add(TempNumber);
                System.out.println(list);
            
            }else{
                System.out.println("Error! "+TempNumber +" is a duplicate number. List: "+list);

            }

        }

        return list;
    }

    
}
