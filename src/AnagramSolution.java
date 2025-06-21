import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramSolution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = false;
        Map<Character,Integer> countMap = new HashMap<>();
        if(a.length()!=b.length()){
            result = false;
        } else {
            char[] arr = a.toCharArray();
            char[] brr = b.toCharArray();
            for(int i=0;i<arr.length;i++) {
                if(countMap.containsKey(arr[i])){
                    int val = countMap.get(arr[i]);
                    countMap.put(arr[i], val+1);
                } else {
                    countMap.put(arr[i], 1);
                }
                if(countMap.containsKey(brr[i])){
                    int val = countMap.get(brr[i]);
                    countMap.put(brr[i], val-1);
                } else {
                    countMap.put(brr[i], -1);
                }
            }
            for(char c : countMap.keySet()){
                if(countMap.get(c)==0){
                    result = true;
                } else {
                    return false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

