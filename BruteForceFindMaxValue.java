public class BruteForceFindMaxValue {

    public static void main(String[] args) {
        Object[][] fruits = {
            {"orange", 2, 15},
            {"apple", 3, 10},
            {"banana", 1, 8},
            {"grape", 4, 12},
            {"mango", 5, 20},
            {"peach", 3, 14},
            {"pear", 2, 9},
            {"pineapple", 6, 25},
            {"strawberry", 2, 18},
            {"watermelon", 4, 30}
        };

        // Example: Print all fruit entries to verify
        for (Object[] fruit : fruits) {
            System.out.println("Name: " + fruit[0] + ", Quantity: " + fruit[1] + ", Price: " + fruit[2]);
        }


        int mostExpensiveTotal = 0;
        String mostExpensiveAns = "";
        System.out.println("\nFinding the most expensive combination of 2 fruits:\n");
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                int totalCost = (int) fruits[i][1] * (int) fruits[i][2] + (int) fruits[j][1] * (int) fruits[j][2];
                String text = fruits[i][0] + " + " + fruits[j][0] + " = " + totalCost;
                System.out.println(text);
                if (totalCost > mostExpensiveTotal) {
                    mostExpensiveTotal = totalCost;
                    mostExpensiveAns = text;
                }

            }
        }
        System.out.println("\nThe most expensive combination of 2 fruits is:\n" + mostExpensiveAns);
    }
}
