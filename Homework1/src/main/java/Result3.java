

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;

/**
 * Servlet implementation class Result3
 */
@WebServlet("/Result3")
public class Result3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	    
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","");
			
			Statement stmt=con.createStatement(); 
			
			List<User> list = new ArrayList<User>();
			
			ResultSet rs=stmt.executeQuery("select * from user;");
			
			while (rs.next()) {
	              int userid = rs.getInt("userid");
	              String name = rs.getString("name");
	              String mailaddress = rs.getString("mailaddress");
	              String tel = rs.getString("tel");
	              
	              list.add(new User(userid,name,mailaddress,tel));
	            }
			
			request.setAttribute("Users",list );
			
			rs.close();
            stmt.close();
            con.close();
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		String view = "/WEB-INF/view/result3.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
		
		String msg="";
	    try {
		      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		      msg = "ドライバのロードに成功しました";
		    }catch (ClassNotFoundException e){
		    	System.out.println(e.getMessage());
		      msg = "ドライバのロードに失敗しました1";
		    }catch (Exception e){
		      msg = "ドライバのロードに失敗しました2";
		    }
		System.out.println(msg);
		
		String num =request.getParameter("user_id");
		  
		String name =request.getParameter("name");
		  
		String mail =request.getParameter("mail");
		  
		String tel =request.getParameter("tel");
		  
		int userid = Integer.parseInt(num);
		  
		  try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","");
		
			String sql = "insert into user(userid,name,mailaddress,tel)values(?,?,?,?)";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1,userid);
			st.setString(2,name);
			st.setString(3,mail);
			st.setString(4,tel);
			
			int result = st.executeUpdate();
			System.out.println(result);
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			
			
		}
	doGet(request, response);
	}

}
