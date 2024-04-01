package Ch38.Cotroller;

import java.util.Map;

import Ch38.Domain.Dto.BookDto;

public class BookController implements SubController {

	/*	ServiceNo
	 * 1 Insert
	 * 2 Update
	 * 3 Delete
	 * 4 SelectAll
	 * 5 Select
	 */
	@Override
	public Map<String, Object> execute(int serviceNo, Map<String, Object> params) {
		/*
		 * 1 파라미터 받기
		 * 2 입력값 검증(유효성 체크, Validation Check)
		 * 3 서비스 실행
		 * 4 View Page 로 이동 (or Rest Data 전달)
		 */
		System.out.println("BookController execute()");
		
		if (serviceNo == 1) {
			// INSERT
			System.out.println("[SC]BookController's INSERT");
			
			// 1. 파라미터 받기
			BookDto dto = (BookDto)params.get("bookDto");  
			
			System.out.println(dto);
			
			// 2. 입력값 검증 ( 데이터 검증 )
			if( !isValid(dto) ) {
				return null;  // 유효하지않다
			}
			
			// 3 서비스 실행
			
			// 4 결과를 뷰로 전달 or 이동
			
		} else if(serviceNo == 2) {
			// UPDATE
			System.out.println("[SC]BookController's UPDATE");
		} else if(serviceNo == 3) {
			// DELETE
			System.out.println("[SC]BookController's DELETE");
		} else if(serviceNo == 4) {
			// SELECTALL
			System.out.println("[SC]BookController's SELECTALL");
		} else if(serviceNo == 4) {
			// SELECT
			System.out.println("[SC]BookController's SELECT");
		}
		
		return null;
	}
	
	private boolean isValid(BookDto dto) {
		// Null 체크
		// trim 제거
		// 나머진 데이터 형태에 따라 유동적으로 체크
		
		return true;
	}
}
