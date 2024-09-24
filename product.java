
//Super Class
public class product {
    private int number ;
    private String nama ;
    private int quantity ;
    private double price ;

    public product () {
        number = 0;
        nama = "";
        quantity = 0;
        price = 0;
    }

    //Constructor Parameter
    public product (int number, String nama, int  quantify, double price) {
        this.number = number;
        this.nama = nama;
        this.quantity = quantity;
        this.price = price;
    }

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getQuintity() {
		return this.quantity;
	}

	public void setQuintify(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void print() {
		System.out.println("Number : "+number);
		System.out.println("Nama : "+nama);
		System.out.println("Quantity : "+quantity);
		System.out.println("Price : "+price);
	}


   
}
