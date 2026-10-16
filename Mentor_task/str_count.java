public class LongestWordSimple {

    public static void main(String[] args) {

        String str = "I love programming very much";
        String[] arr = str.split(" ");

        String longest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }

        System.out.println("Longest word: " + longest);
    }
}

// logic -- 
//Logic Explanation (Simple & Short)
// Take the sentence as a string.
// Split the sentence into words using space " " as a separator.
// Example: "I love programming" → ["I", "love", "programming"]
// Check each word's length one by one.
// Keep a variable to store the longest word found so far.
// If the current word has more characters than the stored one,
// replace it with the current word.
// After checking all words,
// print the longest word.