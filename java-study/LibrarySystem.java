package LibrarySystem;

import java.util.ArrayList;
import java.util.List;



class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;
    private String borrower;
    
    public Book(String title, String author, String isbn) {
    	this.title = title;
    	this.author = author;
    	this.isbn = isbn;
    	this.isBorrowed = false;
    	this.borrower = null;
    }

    //Getter and Setter methods
    public String getTitle () {return title;} 
    public String getAuthor () {return author;} 
    public String getIsbn () {return title;} 
    public boolean isBorrowed() {return isBorrowed; }
	public String getBorrower() {return borrower;}
	public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setIsbn(String isbn) {this.isbn = isbn;}
    public void setBorrowed(boolean borrowed) {isBorrowed = borrowed;}
    public void setBorower(String borrower) {this.borrower = borrower;}
}

class Member {
	  private String name;
	  private String memberId;
	  
	  public Member(String name, String memberId) {
		  this.name = name;
		  this.memberId = memberId;
	  }


	  //Getter and Setter methods
	  public String getName() { return name;}
	  public String getMemberId() {return memberId;}
	  public void setName(String name) {this.name = name;}
	  public void setMemberId(String memberId) {this.memberId = memberId;}
	  	
}


public class LibrarySystem {
	   private List<Book>  books;
	   private List<Member> members;
	   private boolean isLoggedIn;
	   private String currentUser;
	   
	   public LibrarySystem() {
		  this.books = new ArrayList<>();
		  this.members = new ArrayList<>();
		  this.isLoggedIn = false;
		  this.currentUser = null;  
		   
	   }
	   
	   public static void main(String[] args) {
	   LibrarySystem librarySystem = new LibrarySystem();
	   
	   }

	   // LibrarySystem.java 계속, 단계2. 책 관련 기능 구현

 public void addBook(String title, String author, String isbn) {
	 Book book = new Book(title, author, isbn);
	 books.add(book);
	 System.out.println("책 추가 완료!");
	 
 }
 
 public void removeBook(String isbn) {
	  Book bookToRemove = findBookByIsbn(isbn);
	  if (bookToRemove != null) {
		   books.remove(bookToRemove);
		   System.out.println("책 삭제 완료!");	  
	  } else {
		   System.out.println("해당 책을 찾을 수 없습니다.");
	  }
	 
 }
 
 public void displayAllBooks() {
	 if (books.isEmpty()) {
		 System.out.println("등록된 책이 없습니다.");
	 } else {
		 for (Book book : books) {
			 System.out.println("제목:" + book.getTitle());
			 System.out.println("저자:" + book.getAuthor());
			 System.out.println("ISBN:" + book.getIsbn());
			 System.out.println("대출상태:" + (book.isBorrowed()? "대출 중" : "대출 가능"));
			 System.out.println();
		 }
	 }

}
	
 private Book findBookByIsbn(String isbn)	 {
	 for (Book book : books) {
		 if (book.getIsbn().equals(isbn)) {
			 return book;
		 }
	 }
	  return null;
 }

	 
	
// LibrarySystem.java 계속, 회원 관련 기능 구현

	public void registerMember(String name, String memberId) {
		Member member = new Member(name, memberId);
		members.add(member);
		System.out.println("회원 등록 완료!");
	}

	public void removeMember(String memberId) {
		Member memberToRemove = findMemberById(memberId);
		if(memberToRemove != null) {
			members.remove(memberToRemove);
			System.out.println("회원 삭제 완료");
			
		} else {
			System.out.println("해당 회원을 찾을 수 없습니다.");
		}
	}
	 
	public void displayAllMembers() {
		if (members.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
		}  else {
			for (Member member: members) {
				System.out.println("이름: " + member.getName());
				System.out.println("회원ID:" + member.getMemberId());
				System.out.println();
			}
		}
	}

	private Member findMemberById(String memberId) {
		  for (Member member : members) {
			  if (member.getMemberId().equals(memberId)) {
				  return member;
				  
			  }
		  }
	        return null;        
	}
}
	
 
	 //LibrarySysem.java 계속, 대출 및 반납 기능 구현


	 
 
 
 
 
