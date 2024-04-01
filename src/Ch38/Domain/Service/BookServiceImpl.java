package Ch38.Domain.Service;

import java.util.List;

import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dto.BookDto;

public class BookServiceImpl {
	private BookDaoImpl dao;
	
	public BookServiceImpl() throws Exception {
		dao = new BookDaoImpl();
	}
	
	public boolean bookRegister(BookDto dto) throws Exception {
		return dao.Insert(dto);
	}
	
	public List<BookDto> getAllBooks() throws Exception {
		return dao.SelectAll();
	}
	
	public BookDto getBook(int bookCode) throws Exception {
		return dao.Select(bookCode);
	}
}
