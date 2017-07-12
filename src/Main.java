import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        SmallTree<Integer, String> smallTree = new SmallTree<>();
        System.out.println("Size: " + smallTree.size());
        smallTree.add(0, "A");
        System.out.println("Size: " + smallTree.size());
        smallTree.add(1, "B");
        System.out.println("Size: " + smallTree.size());
        smallTree.add(-1, "C");
        System.out.println("Size: " + smallTree.size());

        smallTree.print();
    }
}
