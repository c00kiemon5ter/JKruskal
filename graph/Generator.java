package graph;

import java.util.Random;
import org.jgrapht.generate.CompleteGraphGenerator;
import org.jgrapht.graph.UndirectedWeightedSubgraph;

/**
 *
 * @author Periklis Ntanasis
 */
public class Generator {
    
    Random generator;

    public UndirectedWeightedSubgraph fullGraphGenerator(int n)
    {
        CompleteGraphGenerator graphGenerator = new CompleteGraphGenerator(n);
        UndirectedWeightedSubgraph weightedGraph = null;
        //we have to call generateGraph to produce us a random graph and after
        //we will use random int generator for each edge to produce the weights

        return null;
    }

}
