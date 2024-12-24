import java.util.Arrays;
public class k{
    public static void mergeSort(int[] arr){
        if(arr.length>1){
            int mid=arr.length/2;
            int[] left=Arrays.copyOfRange(arr, 0, mid);
            int[] right=Arrays.copyOfRange(arr, mid, arr.length);
            mergeSort(left);
            mergeSort(right);
            merge(arr,left,right);
        }
    }
    public static void merge(int[]arr, int[]left,int[] right){
        int i=0,j=0,k=0;
        while(i<left.length &&j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={4,8,1,10,7,5,9,12};
        printArray(arr);
        System.out.println("Mang ban dau");
        mergeSort(arr);
        System.out.println("Mang sau khi sap xep");
        printArray(arr);
    } 
}

