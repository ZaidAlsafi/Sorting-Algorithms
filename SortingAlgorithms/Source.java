package SortingAlgorithms;
import java.util.*;

public class Source{
public static void main(String[] args){
    int size = 10;
    ArrayList<Integer> list = new ArrayList<Integer>();

    list=Populate.DuplicateList(size);
    System.out.println("List: "+list);
    
    System.out.println("Insertion Sort: "+Sorting.InsertionSort(list));

}

}