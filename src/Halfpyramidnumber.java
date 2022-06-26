public class Halfpyramidnumber {

    public static void main(String[] args) throws Exception {

        int n = 5;
        int counter = 0;

        // Outer loop
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                counter++;

                System.out.print(counter + " ");

            }
            System.out.println();

        }

    }

}
