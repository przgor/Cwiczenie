
public class PascalTriangle {

	int[][] triangle;

    public PascalTriangle(int n) {
    	triangle= new int [n][n];
       
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i+1; j++) {
                if (i == 0 || j == 0 || j == i + 1) {
                    triangle[i][j] = 1;
                }
                else{
                	triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
                    }
                    System.out.print(triangle[i][j]);

                }

                System.out.println();
        }


}

    public static PascalTriangle compute(int n) {
        if (n<=0)
        {
            throw new NullPointerException("n musi byæ wiêksze od 0");
        }

        PascalTriangle pascalTriangle = new PascalTriangle(n);

        return pascalTriangle;
    }

    public int[][] getTriangle() {
        return triangle;
    }
}
