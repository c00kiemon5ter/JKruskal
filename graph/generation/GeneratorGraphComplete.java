package graph.generation;

import graph.Node;
import graph.VertexFactoryImplementation;
import java.util.List;
import org.jgrapht.WeightedGraph;
import org.jgrapht.generate.CompleteGraphGenerator;
import org.jgrapht.generate.GraphGenerator;
import org.jgrapht.graph.DefaultWeightedEdge;

/**
 *
 * @author Periklis Ntanasis
 */
public class GeneratorGraphComplete implements Generator<WeightedGraph<Node, DefaultWeightedEdge>> {

    private GraphGenerator<Node, DefaultWeightedEdge, Node> graphGen;

    public WeightedGraph<Node, DefaultWeightedEdge> generateSingleGraph(int graphSize) {
        graphGen = new CompleteGraphGenerator<Node, DefaultWeightedEdge>(graphSize);
        graphGen.generateGraph(null, (new VertexFactoryImplementation()), null);
        return null;
    }

    public List generate(int graphSize, int numOfGraphs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List getGeneratedGraphs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
