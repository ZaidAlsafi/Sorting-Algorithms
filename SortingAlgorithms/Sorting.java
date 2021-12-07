package SortingAlgorithms;
import java.util.*;
public class Sorting {
    
    public static ArrayList<Integer> BubbleSort(ArrayList<Integer> list){
        int length =list.size();
        for(int i=0; i<length-1;i++){
            for(int j=0; j<length-1-i;j++){

                if(list.get(j)>list.get(j+1)){
                
                    int tempNumber=list.get(j);
                
                    list.set(j, list.get(j+1));
                    list.set(j+1,tempNumber);

                }

            }
        }

        return list;
    }

}
