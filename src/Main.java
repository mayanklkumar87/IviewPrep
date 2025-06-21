import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        countElectionWinnerSolution2(stringList);
    }

    //List of votes find the max count
    public static String countElectionWinnerSolution1(List<String> votesList) {

        //1. grouping string into a map of string and count by value
        //2. convert map into stream of Map.Entry to find maxCountByValue a method present in Map.Entry class
        //3. Get the value from optional

        // Find the string with the maximum occurrences
        Optional<Map.Entry<String, Long>> maxEntry = votesList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting())) // Group by string and count
                .entrySet().stream() // Convert map entries to stream
                .max(Map.Entry.comparingByValue()); // Find the entry with the max value

        maxEntry.ifPresent(entry -> System.out.println("String with max occurrences: " + entry.getKey() +
                " (Occurrences: " + entry.getValue() + ")"));

        return maxEntry.get().getKey();
    }

    public static void countElectionWinnerSolution2(List<String> votesList) {
        // Sample list


        // Create a frequency map using streams
        Map<String, Integer> frequencyMap = new HashMap<>();
        votesList.stream()
                .forEach(s -> frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1));

        // Find the string with the maximum occurrences using streams
        String mostCommonString = frequencyMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)) // Find the entry with the maximum value
                .map(Map.Entry::getKey) // Get the key (string)
                .orElse(null); // Handle empty map case

        System.out.println("The string with the maximum occurrences is: " + mostCommonString);
    }

    //input objects find based on property max occurance like find max employee in which department

    //ToDo : convert list of list into a single list
    //right addAll solution than java 8
    //Create object with list and inside that object another list and other variables
    //Now collect taht into a list

    //ToDo : input string -> bbcccaabd output string b3c3a2d
    //traditional solution right first than right java 8 solution
    // create map check if not present add else add+1


    //ToDo : input 3,3,3,2,2,2,5,4,4 -> 4,9,16,25
    //right java 8 code to find distinct int and square them and print

    //Check more questions on net to use groupby and other such operations using stream
    //learn to use map and flat map in stream

}