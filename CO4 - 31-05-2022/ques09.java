import java.util.*;

public abstract class ques09 {
    public static void main(String[] args) {
        HashSet<Integer> hashset_1= new HashSet<>();
        hashset_1.add(13);    
        hashset_1.add(5);    
        hashset_1.add(53);   
        hashset_1.add(47);  
        hashset_1.add(63);  
        System.out.println("\nHashset 01 : ");
        Iterator<Integer> i1=hashset_1.iterator();  
        while(i1.hasNext())
            System.out.println(i1.next());  
            
        HashSet<Integer> hashset_2= new HashSet<>();
        hashset_2.add(17);    
        hashset_2.add(5);    
        hashset_2.add(2);   
        hashset_2.add(47);  
        hashset_2.add(3);  
        System.out.println("\nHashset 02 : ");
        Iterator<Integer> i2=hashset_2.iterator();  
        while(i2.hasNext())
            System.out.println(i2.next());  

        System.out.println("\nElements that are common in both of the hashset are : ");
        for(Integer elem: hashset_1){
            if(hashset_2.contains(elem))
                System.out.print(elem+"; ");
        }
        System.out.println("\n");
    }
}
