
package algo;

import graph.Edge;
import graph.Node;
import graph.collection.DisjointSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kruskal {
	public ArrayList<Edge> getMST(List<Node> nodes, List<Edge> edges) {
		Collections.sort(edges);
		ArrayList<Edge> MST = new ArrayList<Edge>(edges.size() / 2);
		DisjointSet<Node> nodeset = new DisjointSet<Node>();
		nodeset.createSubsets(nodes);
		for (Edge e : edges) {
			if (nodeset.find(e.getSource()) != nodeset.find(e.getTarget())) {
				nodeset.merge(nodeset.find(e.getSource()), nodeset.find(e.getTarget()));
				MST.add(e);
			}
		}
		return MST;
	}

}
