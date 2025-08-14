package recursion;

public class TryMerge {

public static void Merging(int arr[],int s,int m,int e){
int l=m-s+1;
int r=e-m;
int left[]=new int[l];
int right[]=new int[r];
for(int i=0;i<l;i++){
    left[i]=arr[s+i];
}
for(int j= 0;j<r;j++){
right[j]=arr[m+1+j];
}

int i=0,j=0,k=s;
while(i<l&& j<r){
    if(left[i]<=right[j]){
        arr[k++]= left[i++];
    }else{
        arr[k++]=right[j++];
    }
}
while(i<l){
   arr[k++]= left[i++];
}
while(j<r){
    arr[k++]= right[j++];
 }
}

public static  void divide(int arr[],int l,int r){
    if(l>=r)
{
    return;
}
int mid=l+(r-l)/2;
divide(arr,l,mid);
divide(arr,mid+1,r);
Merging(arr,l,mid,r);
}

    
    public static void main(String[] args) {
     int arr[]={5,4,3,2,1};
     int n=arr.length-1;
     divide(arr,0,n);
        for(int i:arr){
            System.out.println(i);
        }
    }

}
