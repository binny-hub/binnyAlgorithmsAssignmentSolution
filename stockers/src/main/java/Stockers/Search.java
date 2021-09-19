// to Search for a particular value
package Stockers;

public class Search {
    
    public  int  searchStock(Company []arrayOfCompany ,int left, int right, double sharePrice){
        if (left >right){
            return -1;
        }
        int mid =(left +right)/2;
        if (arrayOfCompany[mid].sharePrice == sharePrice ){
          return mid ;
        }
        else
            if (sharePrice < arrayOfCompany[mid].sharePrice ){
                    left =mid+1;
            }  
            else{ 
                right = mid-1;
                }
        return searchStock(arrayOfCompany,left, right , sharePrice) ;
        } 
    
}
