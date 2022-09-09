public class sorting{

    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int mid;
        if((arr.length)%2==0)
        {
         mid=(arr[0]+arr[arr.length-1])/2;
        System.out.println(mid);
        }
        else
        {
             mid=((arr[0]+arr[arr.length-1])/2)-1;
        //System.out.println(mid); 
        }
         int i=mid,j=mid+1;
         while(mid>=0)
         {
             System.out.print(arr[mid]+" ");
             mid--;
             if(j<arr.length)
                 System.out.print(arr[j++]+" ");
         }
    
    