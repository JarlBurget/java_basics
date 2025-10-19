package week6;

public class Exercise101_StringUtils {

    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }

        word = word.toUpperCase();
        searched = searched.trim().toUpperCase();

        return word.contains(searched);
    }
}