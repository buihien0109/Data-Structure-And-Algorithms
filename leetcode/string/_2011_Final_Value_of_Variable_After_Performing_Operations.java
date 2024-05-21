public class _2011_Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String operation : operations) {
            switch (operation) {
                case "++X": {
                    ++ans;
                    break;
                }
                case "X++": {
                    ans++;
                    break;
                }
                case "--X": {
                    --ans;
                    break;
                }
                case "X--": {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
