package IntermediateJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Panagram {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        List<Character> cList = new ArrayList<>();
        char[] loweerAlphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (int i = 0; i < loweerAlphabets.length; i++) {
            cList.add(loweerAlphabets[i]);
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (!cList.isEmpty()){
                try {
                    cList.remove(Character.valueOf(sentence.charAt(i)));

                } catch (Exception e){
                }
            } else {
                break;
            }
        }

        System.out.println(cList.isEmpty());
    }
}
