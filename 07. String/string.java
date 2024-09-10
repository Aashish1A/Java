//import java.util.Scanner;
class string{
    public static void main(String[] args) {
        // String name = new String("Aashish");
        // String name;
        // name = new String("Aashish");

        // String str = "Aashish";
        // System.out.println(str);

        // System.out.print("The name is : ");
        // System.out.println(name);

        // int a = 5;
        // float b = 54.f;
        // System.out.printf("The value of a is %d and value of b is %f : ",a,b);
        // System.out.format("The value of a is %d and value of b is %f : ",a,b);

        // take input from user
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // String str = sc.nextLine();
        // sc.close();
        // System.out.println(str);


        // String Methods in Java
        String name = "Aashish";
        System.out.println(name);

        System.out.println(name.length()); // Return the length of a string

        System.out.println(name.toLowerCase()); // Return new string which all the lowercase characters.

        System.out.println(name.toUpperCase()); // Return new string which all the uppercase characters.

        String nonTrim = "      Aashish         ";
        System.out.println(nonTrim);
        System.out.println(nonTrim.trim()); // Remove all the spaces

        System.out.println(name.substring(1)); // Return a substring form start to end.
        System.out.println(name.substring(1, 4));

        System.out.println(name.replace("Aa", "A"));
        System.out.println(name.replace("Aashish", "Aditya")); // Replace the old string to new string

        System.out.println(name.startsWith("Aa")); // returns true if name starts with string. otherwise return false.
        System.out.println(name.startsWith("as"));

        System.out.println(name.endsWith("sh")); // returns true if name ends with string. otherwise return false.

        System.out.println(name.charAt(4)); // returns the indexed character in a given string

        System.out.println(name.indexOf("sh")); // Return the index of a string
        
        String str = "Harryrry";
        System.out.println(str.indexOf("rry", 4));
        System.out.println(str.lastIndexOf("r")); // return the last index of the given string.
        System.out.println(str.lastIndexOf("rr", 4));

        System.out.println(name.equals(str)); // check the two are equal or not
        System.out.println(str.equals("Harryrry"));
        System.out.println(str.equalsIgnoreCase("harryRry"));

        // Escape sequence characters
        System.out.println("I am escape sequence \" double quotes");

        System.out.println("I am escape sequence \\ backspace");
    }
}