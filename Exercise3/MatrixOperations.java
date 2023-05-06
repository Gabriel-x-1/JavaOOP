public class MatrixOperations {

    public  double[][] matrixAdd(double m1[][], double m2[][]) 
    {   int dimesnion1 = m1.length;
        int dimension2 = m1[1].length;
        double result [][]= new double [dimesnion1][dimension2];
        for(int i=0;i<m1.length;i++)
        {
            for(int j =0;j<m1[i].length;j++)
            {
              result[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return result;
    }
    static void printMatrix(double m1[][])
    {
        for(int i =0; i<m1.length;i++)
        {
            for(int j =0; j<m1[i].length;j++)
            {
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public double matrixDiagSum(double m1[][])
    {   double sum=0;
        for(int i=0;i<m1.length;i++)
        {
            sum=sum+m1[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {

        double m1[][]={
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        double m2[][]=
        {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };
       if(m1.length==m2.length && m1[0].length==m2[0].length)
       {
       MatrixOperations obj =new MatrixOperations();
       printMatrix(obj.matrixAdd(m1, m2));
       if(m2.length==m2[0].length)System.out.println(obj.matrixDiagSum(m2));
       else System.out.println("The matrice isn't sqare");
       }
       else 
       {
        System.out.println("Something went wrong");
       }
    }
}