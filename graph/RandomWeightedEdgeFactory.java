package graph;

import java.io.Serializable;
import java.util.Random;
import org.jgrapht.EdgeFactory;

/**
 *
 * @author Periklis Ntanasis
 */
public class RandomWeightedEdgeFactory<Node,DefaultWeightedEdge> 
        implements EdgeFactory<Node,DefaultWeightedEdge>, 
        Serializable {

    private Random generator = new Random();
    
    //~ Static fields/initializers ---------------------------------------------

    private static final long serialVersionUID = 3618135658586388792L;

    //~ Instance fields --------------------------------------------------------

    private Edge edgeClass;

    //~ Constructors -----------------------------------------------------------

    public void RandomWeightedEdgeFactory(Edge edgeClass)
    {
        this.edgeClass = new Edge(edgeClass.getSource(),edgeClass.getTarget(),generator.nextDouble());
    }

    //~ Methods ----------------------------------------------------------------

    public DefaultWeightedEdge createEdge(Node arg0, Node arg1) {
    try {
            return (DefaultWeightedEdge) this.edgeClass;
        } catch (Exception ex) {
            throw new RuntimeException("Edge factory failed", ex);
        }
    }

}
