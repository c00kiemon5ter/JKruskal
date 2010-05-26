
package graph.generation;

import graph.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.jgrapht.generate.CompleteGraphGenerator;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.ListenableUndirectedWeightedGraph;

/**
 *
 * @author Periklis Ntanasis
 * @author Ivan c00kiemon5ter Kanakarakis
 */
public class UndirectedWeightedGenerator implements Generator<ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>> {
	private Random generator;
	private List<ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>> graphList;
	private CompleteGraphGenerator<Node, DefaultWeightedEdge> cmpltGen;

	public UndirectedWeightedGenerator() {
		generator = new Random();
	}

	/* NOTE:
	 * Switching generator type, changes vertex factory behaviour
	 * The difference between the different type of graphs we have
	 * to produce is actually the way nodes are assigned in two dimension
	 * space, and how the weight is calculated
	 * The generator itself is always a complete graph generator
	 *
	 * Graph Generators: http://www.jgrapht.org/javadoc/org/jgrapht/generate/package-summary.html
	 */
	@SuppressWarnings("AssignmentToMethodParameter")
	public List<ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>> generate(GeneratorGraphType gentype, int numOfGraphs) {
		cmpltGen = new CompleteGraphGenerator<Node, DefaultWeightedEdge>(numOfGraphs);
		graphList = new ArrayList<ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>>(numOfGraphs);
		switch (gentype) {
			case RANDOM_WEIGHT_COMPLETE_GRAPH_GENERATOR:
				// do something
				break;
			case HOMOGENOUS_POINT_COMPLETE_GRAPH_GENERATOR:
				// do something else
				break;
			case CYRCLE_POINT_COMPLETE_GRAPH_GENERATOR:
				// do something else else
				break;
			default:
				throw new IllegalArgumentException("Unexprected Generator Type");
		}
		ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge> weightedGraph;
		while (numOfGraphs-- > 0) {
			weightedGraph = new ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>(DefaultWeightedEdge.class);
			cmpltGen.generateGraph(weightedGraph, null, null);
			graphList.add(weightedGraph);
		}
		return Collections.unmodifiableList(graphList);
	}

	public List<ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>> getGeneratedGraphs() {
		return Collections.unmodifiableList(graphList);
	}

}
