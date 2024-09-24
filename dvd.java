public class dvd extends product{
    //DvD

    private int lenght ;
    private String rating ;
    private String studio ;

    public dvd() {
        super();
        lenght = 0;
        rating = "";
        studio = "";   
    }

    //Constructor Parameter
    public dvd (int number, String nama, int quantify, double price, String artist, int nomorlagu, String label) {
        super(number, nama, quantify, price);
        this.lenght = lenght;
        this.rating = rating;
        this.studio = studio;
    }

	public int getLight() {
		return this.lenght;
	}

	public void setLight(int light) {
		this.lenght = light;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getStudio() {
		return this.studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Lenght : "+lenght);
		System.out.println("Rating : "+rating);
		System.out.println("Studio : "+studio);
		
		
	}


   
    
}
