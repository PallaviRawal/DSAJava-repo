import java.util.*;
public class Problem{
    @SuppressWarnings("unused")
    private static int Value;
        public static void majourElement(int[] num){
                HashMap<Integer,Integer> map=new HashMap<>();
                int n=num.length;
                for(int i=0;i<n;i++){
                    if(map.containsKey(num[i])){
                        map.put((num[i]),map.get(num[i])+1);
                    }else{
                        map.put(num[i],Value=1);
            }

        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
        
        }  
    }     
    public static void main(String[] args){
        int num[] = {1,3,2,5,2,3,3,2};
        majourElement(num);
    } 
    
        
}

