package string;

public class vowelOnly {
    public static String vowelOnly(String input) {
        String vowel = "aeiou";
        //to do: create a new stringbuilder object
        StringBuilder sb = new StringBuilder();
        for (char c: input.toCharArray()) {
            if (vowel.contains(String.valueOf(c).toLowerCase())) {
                //to do: add char to stringbuilder
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
