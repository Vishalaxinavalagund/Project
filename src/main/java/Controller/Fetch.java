package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ProductDao;
import Dto.Product;

@WebServlet("/addtocart")
public class Fetch extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s1=req.getParameter("pname");
		String s2=req.getParameter("pcode");
		String s3=req.getParameter("price");
		String s4=req.getParameter("pdescription");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		 Product product=new Product();
	     product.setPname(s1);
	     product.setPcode(s2);
		 product.setPrice(s3);
		 product.setDescription(s4);
	 

		 ProductDao dao=new ProductDao();
		 dao.insert(product);
		 
		 RequestDispatcher r1=req.getRequestDispatcher("Adptnxt.html");
		 r1.include(req, resp);
		
	}

}
