
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result1to1
 */
@WebServlet("/Result1")
public class Result1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
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
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb","root","");
			
			Statement stmt=con.createStatement(); 
			
			ResultSet rs=stmt.executeQuery("select * from item;");
			
			while (rs.next()) {
	              System.out.println(rs.getInt("itemid"));
	              System.out.println(rs.getString("item_name"));
	            }
			
			rs.close();
            stmt.close();
            con.close();
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		String view = "/WEB-INF/view/result1.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
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
		
		
		
		  request.setCharacterEncoding("utf-8");
		  
		  //String num = request.getParameter("score");
		  
		  //int score = Integer.parseInt(num);
		  
		  //request.setAttribute("score",score );
		  
		  String itemname =request.getParameter("item_name");
		  
		  String num2 =request.getParameter("itemid");
		  
		  String num =request.getParameter("price");
		  
		  int price = Integer.parseInt(num);
		  
		  int itemid = Integer.parseInt(num2);
		  
		  try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb","root","");
		
			String sql = "insert into item(itemid,item_name,price)values(?,?,?)";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1,itemid);
			st.setString(2,itemname);
			st.setInt(3,price);
			
			int result = st.executeUpdate();
			System.out.println(result);
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		  
		 // doGet(request, response);
		  
	
	}

}
