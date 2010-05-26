
package graph.generation;

import graph.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.jgrapht.WeightedGraph;
import org.jgrapht.generate.CompleteGraphGenerator;
import org.jgrapht.generate.GraphGenerator;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.ListenableUndirectedWeightedGraph;

/**
 *
 * @author Periklis Ntanasis
 * @author Ivan c00kiemon5ter Kanakarakis
 */
public class UndirectedWeightedGenerator implements Generator<WeightedGraph<Node, DefaultWeightedEdge>> {
	private Random generator;
	private List<WeightedGraph<Node, DefaultWeightedEdge>> graphList;
	private GraphGenerator<Node, DefaultWeightedEdge, Node> graphGen;

	public UndirectedWeightedGenerator() {
		generator = new Random();
	}

	public WeightedGraph<Node, DefaultWeightedEdge> generateSingleGraph(GeneratorGraphType gentype, int graphSize) {
		switch (gentype) {
			case RANDOM_WEIGHT_COMPLETE_GRAPH_GENERATOR:
				// do something
				graphGen = new CompleteGraphGenerator<Node, DefaultWeightedEdge>(graphSize);
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
		WeightedGraph<Node, DefaultWeightedEdge> weightedGraph = new ListenableUndirectedWeightedGraph<Node, DefaultWeightedEdge>(DefaultWeightedEdge.class);
		graphGen.generateGraph(weightedGraph, null, null);
		return weightedGraph;
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
	public List<WeightedGraph<Node, DefaultWeightedEdge>> generate(GeneratorGraphType gentype, int graphSize, int numOfGraphs) {
		graphList = new ArrayList<WeightedGraph<Node, DefaultWeightedEdge>>(numOfGraphs);
		for (int i = 0; i < numOfGraphs; i++) {
			graphList.add(generateSingleGraph(gentype, graphSize));
		}
		return Collections.unmodifiableList(graphList);
	}

	public List<WeightedGraph<Node, DefaultWeightedEdge>> getGeneratedGraphs() {
		return Collections.unmodifiableList(graphList);
	}

}
