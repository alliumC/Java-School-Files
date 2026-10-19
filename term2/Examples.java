public class Examples {
    public static void main(String[] args) {
        Example1();
        Example2();
        Example3();
    }

    public static void Example1() {
        int[][] matrix = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        }; 
        int sum = 0; 
        
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
            sum += matrix[i][j]; 
            } 
        } 

        System.out.println("Sum of all elements: " + sum);
    }

    public static void Example2() {
        int[][] matrix = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        }; 
 
        int[][] transpose = new int[matrix[0].length][matrix.length]; 
 
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
                transpose[j][i] = matrix[i][j]; 
            } 
        } 
 
        System.out.println("Transpose of the matrix:"); 
        for (int i = 0; i < transpose.length; i++) { 
            for (int j = 0; j < transpose[i].length; j++) { 
                System.out.print(transpose[i][j] + " "); 
            } 
            System.out.println(); 
        }
    }

    public static void Example3() {
       int[][] matrixA = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        }; 
         
        int[][] matrixB = { 
            {9, 8, 7}, 
            {6, 5, 4}, 
            {3, 2, 1} 
        }; 
 
        int[][] product = new int[matrixA.length][matrixB[0].length]; 
        
        // row of a 
        for (int i = 0; i < matrixA.length; i++) { 
            // column of b
            for (int j = 0; j < matrixB[0].length; j++) { 
                // multiply row a by column be then go to the next column
                // after all column done, go to next row
                for (int k = 0; k < matrixA[0].length; k++) { 
                    product[i][j] += matrixA[i][k] * matrixB[k][j]; 
                } 
            } 
        } 
 
        System.out.println("Product of the matrices:"); 
        for (int i = 0; i < product.length; i++) { 
            for (int j = 0; j < product[i].length; j++) { 
                System.out.print(product[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
}
