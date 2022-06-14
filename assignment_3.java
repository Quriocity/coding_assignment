import java.util.*;

class Remaining {
    String sentence;
    char letter;
    // Takes input from the user
    void get_data() {
        Scanner read_sen = new Scanner(System.in);
        Scanner read_letter = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        sentence = read_sen.nextLine();
        System.out.print("Enter a letter: ");
        letter = read_letter.next().charAt(0);
        System.out.println("Sentence: "+sentence+" Letter: "+letter);
    }
    // Return the string that comes after the given letter
    String find_remaining() {
        int letter_index = sentence.indexOf(letter);
        if (letter_index == -1) {
            return "The letter does not exist in the sentence";
        }
        else {
            String remaining = sentence.substring(letter_index + 1);
            return remaining;
        }
    }
}


public class assignment_3 {
    public static void main(String args[]) {
        Remaining obj  = new Remaining();
        obj.get_data();
        String result = obj.find_remaining();
        System.out.println(result);

        

    }
}