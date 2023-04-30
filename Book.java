package week1.day1;

public class Book {
	public static void main(String[] args) {
		int noofPages = 250;
		String bookName = "Ponniyin Selvan";
		String authorName = "Kalki";
		float price = 199.5f;
		long barcode = 2395809763046l;
		boolean isFiction = true;
		
		System.out.println(bookName+" "+authorName+" "+isFiction);
		System.out.println(noofPages);
		System.out.println(price);
		System.out.println(barcode);
	}
}

