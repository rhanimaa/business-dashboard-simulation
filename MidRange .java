
public class MidRange extends Product{
	
	//mid range products will have a medium Discount Rate and A medium Margin

	
     public MidRange(String stockname, double price, int quant){
       	 
     	super(stockname, price, quant);
     	this.setRetailPrice();
     }
     
     public double getRetailPrice() {return retailprice;}
     public void setRetailPrice() {this.retailprice = getCostprice() + (((getCostprice())/100)*40);}
     
     public String toString() {
     	return "Stock Name: " + this.getName() + ", Price: " + this.getCostprice() + ", Quantity: " + this.getQuantity() + ", Retail Price: " + getRetailPrice();
     }
     
     /**
      * Applies discretionary 10% discount to mid end products
      */
     @Override
     public double discount() {
     	return 0.10 * this.getRetailprice();
     }
}
     
