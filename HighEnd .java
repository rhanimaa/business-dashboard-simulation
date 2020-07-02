
public class HighEnd extends Product{
	
	//High end products will have a Higher Discount Rate and A Lower Margin
	
	public HighEnd() {
    	
    }
    
    public HighEnd(String stockname, double price, int quant){
   	 
    	super(stockname, price, quant);
    	this.setRetailPrice();
    }
	
    public double getRetailPrice() {return retailprice;}
    public void setRetailPrice() {this.retailprice = getCostprice() + (((getCostprice())/100)*10);}
    
    
    public String toString() {
    	return "Stock Name: " + this.getName() + ", Price: " + this.getCostprice() + ", Quantity: " + this.getQuantity() + ", Retail Price: " + getRetailPrice();
    }
    /**
     * Applies discretionary 15% discount to high end products
     */
    @Override
    public double discount() {
    	return 0.15 * this.getRetailprice();
    }
}
