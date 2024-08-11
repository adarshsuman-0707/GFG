package sorting;

// find min and max element from subarray 
public class quesTEsT {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


    public static void main(String[] args){
    
    int arr[]={1,2,3,4,5};
int n=arr.length,i,j;
int sum=0,min=Integer.MAX_VALUE;
int maxs=Integer.MIN_VALUE;
for(i=0;i<n;i++){
    sum = 0;
	   for(j=0;j<n;j++){ 
	       if(j!=i)
	       sum+=arr[j];
	   }
	   if(sum>maxs){
	           maxs=sum;
	       }
	   if(min>sum && maxs !=sum){
	       min=sum;
	   }
// System.out.println(sum);
}
    System.out.println(maxs + " " + min);
    
    
}
}

