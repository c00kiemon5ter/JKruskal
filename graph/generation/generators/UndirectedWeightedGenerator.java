
package graph.generation.generators;

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
 * @deprecated 
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

	public WeightedGraph<Node, DefaultWeightedEdge> generateSingleGraph(int graphSize) {
		graphGen = new CompleteGraphGenerator<Node, DefaultWeightedEdge>(graphSize);
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
	public List<WeightedGraph<Node, DefaultWeightedEdge>> generate(int graphSize, int numOfGraphs) {
		graphList = new ArrayList<WeightedGraph<Node, DefaultWeightedEdge>>(numOfGraphs);
		for (int i = 0; i < numOfGraphs; i++) {
			graphList.add(generateSingleGraph(graphSize));
		}
		return Collections.unmodifiableList(graphList);
	}

}
