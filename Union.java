package Java;

import java.util.*;
public class Union {
    public static  int UnionOfTwoArrays(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        //Arr1
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        //Arr2
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

        
        for(Integer Element:set){
            System.out.println(Element);
        }

        return set.size();
    }

    public static void main(String[] args){
        int arr1[]={7,2,9};
        int arr2[]={6,3,9,2,8,9,1};
        //System.out.println(arr1);
        //System.out.println(arr2);
        UnionOfTwoArrays(arr1,arr2);
    

    }

}

