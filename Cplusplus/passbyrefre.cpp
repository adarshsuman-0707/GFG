#include<iostream>
using namespace std;
void changeRefr(int arr[],int n){
for(int i=0;i<n;i++){
    arr[i]=arr[i]*2;

}
  for(int i=0;i<n;i++){
    cout<<arr[i];
    
}
}
int main(){
  int  arr[]={1,2,3};
  int n=3;
  changeRefr(arr,n);
  for(int i=0;i<n;i++){
    cout<<arr[i];
    
}
}