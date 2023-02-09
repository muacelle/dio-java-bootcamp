package nodes;

public class Nodes {

    private String content;
    private Nodes nextNode;

    public Nodes(String content) {
        this.nextNode = null;
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Nodes getNextNode() {
        return nextNode;
    }
    public void setNextNode(Nodes nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "No {" +
                "content='" + content + '\'' +
                '}';
    }
}
