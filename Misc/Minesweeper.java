import java.util.Scanner;
public class Minesweeper {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int M = obj.nextInt();
        int N = obj.nextInt();
        double p = obj.nextDouble();

        //putting bombs at random position in array
        boolean[][] bombs = new boolean[M+2][N+2];
        for (int i = 1; i <= M; i++)
            for (int j = 1; j <= N; j++)
                bombs[i][j] = (Math.random() < p);

        // printing bombs and safe places
        //can be comment out if you do not want to print
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++)
                if (bombs[i][j])
                    System.out.print("* "); //Bombs represented by *
                else
                    System.out.print(". "); //Safe places are represented by .
            System.out.println();
        }

        // sol[i][j] is number of bombs adjacent to (i, j)
        int[][] sol = new int[M+2][N+2];
        for (int i = 1; i <= M; i++)
            for (int j = 1; j <= N; j++)
                for (int k = i - 1; k <= i + 1; k++)
                    for (int l = j - 1; l <= j + 1; l++)
                        if (bombs[k][l])
                            sol[i][j]++;  //incrementing number of bombs

        System.out.println();
                //Printing the numbers of neighbouring bombs and bombs
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++)
                if (bombs[i][j]) System.out.print("* ");
                else             System.out.print(sol[i][j] + " ");
            System.out.println();
        }

    }
}