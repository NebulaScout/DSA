import java.util.HashSet;
import java.util.Set;

class DistinctLetters {
    public int solution( String P, String Q) {
        Set<Character> distinctLetters = new HashSet<>();

        int N = P.length();

        // Iterate throught both strings
        for(int i = 0; i < N; i++) {
            char pChar = P.charAt(i);
            char qChar = Q.charAt(i);

            if(pChar == qChar) {
                distinctLetters.add(pChar); // Add only one character since they are the same
            } else{
                distinctLetters.add(pChar); // Add both characters since they are different
                distinctLetters.add(qChar);
            }
        }

        return distinctLetters.size();
    }

    public DistinctLetters() {
        System.out.println(solution("abc", "bcd"));
        System.out.println(solution("axxz", "yzwy"));
        System.out.println(solution("bacad", "abada"));
    }

}
