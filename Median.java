

//Find out the median of two sorted array
public class Median {
    public static void main(String args[]){
        int arr1[]={1,2,6};
        int arr2[]={3,5,7};
        int temp[]=new int[(arr1.length)+(arr2.length)];
        int k=0,i=0,j=0,mid=0,k2=0;


        while(i< arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k] = arr1[i];
                i++;
            } else {
                temp[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            temp[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            temp[k++] = arr2[j++];
        }

        int a= temp.length;
        if(a%2==0){
            k2=(temp.length)/2;
            mid = (temp[k2]+temp[k2-1])/2;
        }
        else{
           int k1=(int)(temp.length)/2;
            mid=temp[k1];
        }
        System.out.println("The median of two sorted array is "+mid);
    }
}
