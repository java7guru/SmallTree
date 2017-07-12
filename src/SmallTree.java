
public class SmallTree<K extends Comparable<K>, V> implements SmallTreeInterface<K, V> {
    private Node<K, V> parent;
    private int size;
    private V value;
    private K key;

    private void addWork(Node parent, Node newNode){
        if (parent.getKey().compareTo(newNode.getKey())>0) {
            if (parent.getRight()!=null) {
                addWork(parent.getRight(), newNode);
                return;
            }
            parent.setRight(newNode);
            newNode.setParent(parent);
        } else {
            if (parent.getLeft()!=null) {
                addWork(parent.getLeft(), newNode);
                return;
            }
            parent.setLeft(newNode);
            newNode.setParent(parent);
        }
    }

    @Override
    public void add(K key, V value) {
        size++;
        if (parent == null) {
            parent = new Node(key, value);
            return;
        }

        Node newNode = new Node(key,value);
        addWork(parent, newNode);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        /*System.out.print("Tree: ");
        System.out.print("0: " + parent.getX());
        System.out.print(", 1: " + parent.getRight().getX());
        System.out.print(", 2: " + parent.getLeft().getX());
        System.out.println();*/
    }

    class Node<K extends Comparable<K>, V> {
        private Node<K, V> parent, left, right;
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
