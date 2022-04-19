import java.util.HashMap;

public class isAnagram {
    public static boolean anagramOrNah(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) {return false;}

        for(int i = 0; i < sl; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1); 
            sMap.put(t.charAt(i), sMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(char c:sMap.keySet()) {
            if (sMap.get(c)!= 0) {return false;}
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagramOrNah(s, t));

    }
}
