
package IO;

import Graph.Node;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class DataReader {
	private File datafile;
	private Scanner scan;
	private DirectedGraph<Node, DefaultWeightedEdge> graph;

	public DataReader(final String filename) throws FileNotFoundException {
		this(new File(filename));
	}

	public DataReader(final File file) throws FileNotFoundException {
		datafile = file;
		scan = new Scanner(new BufferedReader(new FileReader(datafile)));
		this.graph = new DefaultDirectedWeightedGraph<Node, DefaultWeightedEdge>(DefaultWeightedEdge.class);
	}

	public boolean readFile() {
		boolean success = true;
		while (scan.hasNextInt()) {
			String[] vertex = scan.nextLine().split("\\s");
			if (vertex.length != 2) {
				success = false;
				break;
			} else {
				Node source = new Node(vertex[0]);
				Node target = new Node(vertex[1]);
				graph.addVertex(source);
				graph.addVertex(target);
				graph.addEdge(source, target);
			}
		}
		scan.close();
		return success;
	}

	public DirectedGraph<Node, DefaultWeightedEdge> getDirectedGraph() {
		return graph;
	}

}
