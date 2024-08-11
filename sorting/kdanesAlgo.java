package sorting;

public class kdanesAlgo {
    public static void main(String[] args){
    
        int arr[]={2,1,-3,4,-1,2,1,-5,4};
        int last=0,max=Integer.MIN_VALUE;
    
    // kdanse algorithm
    int count=0;
    int n=arr.length,i,j,sum=0;
    for(i=0;i<n;i++){
        last=last+arr[i];
        if(max<last){
            max=last;
        }
        if(last<0){
            last=0;
        }
    }
    System.out.println(max);
        
}}
