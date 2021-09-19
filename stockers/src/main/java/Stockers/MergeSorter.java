// Adopted Merge sort to maintain a Time Complexity not exceeding O(nlogn)
package Stockers;


public class MergeSorter {
    
    public void sort(Company []arrayOfCompany, int left, int right){
        
      if (left<right){
            int mid =left +(right-left)/2;
            sort(arrayOfCompany, left, mid);
            sort(arrayOfCompany, mid+1, right);
            mergeSort(arrayOfCompany, left, mid, right);
            }
   
    }
   
    public void mergeSort(Company carr[], int left, int mid, int right){
        
            int n1 = mid- left+1;  
            int n2 = right-mid; 
            Company [] L = new Company[n1];
            Company []R= new Company[n2];
            for(int i=0; i<n1; i++)
                    L[i]= carr[left+i];
            for(int i=0; i<n2; i++)
                    R[i] = carr[mid+1+i];
   
   
            int i=0, j=0;
            int k = left;
            while(i<n1 && j<n2){
                if (L[i].sharePrice< R[j].sharePrice){
                    carr[k++] = L[i++];
                }
                else {
                    carr[k++] =R[j++];
                }
              }
            while(i<n1){
                carr[k++] = L[i++];
            }
            while( j<n2){
                carr[k++] = R[j++];
            }
         
    }    
    
}
