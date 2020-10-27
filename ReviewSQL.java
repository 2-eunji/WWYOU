package Travel;

import java.util.Scanner;

import java.sql.*;

public class ReviewSQL {
	
	Scanner sc = new Scanner(System.in);
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Connection con = null;
	
	public void showReview() {
		String sql="SELECT * FROM REVIEW WHERE=?";
		
	}
}
