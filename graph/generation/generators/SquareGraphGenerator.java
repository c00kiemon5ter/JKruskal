
package graph.generation.generators;

import graph.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jgrapht.WeightedGraph;
import org.jgrapht.generate.GraphGenerator;
import org.jgrapht.generate.HyperCubeGraphGenerator;
import org.jgrapht.graph.ClassBasedVertexFactory;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.ListenableUndirectedWeightedGraph;

/**
 *
 * @author Periklis Ntanasis
 */
public class SquareGraphGenerator implements Generator<WeightedGraph<Node, DefaultWeightedEdge>> {
	private GraphGenerator<Node, DefaultWeightedEdge, Node> graphGen;
	private List<WeightedGraph<Node, DefaultWeightedEdge>> graphList;

	public SquareGraphGenerator() {
		/* Noop */
	}

	public WeightedGraph<Node, DefaultWeightedEdge> generateSingleGraph(int graphSize) {
		graphGen = new HyperCubeGraphGenerator<Node, DefaultWeightedEdge>(graphSize);
		WeightedGraph<Node, DefaultWeightedEdge> weightedGraph = new ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>(DefaultWeightedEdge.class);
//		graphGen.generateGraph(weightedGraph, new DefaultVertexFactory(), null);
		graphGen.generateGraph(weightedGraph, new ClassBasedVertexFactory<Node>(Node.class), null);
		return weightedGraph;
	}

	public List<WeightedGraph<Node, DefaultWeightedEdge>> generate(int graphSize, int numOfGraphs) {
		graphList = new ArrayList<WeightedGraph<Node, DefaultWeightedEdge>>(numOfGraphs);
		for (int i = 0; i < numOfGraphs; i++) {
			graphList.add(generateSingleGraph(graphSize));
		}
		return Collections.unmodifiableList(graphList);
	}

}
