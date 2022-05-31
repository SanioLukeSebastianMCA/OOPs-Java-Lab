import java.util.Scanner;
class Publisher{
	int pid;
	String pname;
	Publisher(int pid, String pname){
		this.pid = pid;
		this.pname = pname;
	}
}

class Book extends Publisher{
	int bid;
	String bname;
	Book(int pid, String pname, int bid, String bname){
		super(pid, pname);
		this.bid = bid;
		this.bname = bname;
	}
}

class Literature extends Book{
	int lid;
	String lname;
	Literature(int pid, String pname, int bid, String bname, int lid, String lname){
		super(pid, pname, bid, bname);
		this.lid = lid;
		this.lname = lname;
	}
	void display(){
		System.out.println("Enter the Publisher ID : "+this.pid);
		System.out.println("Enter the Publisher NAME : "+this.pname);
		System.out.println("Enter the Book ID : "+this.bid);
		System.out.println("Enter the Book NAME : "+this.bname);
		System.out.println("Enter the Literature ID : "+this.lid);
		System.out.println("Enter the Literature NAME : "+this.lname);
	}
}

class Fiction extends Book{
	int fid;
	String fname;
	Fiction(int pid, String pname, int bid, String bname, int fid, String fname){
		super(pid, pname, bid, bname);
		this.fid = fid;
		this.fname = fname;
	}
	void display(){
		System.out.println("Publisher ID : "+this.pid);
		System.out.println("Publisher NAME : "+this.pname);
		System.out.println("Book ID : "+this.bid);
		System.out.println("Book NAME : "+this.bname);
		System.out.println("Fiction ID : "+this.fid);
		System.out.println("Fiction NAME : "+this.fname);
	}
}

public class BookDetails{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, i, type;
		int pid, bid, lid, fid;
		String pname, bname, lname, fname;
		System.out.println("Enter the limit : ");
		n = sc.nextInt();
		Literature[] lit = new Literature[n];
		Fiction[] fit = new Fiction[n];
		for(i=0; i<n; i++){
			System.out.println("Enter the Publisher ID : ");
			pid = sc.nextInt();
			System.out.println("Enter the Publisher Name : ");
			pname = sc.next();
			System.out.println("Enter the Book ID : ");
			bid = sc.nextInt();
			System.out.println("Enter the Book Name : ");
			bname = sc.next();
			System.out.println("BOOK TYPE? 1. Literature 2. Fiction : ");
			type = sc.nextInt();
			if(type == 1){
				System.out.println("Enter the Literature ID : ");
				lid = sc.nextInt();
				System.out.println("Enter the Literature Name : ");
				lname = sc.next();
				lit[i] = new Literature(pid, pname, bid, bname, lid, lname);
				
			}
			else{
				System.out.println("Enter the Fiction ID : ");
				fid = sc.nextInt();
				System.out.println("Enter the Fiction Name : ");
				fname = sc.next();
				fit[i] = new Fiction(pid, pname, bid, bname, fid, fname);
			}
		}
		if(lit.length > 0){
			for(i=0; i<lit.length; i++){
				lit[i].display();
			}
		}
		if(fit.length > 0){
			for(i=0; i<fit.length; i++){
				fit[i].display();
			}
		}
	}
}
