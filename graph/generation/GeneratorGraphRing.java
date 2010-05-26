package graph.generation;

import graph.Node;
import java.util.List;
import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

/**
 *
 * @author Periklis Ntanasis
 */
public class GeneratorGraphRing implements Generator<WeightedGraph<Node, DefaultWeightedEdge>> {

    public WeightedGraph<Node, DefaultWeightedEdge> generateSingleGraph(int graphSize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List generate(int graphSize, int numOfGraphs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List getGeneratedGraphs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}