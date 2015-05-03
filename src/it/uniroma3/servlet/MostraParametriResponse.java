package it.uniroma3.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by gabrielecugliari on 16/04/15.
 */
@WebServlet("/mostra")
public class MostraParametriResponse extends HttpServlet{
    private static final long serialVersionUID=1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();

        response.setContentType("text/html");
        PrintWriter stampa = response.getWriter();
        stampa.println("<!DOCTYPE html>");
        stampa.println("<head>");
        stampa.println("<meta charset=\"ISO-8859-1\" />");
        stampa.println("<title>Dati Confermati</title>");
        stampa.println("</head>");
        stampa.println("<body>");
        stampa.println("<h1>Hai confermato i seguenti dati</h1>");
        stampa.println("<ul>");
        stampa.println("<li>Nome: <b>" + session.getAttribute("NOMEPRODOTTO") + "</b></li>");
        stampa.println("<li>Prezzo: <b>" + session.getAttribute("PREZZO") + "</b></li>");
        stampa.println("<li>Descrizione: <b>" + session.getAttribute("DESCRIZIONE") + "</b></li>");
        stampa.println("</ul>");
        stampa.println("</body>\n</html>");

    }

}
