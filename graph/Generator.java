
package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.jgrapht.WeightedGraph;
import org.jgrapht.generate.CompleteGraphGenerator;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.ListenableUndirectedWeightedGraph;

/**
 *
 * @author Periklis Ntanasis
 */
public class Generator {
	private Random generator;

	public Generator() {
		generator = new Random();
	}

	@SuppressWarnings("AssignmentToMethodParameter")
	public List<ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>> fullGraphGenerator(int numOfGraphs) {
		List<ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>> graphList = new ArrayList<ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>>(numOfGraphs);
		CompleteGraphGenerator<Node, DefaultWeightedEdge> cmpltGenerator = new CompleteGraphGenerator<Node, DefaultWeightedEdge>(numOfGraphs);
		WeightedGraph<Node, DefaultWeightedEdge> w;
		//we have to call generateGraph to produce us a random graph and after
		//we will use random int generator for each edge to produce the weights
		while (numOfGraphs-- > 0) {
			ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge> wg = new ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>(DefaultWeightedEdge.class);
			cmpltGenerator.generateGraph(wg, null, null);
			graphList.add(wg);
		}
		return graphList;
	}

}
