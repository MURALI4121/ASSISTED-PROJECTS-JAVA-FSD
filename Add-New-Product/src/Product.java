

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String price = request.getParameter("price");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Adding Product Successful</h2><br/>");
		out.println("Added "+color+" "+name+" to the database.");
		
		float price_cost = 0;
		int id_int = 0;
		try {
			price_cost = (float) Double.parseDouble(price);
			id_int = Integer.parseInt(id);
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets","root","Rocky@4121");
			
			Statement st = con.createStatement();
			st.executeUpdate("use pets");
			
			int res = st.executeUpdate("insert into pets.products(id,name,color,price)values('"+id_int+"','"+name+"','"+color+"','"+price_cost+"')");
			ResultSet rs = st.executeQuery("select * from pets.products");
			
			
            st.close();
			con.close();
			
		}
		catch(NumberFormatException e) {
			price_cost = (float) 0.00;
		}
		catch(ClassNotFoundException e) {
			out.println(e);
		} catch (SQLException e) {
			out.println(e);
		}
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
