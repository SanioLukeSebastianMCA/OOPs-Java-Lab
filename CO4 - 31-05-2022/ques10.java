import java.util.*;

public class ques10 {
    public static void main(String[] args) {
        Map<Integer, String> map= new HashMap<>();

        Scanner sc= new Scanner(System.in);
        int choice;
        boolean iscontinue=true;
        int map_count=0;

        while(iscontinue){
            System.out.println("\nMap Operations that you can perform are:\n1. Adding an element.\n2. Changing an element.\n3. Deleting an element.\n4. Display all elements.\n5. Exit.");
            System.out.print("\nEnter the choice: ");
            choice= sc.nextInt();

            switch(choice){
                case 1: {
                    System.out.print("\nEnter the string value for new element: ");
                    String item= sc.nextLine()+ sc.nextLine();
                    map_count++;
                    map.put(map_count,item);
                    break;
                }

                case 2: {
                    
                    if(map.size() <= 0){
                        System.out.println("\nCannot chnage any element !! The map is empty.");
                    }
                    else{
                        System.out.print("\nEnter the key value of the element that you want to change: ");
                        int key= sc.nextInt();
                        boolean iskeyvalid= false;
                        for(Map.Entry<Integer, String> item: map.entrySet()){
                            if(key==item.getKey()){
                                System.out.print("\nEnter the new element to update from the map: ");
                                String value= sc.nextLine()+ sc.nextLine();
                                map.put(key,value);
                                iskeyvalid= true;
                                break;
                            }
                        }
                        if(!iskeyvalid){
                            System.out.println("\nInvalid key value !! Please enter an existing key value.");
                        }
                    }
                    break;
                }

                case 3: {
                    if(map.size() <= 0){
                        System.out.println("\nCannot delete any element !! The map is empty.");
                    }
                    else{
                        System.out.print("\nEnter the key value of the element that you want to delete: ");
                        int key= sc.nextInt();
                        boolean iskeyvalid= false;
                        for(Map.Entry<Integer, String> item: map.entrySet()){
                            if(key==item.getKey()){
                                iskeyvalid=true;
                                map.remove(key);
                                System.out.println("\nThe mentioned element is successfully deleted.");
                                break;
                            }
                        }
                        if(!iskeyvalid)
                            System.out.println("\nInvalid key value !! Please enter an existing key value.");
                    }
                        
                    break;
                }

                case 4: {
                    if(map.size() <= 0){
                        System.out.println("\nCannot display any elements !! The map is empty.");
                    }
                    else{
                        System.out.println("\nThe elements in the map are : ");
                        for(Map.Entry<Integer, String> item: map.entrySet())
                            System.out.println("\nItem Key- "+item.getKey()+" & Item Value- "+item.getValue());
                    }
                    break;
                }

                case 5: {
                    iscontinue= false;
                    break;
                }

                default:{
                    System.out.println("\nInvalid choice !! Please try again !!");
                }
            }
        }
        sc.close();
    }
}
