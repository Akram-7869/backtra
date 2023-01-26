import java.util.*;

public class divideadnconqurer {

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    
    // //divide the array using recursion
    // public static void recursion(int arr[],int si,int ei){

    //     //base condition
    //     if(si>=ei)return;
    //     //operation
    //     int mid=si+(ei-si)/2;
    //     recursion(arr, si, mid);
    //     recursion(arr, mid+1, ei);

    //     mergersort(arr, si, mid,ei);
    // }

    // //mergeing the arrays
    // public static void mergersort(int arr[],int si,int mid,int ei){
    //     int temp[]=new int[ei-si+1];
    //     int i=si;
    //     int j=mid+1;
    //     int k=0;

    //     while(i<=mid && j<=ei){
    //         if(arr[i]<arr[j]){
    //             temp[k]=arr[i];
    //             i++;
    //         }else{
    //             temp[k]=arr[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     //remaining elements
    //     while(i<=mid){
    //         temp[k++]=arr[i++];
    //     }
    //     //remaining elements for rigth
    //     while(j<=ei){
    //         temp[k++]=arr[j++];
    //     }

    //     //copying the temp elemnts in the array
    //     for( k=0, i=si;k<temp.length;k++,i++){
    //         arr[i]=temp[k];

    //     }
    // }

    // //quick sort 
    // public static void quick(int arr[],int si,int ei){
    //     //base condtion
    //     if(si>=ei)return;

    //     //opertaion
    //     int pivo=partition(arr,si,ei);
    //     quick(arr, si, pivo-1);
    //     quick(arr, pivo+1, ei);

    // }
    // public static int partition(int arr[],int si,int ei){
    //     int pivot=arr[ei];
    //     int i=si-1;
    //     for(int j=si;j<ei;j++){
    //         if(arr[j]<pivot){
    //             i++;
    //             //swap
    //             int temp=arr[j];
    //             arr[j]=arr[i];
    //             arr[i]=temp;
                
    //         }

    //     }
    //     i++;
    //     int temp =pivot;
    //     arr[ei]=arr[i];
    //     arr[i]=temp;
    //     return i;
    // }

    // //roatated array adn ascending ordre
    // public static int bandre(int arr[],int tar,int si,int ei){
    //     //base condtion
    //     if(si>ei) return-1;

    //     int mid=si+(ei-si)/2;
    //     //operation
    //     if(arr[mid]==tar) return mid;

    //     //all cases
    //     if(arr[si]<=arr[mid]){
    //         //case 1:line 1 in left side
    //         if(arr[si]<=tar && tar<=arr[mid]){
    //             //search in left
    //             return bandre(arr, tar, si, mid-1);
    //         }
    //         //case 2:after mid in right side
    //         else{
    //             return bandre(arr, tar, mid+1 ,ei);
    //         }
    //     }
    //     else{
    //         //case 3:line 2:in right side
    //         if(arr[mid]<=tar && tar<=arr[ei]){
    //             return bandre(arr, tar, mid+1, ei);
    //         }
    //         //case 4:before mid in left side
    //         else{
    //             return bandre(arr, tar, si, mid-1);
    //         }
    //     }

    // }

    //home work wns
    public static void q&cofstring(String arr[],int i){
        int j=0;
      //base case
      if(arr[i]==arr.length()) return;
    }
    



    public static void main(String[] args) {
    //     int arr[]={4,5,6,7,0,1,2,3};
    //   //  recursion(arr, 0, arr.length-1);
    //    int idx=bandre(arr, 2, 0, arr.length-1);
    //     System.out.println(idx);
        String arr[]={"sun","earth","mars","mercury"};

    }
}
