public class TwoDArray {
    public static void main(String[] args) 
    {
        int A[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int B[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int c[][] = new int[3][3];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                c[i][j] = A[i][j] + B[i][j];
            }
        }
        for(int x[]:c)
        {
            for(int y:x)
            {
                System.out.print(y+ " ");
            }
            System.out.println();
        }
    }
}
