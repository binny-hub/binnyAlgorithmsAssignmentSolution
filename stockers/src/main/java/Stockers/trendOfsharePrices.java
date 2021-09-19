// Display the number of companies whose prices rose or declined

package Stockers;

public class trendOfsharePrices {
    // function to calculate number of companies whose prices rose
    public int numberOfCompaniesWhosePricesRose(Company [] arrayOfCompany, int size){
        
        int count =0;
        for(int i=0; i<size; i++){
            if (arrayOfCompany[i].comparePriceWithYesterday == true)
                count+=1;
        }
        return count;
    }
    
// function to calculate number of companies whose prices declined
    public int numberOfCompaniesWhosePricesDeclined(Company []arrayOfCompany, int size){
        
        int count =0;
        for(int i=0; i<size; i++){
            if (arrayOfCompany[i].comparePriceWithYesterday != false) {
            } else {
                count+=1;
            }
        }
        return count;
    }

}
