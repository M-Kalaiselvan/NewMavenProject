package org.pratice;

public class scan {
	
	public void empInfo(int id) {
		System.out.println("emp id is "+id);
		
	}
	
	public void empInfo(String name) {
		System.out.println("emp name is "+name);

	}
 
	 public void empInfo(String email , long mobno) {
			System.out.println("emp mail id is "+email);
			System.out.println("emp mobNo is "+mobno);


		}
	 
	 public static void main(String[] args) {
		scan s = new scan();
		s.empInfo(22000214);
		s.empInfo("kalaiselvan");
		s.empInfo("kalaidel@gmail.com", 9884748357L);
	}
	 
}


