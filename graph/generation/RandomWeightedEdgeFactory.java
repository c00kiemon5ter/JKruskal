
package graph.generation;

import graph.Edge;
import graph.Node;
import java.util.Random;
import org.jgrapht.EdgeFactory;

public class RandomWeightedEdgeFactory implements EdgeFactory<Node, Edge> {
	private Random rand;
	private Double limit = 1.0D;

	public RandomWeightedEdgeFactory() {
		rand = new Random();
	}

	public Edge createEdge(Node source, Node target) {
		return new Edge(source, target, rand.nextDouble() % limit);
	}

}
