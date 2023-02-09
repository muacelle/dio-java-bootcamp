package nodes;

public class Main {
    public static void main(String[] args) {

        Nodes<String> no1 = new Nodes("1");
        Nodes<String> no2 = new Nodes("2");
        Nodes<String> no3 = new Nodes("3");
        Nodes<String> no4 = new Nodes("4");

        no1.setNextNode(no2);
        no2.setNextNode(no3);
        no3.setNextNode(no4);

        // no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);                                 // no1
        System.out.println(no1.getNextNode());                   // no2
        System.out.println(no1.getNextNode().getNextNode());     // no3
    }
}
