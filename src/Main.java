public class Main {
    public static void main(String[] a){
        Directory directory = new Directory("Competitive Programming");
        File rotateArray= new File("rotateArray");
        File knapSack= new File("knapSack");
        File dfs = new File("DFS");
        Directory DP = new Directory("Dynamic Programming");
        Directory graph = new Directory("Graph");
        directory.addContent(rotateArray);
        directory.addContent(DP);
        directory.addContent(graph);
        DP.addContent(knapSack);
        graph.addContent(dfs);
        directory.pr();
    }
}
