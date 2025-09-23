public class Arry 
{   
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        try {
            System.out.println(arr[7]);
        } catch (Exception e) 
        {
            System.out.println("Error: Array index is out of bounds. ");
        }
        System.out.println("Program continues after handling the exception.");
    }
    
}  
