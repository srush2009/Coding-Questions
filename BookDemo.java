import java.util.HashMap;
import java.util.Map;

public class BookDemo extends Book{
	
	public BookDemo(String title, String author, int count) {
        super(title, author, count);  
    }

	public static Map<String,Integer> countBooks(BookDemo[] library){
		Map<String,Integer> bookCounts=new HashMap<>();
		
		for(BookDemo book:library) {
			String title=book.getTitle();
			int count=bookCounts.getOrDefault(title, 0);
			bookCounts.put(title, count+book.getCount());
		}
		return bookCounts;
	}
	

	public static void main(String[] args) {
		BookDemo[] library=new BookDemo[] {
				new BookDemo("The Lord of the Rings","J.R.R Tolkier",2),new BookDemo("Pride and Prejudice","Jane Austin",1)
		};
		Map<String,Integer> bookCounts=countBooks(library);
		for(Map.Entry<String,Integer> entry:bookCounts.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
class Book{
	private String title;
	private String author;
	private int count;
	
	public Book(String title, String author, int count) {
		super();
		this.title = title;
		this.author = author;
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public int getCount() {
		return count;
	}	
}
