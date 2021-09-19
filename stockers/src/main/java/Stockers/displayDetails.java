// Display the details either in ascending or descending order
package Stockers;

public class displayDetails {
    //Display the details in Ascending order
    public void displayDetailsInAscendingOrder(Company []arrayOfCompany, int size ){
        System.out.println(" Stock prices in ascending order are: ");
        for(int i=0; i<size; i++){
            System.out.println(arrayOfCompany[i].sharePrice);
        }
    }
     
    // Display the details in Descending order
    public void displayDetailsInDescendingOrder(Company []arrayOfCompany, int size ){
        System.out.println(" Stock prices in descending order are: ");
        for(int i=size-1; i>=0; i--){
            System.out.println(arrayOfCompany[i].sharePrice);
        }
    }
}
