public class TestesFilaCircular {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(4);
        fila.inserir("A");
        fila.inserir("B");
        fila.inserir("C");
        fila.inserir("D");
        fila.remover();
        fila.remover();
        fila.inserir("E");
        fila.inserir("F");
    }
}
