import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    Set<String> set;

    public WordSet(String mess) {
        set = new TreeSet<>();
        for (String word : mess.split("\\s+")) 
            set.add(word.toLowerCase());
    }

    private WordSet(Set<String> set) { this.set = set; }

    public WordSet union(WordSet other) {
        Set<String> x = new TreeSet<>(this.set);
        x.addAll(other.set);
        return new WordSet(x);
    }

    public WordSet intersection(WordSet other) {
        Set<String> x = new TreeSet<>();
        for (String w : other.set) 
            if (this.set.contains(w))
                x.add(w);
        return new WordSet(x);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String w : set)
            sb.append(w).append(" ");
        return sb.toString();
    }
}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
        in.close();
    }
}
