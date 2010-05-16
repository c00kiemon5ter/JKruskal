
package jkruskal;

/**
 *
 * @author Ivan Kanakarakis
 */
public class JKruskal {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		JKruskal jKruskal = new JKruskal(args);
		jKruskal.findMinSpanTree();
	}

	private JKruskal(String[] args) {
		/* TODO:
		 * load/read data	<-- using DataReader
		 * init graph		<-- Directed? WeightedGraph &JGraphT
		 * create minimum spanning tree		<-- when called
		 */
		parseArgs(args);
	}

	private void parseArgs(String[] args) {
		/* TODO:
		 * create an cli argument parser
		 */
		throw new UnsupportedOperationException("Not yet implemented");
	}

	private void findMinSpanTree() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

}
