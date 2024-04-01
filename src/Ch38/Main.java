package Ch38;

import Ch38.Domain.Service.BookServiceImpl;

public class Main {
	public static void main(String[] args) throws Exception {
		BookServiceImpl service = new BookServiceImpl();
		
		service.getAllBooks().forEach(dto -> System.out.println(dto));
		
	}
}
