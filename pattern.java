public static void main(String[] args) {
       String str="program";
       char []arr=str.toCharArray();
       int n=str.length();
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i+j==n-1||i==j)
               {
                   System.out.print(arr[j]+" ");
               }
               else
               {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
    