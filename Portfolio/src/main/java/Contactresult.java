

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

import bean.ContactCheck;

/**
 * Servlet implementation class ContactCheck
 */
@WebServlet("/Contactresult")
public class Contactresult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contactresult() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portfoliodb","root","");
			
			Statement stmt=con.createStatement(); 
			
			List<ContactCheck> list = new ArrayList<ContactCheck>();
			
			ResultSet rs=stmt.executeQuery("select * from contact;");
			
			while (rs.next()) {
	              
	              String name = rs.getString("name");
	              String mailaddress = rs.getString("email");
	              String tel = rs.getString("tel");
	              String inquiry = rs.getString("inquiry");
	              int method = rs.getInt("method");
	              
	              list.add(new ContactCheck(name,mailaddress,tel,inquiry,method));
	            }
			
			request.setAttribute("Contacts",list );
			
			rs.close();
            stmt.close();
            con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String view = "/WEB-INF/view/ContactCheck.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
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
		  
		String name =request.getParameter("name");
		  
		String mail =request.getParameter("mail");
		  
		String tel =request.getParameter("tel");
		  
		String num =request.getParameter("method");
		
		System.out.println(num);
		
		int method =Integer.parseInt(num);
		
		String inquiry =request.getParameter("inquiry");
		
		
		  
		  try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portfoliodb","root","");
		
			String sql = "insert into contact(name,email,tel,inquiry,method)values(?,?,?,?,?)";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1,name);
			st.setString(2,mail);
			st.setString(3,tel);
			st.setString(4,inquiry);
			st.setInt(5, method);
			
			int result = st.executeUpdate();
			System.out.println(result);
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			
		}
	doGet(request, response);
	}
}
	


