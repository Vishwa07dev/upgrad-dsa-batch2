package strings;

import javax.crypto.spec.PSource;

public class May302022 {

    public static void main(String[] args) {


        String name= "Vishwa" ; // Literal way

        String nation = new String("India");  // Object way

        /**
         * String
         *
         *
         */

        //Finding the length of the string

        String s1 = "upgrad";
        System.out.println(s1.length());

        //Replace any character
        s1 = s1.replace('g','G');
        System.out.println(s1);

        // Concatenate two strings
        String firstName = "Vishwa";
        String lastName = "Mohan";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String fName = firstName.concat(lastName);
        System.out.println(fName);

        /**
         * String index also starts with 0
         */
        String message = "Students are getting smarter each day !";

        System.out.println(message.charAt(0));

        // At what index the word smarter started
        System.out.println(message.indexOf("smarter"));
        System.out.println(message.indexOf("smart"));


        /**
         * Comparing two Strings
         *
         * { "Vishwa", "Mohan", "Akansha" }
         */

        String name1 = "Akanksha";
        String name2 = "Shambhavi";
        String name3 = "Akanksha";

        System.out.println(name1.compareTo(name2));
        System.out.println(name2.compareTo(name1));
        System.out.println(name1.compareTo(name3));


        String country1 = new String("India");
        String country2 = new String("India");
        System.out.println(country1==country2);

        String country3 = "India";
        String country4 = "India";
        System.out.println(country3==country4);






    }
}
