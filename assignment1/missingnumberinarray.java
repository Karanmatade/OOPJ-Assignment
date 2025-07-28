public class missingnumberinarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        int n = arr.length + 1;
        int total = n*(n+1)/2;
        for(int num :arr){
            total -= num;
        }
        System.out.println(total);
    }
    
}
