package main.java.Ylab.tasks.task5;

public class Main {
    static boolean fuzzySearch(String shorter, String longer) {
        int i = 0;
        for (char c : shorter.toCharArray()) {
            i = longer.indexOf(c, i) + 1;
            if (i <= 0) { return false; }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(fuzzySearch("cwhl", "cartwheel"));
        System.out.println(fuzzySearch("cwhee", "cartwheel"));
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(fuzzySearch("lw", "cartwheel"));
    }
}
