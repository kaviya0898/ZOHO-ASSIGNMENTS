public class matrix{

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row1=sc.nextInt();
         System.out.println("enter the no of rows");
        int column1=sc.nextInt();
       int array1[][]=new int [row1][column1];
       System.out.println("enter the no of rows");
        int row2=sc.nextInt();
         System.out.println("enter the no of rows");
        int column2=sc.nextInt();
         int array2[][]=new int [row2][column2];
         int result[][]=new int [row1][column2];
         for(int i=0;i<row1;i++)
         {
             for(int j=0;j<column1;j++)
             {
                 array1[i][j]=sc.nextInt();
             }
         }
         for(int i=0;i<row2;i++)
         {
             for(int j=0;j<column2;j++)
             {
                 array2[i][j]=sc.nextInt();
             }
         }
         System.out.println("multiplication");
         for(int i=0;i<row1;i++)
         {
             for(int j=0;j<column2;j++)
             {
                 for(int k=0;k<column1;k++)
                 {
                     result[i][j]+=array1[i][k]*array2[k][i];
                 }
                 System.out.print(result[i][j]+" ");
             }
         }
        
    }
    
}