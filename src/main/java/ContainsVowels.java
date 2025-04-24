public class ContainsVowels {

 public static void main(String[] args) {
  System.out.println(containsVowels("HelloWorld")); // true
  System.out.println(containsVowels("SD")); // false
 }

 public static boolean containsVowels(String input) {
  return input.toLowerCase().matches(".*[aeiou].*");
 }

}
