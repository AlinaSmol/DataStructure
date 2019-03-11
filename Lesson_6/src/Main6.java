public class Main6 {

    public static void main(String[] args) {

        int randFrom = -20;
        int randTo = 20;

        int treeNumbers = 1000;
        int treeDeep = 4;

        int trueCount = 0;

        for (int i = 0 ; i< treeNumbers; i++) {
            Tree<Integer> tree = new TreeImpl<>(treeDeep);

            for (int j = 1; j <= Math.pow(2,treeDeep)-1; j++) {
                int randValue = randFrom + (int) (Math.random() * randTo*2);
                tree.add(randValue);
            }
            if (isBalanced(((TreeImpl<Integer>) tree).getRootNode()) == true){
                trueCount++;
            }
        }
        System.out.println("Процент сбалансированных деревьев: " + (float)(trueCount*100/treeNumbers) + " %");

    }

    public static boolean isBalanced(Node node) {
        return (node == null) ||
                isBalanced(node.getLeftChild()) &&
                        isBalanced(node.getRightChild()) &&
                        Math.abs(height(node.getLeftChild()) - height(node.getRightChild())) <= 1;
    }

    private static int height(Node node) {
        return node == null ? 0 : 1 + Math.max(height(node.getLeftChild()), height(node.getRightChild()));
    }
}
