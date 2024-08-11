package sorting;

//  find the total sum  negative element   from subarray

public class quesTest2 {
    public static void main(String[] args){
    
        int arr[]={1,-2,4,-5,1};
     
    
    // kdanse algorithm
    int count=0;
    int n=arr.length,i,j,sum=0;
    for(i=0;i<n;i++){sum = 0;
           for(j=i;j<n;j++){ sum = arr[j] + sum;if(sum<0)   count++;}}
                
        System.out.println(count);
        
                }}
