public class practice_Ques {
    public static void main(String[] args) {
        
        // Convert a string to lowercase
        // String name = "Aashish";
        // name = name.toLowerCase();
        // System.out.println(name);

        // replace spaces with underscore
        // String str = "To lower case";
        // str = str.replace(" ", "_");
        // System.out.println(str);

        // String letter = "Dear <|name|>, Thanks a lot!";
        // letter = letter.replace("<|name|>", "Aashish");
        // System.out.println(letter);

        // WAP to detect double and triple spaces in a string.
        // String myString = "This string contains     double and triple spaces";
        // System.out.println(myString.indexOf(("  ")));
        // System.out.println(myString.indexOf(("   ")));

        // String letter = "Dear Aashish,\n\tThis java course is Nice.\n\tThanks";
        // System.out.println(letter);

        // Comparison of two strings implicitly and explicitly in java.

        // Implicitly
        // String str1 = "Hello";
        // String str2 = "Hello";
        // String str3 = new String("Hello");

        // System.out.println(str1 == str2); //It returns true because both refer to the same string in the string pool
        // System.out.println(str1 == str3); // false, different memory locations (str3 is created using new)

        // Explicitly
        // String str1 = "Hello";
        // String str2 = "Hello";
        // String str3 = new String("Hello");

        // System.out.println(str1.equals(str2)); //It returns true because content are same.
        // System.out.println(str1.equals(str3));

        
        // Check palindrome using reverse method
        // String str = "nitin";
        // String reversed = new StringBuilder(str).reverse().toString(); // StringBuilder: This class is used to create a mutable sequence of characters.
        // reverse(): This method reverses teh sequence of characters in the StringBuilder. toString(): Converts StringBuilder object back to a String.
        // if(str.equals(reversed)){
        //     System.out.println( str + " is palindrome");
        // }
        // else{
        //     System.out.println(str + " is not palindrome");
        // }

        // Find out the no of words in a given sentence
        // String words = "Aashish";
        // System.out.println(words.length());

        // String str = "Aashish";
        //  int vowels=0, consonants=0;
        //  str = str.toLowerCase();
        //  for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch>='a' && ch<='z'){
        //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //                 vowels++;
        //         }
        //         else{
        //             consonants++;
        //         }
        //     }
        //  }
        //  System.out.println("Vowels : "+ vowels);
        //  System.out.println("Consonants : " + consonants);


        // Remove all occurrences of a given character from a string
        String str = "Hello World";
        char removeChar = 'l';

        String result = str.replace(Character.toString(removeChar),"");
        System.out.println("Original string : " + str);
        System.out.println("String after removing : " +removeChar + ": " + result);
    }
}
