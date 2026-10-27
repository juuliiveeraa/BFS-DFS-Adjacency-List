import java.util.List;

public class AdjacencyList <T> {
    private List<T> vertices;
    private List<List<Integer>> edges;
}

/*
Imagina un grafo con 4 vértices (0, 1, 2, 3) y las siguientes conexiones:

El nodo 0 está conectado con 1 y 2.

El nodo 1 está conectado con 0 y 3.

El nodo 2 está conectado con 0.

El nodo 3 está conectado con 1.

En código, la variable externa edges es una lista principal donde la posición i corresponde al vértice i:

edges = [[1,2],[0,3],[0],[1]] 

ej. [1,2] está en la posición 0

edges.get(0) te devuelve [1,2] (vecinos del nodo 0)

significa que sus vecinos son los nodos en las posiciones 1 y 2 de la lista

si vertices = ["A","B","C","D"]:

List<Integer> vecinos = edges.get(0) te daría [1,2]

Osea que "A" está conectado al nodo en posición 1 ("B") y al nodo en posición 2 ("C")

*/