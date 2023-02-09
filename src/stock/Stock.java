package stock;

public class Stock {

    private Nodes entrada;

    public Stock() {
        this.entrada = null;
    }

    public boolean isEmpty() {
        return entrada == null ? true : false;
    }

    public Nodes top() {
        return entrada;
    }

    public void push(Nodes newNode) {
        Nodes aux = entrada;
        entrada = newNode;
        entrada.setRef(aux);
    }

    public Nodes pop() {
        if(!isEmpty()) {
            Nodes popped = entrada;
            entrada = entrada.getRef();
            return popped;
        }
        return null;
    }

}
