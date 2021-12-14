package SortingAlgorithms;
import java.util.*;
public class Sorting {
    
    public static ArrayList<Integer> BubbleSort(ArrayList<Integer> list){
     int size =list.size();
        for(int i=0; i<size-1;i++){

            for(int j=0; j<size-1-i;j++){

                if(list.get(j)>list.get(j+1)){
                
                    int tempNumber=list.get(j);
                
                    list.set(j, list.get(j+1));
                    list.set(j+1,tempNumber);

                }

            }
        }
 
        return list;
    }

    public static ArrayList<Integer> InsertionSort(ArrayList<Integer> list){

        int size = list.size();
 
        for(int i=0; i<size; i++){

            int pointedNumber=list.get(i); 
            int pointer=i-1;

            while(pointer>=0 && list.get(pointer)>pointedNumber){

                list.set(pointer+1, list.get(pointer));  
                pointer=pointer-1;           
            
            }

            list.set(pointer+1,pointedNumber);
        }
        
        return list;
        
    }
    
    public static ArrayList<Integer> Sort(ArrayList<Integer> list){

        
        return list;
    }
}