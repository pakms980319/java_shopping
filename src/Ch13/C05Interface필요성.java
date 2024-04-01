package Ch13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



//-----------
//Dto
//-----------
class Board{
	private int no ;
	private String content ;
	private String writer;
	private LocalDate date;
	
	public Board(int no, String content, String writer, LocalDate date) {
		super();
		this.no = no;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Board [no=" + no + ", content=" + content + ", writer=" + writer + ", date=" + date + "]";
	}
	
	
	
}
class Authentication{
	private String username;
	private String password;
	private String role;
	
	public Authentication(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Authentication [username=" + username + ", password=" + password + ", role=" + role + "]";
	}	
}
//--------------------------
//PersistanceLayer
//--------------------------

class Database{
	public static int boardNo=0;
	public static Map<String,Board> board = new HashMap();
	public static Map<String,Authentication> member = new HashMap();
	public static Map<String,Authentication> session = new HashMap();
}


//--------------------------
//Service Layer
//--------------------------
interface CrudServiceInterface{
	boolean insert(Object data);	
	List<Object> selectAll();
}

interface AuthInterface{
	boolean login(Authentication authentication);
	boolean logout(String username);
	
}

class BoardService implements CrudServiceInterface{
	//게시글 등록
	@Override
	public boolean insert(Object data) {
		Board board = (Board)data;
		Database.board.put((Database.boardNo++)+"", board);
		return true;
	}

	@Override
	public List<Object> selectAll() {
		List<Object> list = new ArrayList();
		
		for(String key : Database.board.keySet()) {
			list.add(Database.board.get(key));
		}
		return list;
	}
	
}
class AuthService implements CrudServiceInterface,AuthInterface{
	Map<String, Object> session = new HashMap();
	
	//----------------------------------
	//CrudServiceInterface
	//----------------------------------
	@Override
	public boolean insert(Object data) {
		//회원가입
		Authentication authentication  = (Authentication)data;
		Database.member.put(authentication.getUsername(),authentication);
		return true;
	}
	
	@Override
	public List<Object> selectAll() {
		List<Object> list = new ArrayList();
		
		for(String key : Database.member.keySet()) {
			list.add(Database.member.get(key));
		}
		return list;
	}
	
	//----------------------------------
	//AuthInterface
	//----------------------------------
	@Override
	public boolean login(Authentication authentication) {
		//DB에 존재여부
		if(Database.member.containsValue(authentication)) {
			//Session에 존재 여부
			if(!Database.session.containsKey(authentication.getUsername())) {
				Database.session.put(authentication.getUsername(), authentication);
			}else {
				System.out.println("해당 계정은 로그인된 상태입니다.");
			}
			return true;
		}	
		System.out.println("해당 계정은 가입되어 있지 않습니다");
		return false;
	}
	
	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}


//----------------------------------------
//USE 
//----------------------------------------
public class C05Interface필요성 {
	
	
	public static  AuthService authService = new AuthService();
	public static BoardService boardService= new BoardService();
	
	//CRUD SERVICE EXECUTE
	public static void CRUDServiceExecute(CrudServiceInterface service,Object obj,int serviceNo) {
		switch(serviceNo) {
		case 1:				//INSERT
			boolean isAdded =  service.insert(obj);
			break;
		case 2:				//UPDATE
			
			break;
		case 3:				//SELECTAll
			List<Object> list =  service.selectAll();
			list.forEach((item)->{
				System.out.println(item);
			});
			
			break;
		case 4: 			//DELETE
			break;

		default : 
			;
		}
	}

	//AUTH SERVICE EXECUTE(1 LOGIN , 2 LOGOUT)
	static void authServiceExecute(AuthInterface auth,Authentication authentication,int ServiceNo) {
		
		switch(ServiceNo) {
			case 1:
				boolean isLogined =  auth.login(authentication);
				System.out.println("로그인 성공 여부 : " + isLogined);
				break;
			case 2:
				break;
			default :
				
		
		}
		
		
	}

	public static void main(String[] args) {
		
		//회원가입 1-INSERT 2-UPDATE 3-SELECTALL 4-DELETE  5-LOGIN 6-LOGOUT 
		Authentication member01 = new Authentication("user1","1234","ROLE_USER");
		Authentication member02 = new Authentication("user2","1234","ROLE_USER");
		Authentication admin = new Authentication("admin","1234","ROLE_ADMIN");
		CRUDServiceExecute(authService,member01,1);
		CRUDServiceExecute(authService,member02,1);
		CRUDServiceExecute(authService,admin,1);
		//확인
		CRUDServiceExecute(authService,null,3);
		System.out.println("-----------------------");
	
		//로그인
		authServiceExecute(authService,member01,1);
//		Authentication notJoined = new Authentication("user3","1234","ROLE_USER");
//		authServiceExecute(authService,notJoined,1);
		
		//게시글작성
		Board board1 = new Board(0,"안녕안녕1",member01.getUsername(),LocalDate.now());
		Board board2 = new Board(0,"안녕안녕2",member02.getUsername(),LocalDate.now());
		Board board3 = new Board(0,"안녕안녕3",admin.getUsername(),LocalDate.now());

		CRUDServiceExecute(boardService,board1,1);
		CRUDServiceExecute(boardService,board2,1);
		CRUDServiceExecute(boardService,board3,1);
		//게시글확인	
		CRUDServiceExecute(boardService,null,3);
		

		
		

		
		
	}
	
	
	
}
