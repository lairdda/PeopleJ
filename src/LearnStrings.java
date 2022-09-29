import java.util.Locale;

public class LearnStrings {
    public static void main(String[] args) {

        //** 25. Creating Strings
//        String fruit = "apple";
//        String anotherFruit = "apple";
//        String vegetable = new String("broccoli");
//        String anotherVegetable = new String("broccoli");
//
//        System.out.println(fruit == anotherFruit);
//        System.out.println(vegetable == anotherVegetable);

        //** 26. Upper & Lower casing **

//        String myText = "abcdefg";
//        System.out.println(myText.toUpperCase());
//
//        String myText2 = "ABCDEFG";
//        System.out.println(myText2.toLowerCase());

        //** 27. Strings: Blank or Empty?
//        String myText = "";
//        String myText1= " ";
//        System.out.println(myText.isBlank()); //use isBlank() in most validation cases
//        System.out.println(myText1.isEmpty());

        //** 28. Replacing Text Within Strings

        String myText = "here's my awesome firf text";
        System.out.println(myText.replace("firf", "nice"));
        System.out.println(myText.replace('e','z')); // cmd + p shows acceptable parameters

    }
}
