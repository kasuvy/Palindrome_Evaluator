package cloudcomputing1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pallindrome extends HttpServlet{
	 public Pallindrome() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      String mystring, mystring1, revstring;
              boolean Palindrome;
		      // Set response content type
		      response.setContentType("text/html");
		      PrintWriter out = response.getWriter();
		    //get the value from text box and convert into float
		        mystring = request.getParameter("value");
		        //remove the spaces from string
		        mystring = mystring.replace(" ", "");
		        //change all characteres to lowercase
		        mystring1 = mystring.toLowerCase();
		        //reverse the string
		        revstring = new StringBuilder(mystring1).reverse().toString();
		        
		        //check if both the entered string and the reverse string are same
		        Palindrome = new String(mystring1).equals(revstring);
		        
		        //if yes then palindrom, if no then it is not
		        if(Palindrome){
		           out.println("It is Palindrome");
		       } 
		        else{
		           out.println("It is not a Palindrome"); 
		   }
}
}
