package SortingAlgorithms;
import java.util.*;

public class Source{
public static void main(String[] args){
    int size = 10;
    ArrayList<Integer> list = new ArrayList<Integer>();

    list=Populate.UniqueList(size);

    System.out.println(list);
}
}