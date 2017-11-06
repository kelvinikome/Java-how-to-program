
class Invoice{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	Invoice (String partNum, String partDesc, int pc){
		partNumber = partNum;
		partDescription = partDesc;
		price = pc;
	}
	
	void setPartNumber (String pnum){
		partNumber = pnum;
	}
	
	String getPartNumber (){
		return partNumber;
	}
	
	void setPartDescription (String str){
		partDescription = str;
	}
	
	String getPartDescription (){
		return partDescription;
	}
	
	void setQuantity (int x){
		quantity = x;
	}
	
	int getQuantity (){
		return quantity;
	}
	
	void setPrice (double x){
		price = x;
	}
	
	double getPrice (){
		return price;
	}
	
	double getInvoiceAmount(int x){
		if (x < 0)
			return 0;
		if (price < 0)
			return 0;
		return x * price;
	}
}

class Exercise3_12{
	public static void main (String [] args){
		Invoice invoice = new Invoice("1", "radio", -400);
		
		System.out.println(invoice.getInvoiceAmount(2));
	}
}