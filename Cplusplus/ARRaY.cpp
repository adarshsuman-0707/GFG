#include<iostream>
using namespace std;
int main(){

    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int smallest=INT_MAX;
    int largest=INT_MIN;
    int indx1=0;
    int indx=0;
    for(int i=0;i<10;i++){
        if(arr[i]>largest){
            largest=arr[i];
            indx1=i;
        }
        if(arr[i]<smallest){
            smallest=arr[i];
            indx=i;
        }

    }

    cout<<"Largest "<<largest<<" index "<< indx1<<"\nsmallest "<<smallest<<" index  "<<indx;

    return 0;
}