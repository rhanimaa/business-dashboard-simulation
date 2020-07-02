
public class TestProduct {

	String stockname;
	double price;
	int quant;

	public TestProduct(String stockname, double price, int quant) {

		if (price >= 10000) {
			HighEnd newproduct = new HighEnd(stockname, price, quant);
			System.out.print(newproduct.getRetailPrice());
		}

		else if (price > 500) {
			MidRange newproduct = new MidRange(stockname, price, quant);
			System.out.print(newproduct.getRetailPrice());
		}

		else {
			LowEnd newproduct = new LowEnd(stockname, price, quant);
			System.out.print(newproduct.getRetailPrice());
		}

	}
}
