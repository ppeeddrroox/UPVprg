package pract5;

public class NodePol {
    Polygon data;
    NodePol next;
    
    
    /**
     * Crea un NodePol con dato p y que no tiene siguiente.
     * @param p Polygon, dato del nuevo nodo.
     */
    public NodePol(Polygon p) {
        data = p; 
        // o de manera equivalente: this(p, null); 
    }
    
    /**
     * Crea un NodePol con dato p, enlazado a un nodo preexistente n. 
     * @param p Polygon, dato del nuevo nodo.
     * @param n NodePol, nodo siguiente al que enlazar el nuevo nodo.
     */
    public NodePol(Polygon p, NodePol n) {
        data = p;
        next = n;    
    }
}