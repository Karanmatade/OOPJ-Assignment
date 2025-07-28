public class mergetwoarray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6,67};
        int [] merge = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,merge,0,arr1.length);
        System.arraycopy(arr2,0,merge,arr1.length,arr2.length);

    }
}
