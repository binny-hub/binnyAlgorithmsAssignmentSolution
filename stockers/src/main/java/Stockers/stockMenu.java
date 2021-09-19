// Display the menu
package Stockers;

import java.util.Scanner;

public class stockMenu {
    // display the menu
    
    public void menu(Company[]arrayOfCompany, int size){
    Scanner sc = new Scanner(System.in);
    int ch;
    
    while (true){
            System.out.println("------------------------");
            System.out.println("Enter the operation that you want to perform");
            System.out.println("1. Display the companies stock prices in ascending order ");
            System.out.println("2. Display the companies stock prices in descending order ");
            System.out.println("3. Display the total no of companies for which stock prices rose today " );
            System.out.println("4. Display the total no of companies for which stock prices declined today " );
            System.out.println("5. Search a specific stock price");
            System.out.println("6. press 0 to exit");
            System.out.println("---------------------");
            ch = sc.nextInt();
            // 
            switch(ch){
                case 1: { 
                         displayDetails ds = new displayDetails();
                         ds.displayDetailsInAscendingOrder(arrayOfCompany, size);
                         break; }
                
                case 2: {
                         displayDetails ds = new displayDetails();
                         ds.displayDetailsInDescendingOrder(arrayOfCompany, size);
                         break; }
                
                case 3: {
                        trendOfsharePrices tr = new trendOfsharePrices();
                        int c= tr.numberOfCompaniesWhosePricesRose(arrayOfCompany, size);
                        System.out.println(" Total no of companies whose stock price rose today : " + c);
                        break;
                       }
            
                case 4: {
                        trendOfsharePrices tr = new trendOfsharePrices();
                        int c= tr.numberOfCompaniesWhosePricesDeclined(arrayOfCompany, size);
                        System.out.println(" Total no of companies whose stock price declined today : " + c);
                        break;
                       }
                
                case 5: {double sharePrice;
                        System.out.println(" enter the key value ");
                        sharePrice = sc.nextDouble();
                        Search sch = new Search();
                        int index;
                        index= sch.searchStock(arrayOfCompany, 0,size-1, sharePrice);
                        if(index >0){
                            System.out.println("Stock of Value "+ sharePrice + "is present");}
                        else{
                            System.out.println(" The key value is not present in the list ");}
                        break;
                        }
                
                case 0:{ System.out.println( "Exited Successfully ");
                         System.exit(0);
                        }
                
                default : System.out.println( "Invalid choice - Enter again");
                }
             
            }
            
    }  
    
}
