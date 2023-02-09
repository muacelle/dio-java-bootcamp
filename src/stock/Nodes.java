package stock;

public class Nodes {

    private int dado;
    private Nodes ref = null;

    public Nodes() {}
    public Nodes(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }

    public Nodes getRef() {
        return ref;
    }
    public void setRef(Nodes ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Nodes {" +
                "dado=" + dado +
                '}';
    }
}
