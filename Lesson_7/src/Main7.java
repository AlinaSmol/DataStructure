import java.util.Stack;

public class Main7 {

    public static void main(String[] args) {
        Graph graphCities = new Graph(10);
        graphCities.addVertex("Москва");
        graphCities.addVertex("Тула");
        graphCities.addVertex("Рязань");
        graphCities.addVertex("Калуга");
        graphCities.addVertex("Тамбов");
        graphCities.addVertex("Липецк");
        graphCities.addVertex("Орел");
        graphCities.addVertex("Саратов");
        graphCities.addVertex("Курск");
        graphCities.addVertex("Воронеж");

        graphCities.addEdges("Москва","Тула", "Калуга", "Рязань");
        graphCities.addEdge("Тула","Липецк");
        graphCities.addEdge("Рязань","Тамбов");
        graphCities.addEdge("Калуга","Орел");
        graphCities.addEdge("Тамбов","Саратов");
        graphCities.addEdge("Орел","Курск");
        graphCities.addEdges("Воронеж","Липецк", "Саратов", "Курск");

        Stack<Vertex> shortPath = graphCities.findShortPath("Москва", "Воронеж");

        System.out.println();

        while (!shortPath.isEmpty()){
            System.out.print(shortPath.pop().getLabel() + " ");
        }

    }


}
