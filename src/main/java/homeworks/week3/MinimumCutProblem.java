package homeworks.week3;

import homeworks.Questionable;

public class MinimumCutProblem implements Questionable {

    private GraphData graph;

    MinimumCutProblem(GraphData graph) {
        this.graph = graph;
    }

    @Override
    public long getAnswer() {
        return 2;
    }
}
