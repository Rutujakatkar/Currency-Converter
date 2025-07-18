package CurrencyConverter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Converter", urlPatterns = {"/Converter"})
public class Converter extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Converter</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Currency Converter</h1>");
            String bc=request.getParameter("bcurr");
            String tc=request.getParameter("tcurr");
            int amount = Integer.parseInt(request.getParameter("amt"));
            
            out.println("base currency : "+bc+"<br>");
            out.println("target currency : "+tc+"<br>");
            out.println("amount entered : "+amount+"<br>");
          
            if("Rupee".equals(bc))
            {
                if("Dollar".equals(tc)){out.println("<h3>" + amount+ " Ruppe = " + (amount*0.012) +"$"+" Dollar </h3>");}
                if("Pound".equals(tc)) {out.println("<h3>" + amount+ " Ruppe = " + (amount*0.087) +"£"+" Pound </h3>");}
                if("Euro".equals(tc))  {out.println("<h3>" + amount+ " Ruppe = " + (amount*0.010) +"€"+" Euro </h3>");}
                if("Yen".equals(tc))   {out.println("<h3>" + amount+ " Ruppe = " + (amount*1.67) +"¥"+" Yen </h3>");}
                
            }
            
            if("Dollar".equals(bc))
            {
                if("Rupee".equals(tc)){out.println("<h3>"+amount+" Dollar = "+ (amount*85.98) +"₹"+ " Rupee </h3");}
                if("Pound".equals(tc)){out.println("<h3>"+amount+" Dollar = "+ (amount*0.74) +"£"+ " Pound </h3");}
                if("Euro".equals(tc)) {out.println("<h3>"+amount+" Dollar = "+ (amount*0.89) +"€"+ " Euro </h3");}
                if("Yen".equals(tc))  {out.println("<h3>"+amount+" Dollar = "+ (amount*143.86) +"¥"+ " Yen </h3");}
            }
            
            if("Pound".equals(bc))
            {
                if("Rupee".equals(tc)){out.println("<h3>"+amount+" Pound = "+ (amount*115.45) +"₹"+ " Rupee </h3");}
                if("Dollar".equals(tc)){out.println("<h3>"+amount+" Pound = "+ (amount*1.34) +"$"+ " Dollar </h3");}
                if("Euro".equals(tc)){out.println("<h3>"+amount+" Pound = "+ (amount*1.19) +"€"+ " Euro </h3");}
                if("Yen".equals(tc)){out.println("<h3>"+amount+" Pound = "+ (amount*193.13) +"¥"+ " Yen </h3");}
            }
            
            if("Euro".equals(bc))
            {
                if("Rupee".equals(tc)){out.println("<h3>"+amount+" Euro = "+ (amount*97.07) +"₹"+ " Rupee </h3");}
                if("Dollar".equals(tc)){out.println("<h3>"+amount+" Euro = "+ (amount*1.13) +"$"+ " Dollar </h3");}
                if("Pound".equals(tc)){out.println("<h3>"+amount+" Euro = "+ (amount*0.84) +"£"+ " Pound </h3");}
                if("Yen".equals(tc)){out.println("<h3>"+amount+" Euro = "+ (amount*162.29) +"¥"+ " Yen </h3");}
            }
            
            if("Yen".equals(bc))
            {
                if("Rupee".equals(tc)){out.println("<h3>"+amount+" Yen = "+ (amount*0.60) +"₹"+ " Rupee </h3");}
                if("Dollar".equals(tc)){out.println("<h3>"+amount+" Yen = "+ (amount*0.0069) +"$"+ " Dollar </h3");}
                if("Pound".equals(tc)){out.println("<h3>"+amount+" Yen = "+ (amount*0.0052) +"£"+ " Pound </h3");}
                if("Euro".equals(tc)){out.println("<h3>"+amount+" Yen = "+ (amount*0.0062) +"€"+ " Euro </h3");}
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
