import java.util.Arrays;

public class Prefix {
    public static String longestPrefix(String [] words) {
        if(words == null || words.length == 0){
            return "";
        }
        String prefix =words[0];

        for (int i = 0; i < words.length; i++) {
            while (!words[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);

                if (prefix.isEmpty()){
                    return "";
                }


            }

        }


        return prefix;
    }

    public static void main(String[] args) {
        String [] words = { "hello", "leetcode", "hi", "look", "goodbye" };
        System.out.println(longestPrefix(words));
    }
    }