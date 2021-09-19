// MAin Class programme
package Stockers;

import java.util.Scanner;
// create a class Company to store details
class Company{
    double sharePrice=0;
    boolean comparePriceWithYesterday= true;
}

public class shareStockers {
    private Company[]arrayOfCompany;
    private int size;
    Scanner sc= new Scanner(System.in);
    int ch;
    
    // Enter Details 
    public void enterDetails(){
        System.out.println("Enter the no of companies ");
        size = sc.nextInt();
        arrayOfCompany = new Company[size];
        for(int i=0; i<size;i++){
            arrayOfCompany[i] = new Company();
        }
            
        for(int i=0; i<size; i++){
            System.out.println("Enter the current stock price of the company " + (i+1));
            this.arrayOfCompany[i].sharePrice = sc.nextDouble();
            System.out.println("Whether company's stock price rose today compared to yesterday?");
            this.arrayOfCompany[i].comparePriceWithYesterday =sc.nextBoolean();
        }
        
        // Sort the elements using Merge Sort
        
        MergeSorter ms = new MergeSorter();
        ms.sort(arrayOfCompany, 0, size-1);
        
        // Menu displayed
        stockMenu stkMenu = new stockMenu();
        stkMenu.menu(arrayOfCompany,size);//Display the menu
    }
    
    
    public static void main(String args[]) {
        shareStockers stk =new shareStockers();
        stk.enterDetails();
        
    }
}
