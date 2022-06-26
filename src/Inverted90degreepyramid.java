public class Inverted90degreepyramid{
    public static void main(String[] args) throws Exception {

int row = 4;

for (int i = 1; i <= row ; i++) {

    // Inner loop for space

    for (int j = 0; j <= row-i ; j++) {
        System.out.print(" ");
    }

    // 2nd inner loop for star's

    for (int j = 1; j <=i ; j++) {
        System.out.print("*");
    }
    System.out.println();
}

    }
}
