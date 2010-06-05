
package graph.generation;

import graph.Node;
import org.jgrapht.VertexFactory;

/**
 *
 * @author Periklis Ntanasis
 */
public class DefaultVertexFactory implements VertexFactory<Node> {
	private final String prefix = "Node";
	private static int count = 0;

	public Node createVertex() {
		return new Node(String.format("%s-%d", prefix, ++count));
	}

}
