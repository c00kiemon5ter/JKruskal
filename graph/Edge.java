
package graph;

import org.jgrapht.graph.DefaultWeightedEdge;

/**
 *
 * @author  Ivan Kanakarakis
 */
public class Edge extends DefaultWeightedEdge implements Comparable<Edge> {
	private final Node source, target;
	private final double weight;

	public Edge(final Node source, final Node target, final double weight) {
		super();
		this.source = source;
		this.target = target;
		this.weight = weight;
	}

	public int compareTo(final Edge oEdge) {
		if (weight - oEdge.getWeight() < 0) {
			return -1;
		}
		if (weight - oEdge.getWeight() > 0) {
			return 1;
		}
		//if (getWeight() - argEdge.getWeight() == 0) {
		return 0;
		//}
	}

	/**
	 * @return the source
	 */
	@Override
	public Node getSource() {
		return source;
	}

	/**
	 * @return the target
	 */
	@Override
	public Node getTarget() {
		return target;
	}

	/**
	 * @return the weight
	 */
	@Override
	public double getWeight() {
		return super.getWeight();
	}

}
