package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public static int inter(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        List<Integer> IntersectElements=new ArrayList<>();

        int count=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                IntersectElements.add(arr2[j]);
                count++;
                set.remove(arr2[j]);
            }
        }
        System.out.println("Intersected elements are:"+IntersectElements);
        System.out.println("Elements present in set after intersected elements removed:"+set);

        return count;
        
    }
    public static void main(String[] args){
        int arr1[]={7,2,9};
        int arr2[]={3,4,2,9,1,9,6};
        
        System.out.println("Number of intersected elements:" + inter(arr1,arr2));

    }
}
