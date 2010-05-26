
package graph.generation;

import java.util.List;

/**
 *
 * @param <T> the type of graph to generate
 * @author c00kiemon5ter
 */
public interface Generator<T> {
	T generateSingleGraph(GeneratorGraphType gentype, int graphSize);
	List<T> generate(GeneratorGraphType gentype, int graphSize, int numOfGraphs);
	List<T> getGeneratedGraphs();
}
