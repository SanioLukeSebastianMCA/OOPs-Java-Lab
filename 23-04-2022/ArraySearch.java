import java.util.*;

class ArraySearch{

    private boolean search(int[] arr, int item){
        boolean isfound=false;
        for(int i=0;i<arr.length;i++){
            if(item==arr[i]){
                isfound=true;
                break;
            }
        }
        return isfound;
    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        ArraySearch inst= new ArraySearch();

        int size, search_item;
        
        System.out.print("Enter the size for the array : ");
        size= sc.nextInt();

        int[] arr= new int[size];
        System.out.println("\nPlease enter the elements for the array : ");
        for(int i=0;i<size;i++)
            arr[i]= sc.nextInt();

        System.out.print("Please the item that you want to search : ");
        search_item= sc.nextInt();

        String res= inst.search(arr, search_item) ? "is found / available." : "is not found / not available";
        System.out.println("The searched item i.e. "+search_item+" "+ res);

        sc.close();
    }
}