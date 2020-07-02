
import java.util.Random;
public class Product {

	// instance variables 
	 private int barcode;
	 private int quantity;
     private String name;
     private double costprice;
     protected double retailprice;

     // constructor 
     public Product() {
    	
    	 
     }
     
     // constructor with parameters 
     public Product(String stockname, double price, int quant){
    	 this.setName(stockname);
    	 this.setBarcode(barcode);
    	 this.setCostprice(price);
    	 this.setQuantity(quant);
 
     }
     
     public void setBarcode(int barcode) {
    	 //Create Random Number Generator to generate the barcode 
    	 // create a n instance to generate a number 
    	 Random rand = new Random();
    	 barcode= rand.nextInt(10);
    	 this.barcode = barcode; }
     public int getBarcode() {return barcode;}

     
     public void setQuantity(int quantity) {this.quantity = quantity;}
     public int getQuantity() {return quantity;}

     public void setName(String name) {this.name = name;}
     public String getName() {return name;}

     
     public void setCostprice(double costprice) {this.costprice = costprice;}
     public double getCostprice() {return costprice;}
     
     public void setRetailPrice(double costprice) {this.costprice = costprice;}
     public double getRetailprice() {return retailprice;}

     /**
      * Standard discount of 10% is applied
      * @return
      */
     public double discount() {
    	 return this.retailprice * 0.1;
     }
}
    

