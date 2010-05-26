package graph;

import org.jgrapht.VertexFactory;

/**
 *
 * @author Periklis Ntanasis
 */
public class VertexFactoryImplementation implements VertexFactory<Node> {

    private final String prefix = "node";
    private static int count = 0;

    public Node createVertex() {
        Node node = new Node(prefix+(count++));
        return node;
    }

}
