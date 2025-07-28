
package assignment1;

import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        String str = "listen";
        String str2 = "silent";
        char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
     }
}
