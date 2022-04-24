public class StringManipulation {
    
    public static void main(String[] args){
        String str1= "This is my first job ", str2="and I like it.";
        
        System.out.println("The string 01 is : "+str1+"\nString 02 is : "+str2);
        String strconcat= str1+str2;
        System.out.println("\nThe concatenation of two strings is : "+strconcat);

        String strUppercase= str1.toUpperCase();
        System.out.println("\nNormal String to uppercase string is : "+strUppercase);

        String strLowercase= str2.toLowerCase();
        System.out.println("\nNormal String to lowercase string is : "+strLowercase);

        String strsubString= str1.substring(5);
        System.out.println("\nSubstring of the string is : "+strsubString);

        String strtrim= str1.trim();
        System.out.println("\nString trim is given by : "+strtrim);
        
        boolean strcontains= str1.contains("my");
        System.out.println("\nCheck if the string 01 contains -'my' : "+strcontains);

        int strlength= str2.length();
        System.out.println("\nThe length of the string 02 is : "+strlength);

    }  
}
