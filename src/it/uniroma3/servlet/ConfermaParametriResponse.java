package it.uniroma3.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebFault;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by gabrielecugliari on 16/04/15.
 */
@WebServlet("/conferma")
public class ConfermaParametriResponse extends  HttpServlet{
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();

        response.setContentType("text/html");
        PrintWriter stampa = response.getWriter();
        stampa.println("<!DOCTYPE html>");
        stampa.println("<head>");
        stampa.println("<meta charset=\"ISO-8859-1\" />");
        stampa.println("<title>mostra parametri</title>");
        stampa.println("</head>");
        stampa.println("<body>");
        stampa.println("<h1>Dati inseriti nella form</h1>");
        stampa.println("<ul>");
        stampa.println("<li>Nome: <b>" + session.getAttribute("NOMEPRODOTTO") + "</b></li>");
        stampa.println("<li>Prezzo: <b>" + session.getAttribute("PREZZO") + "</b></li>");
        stampa.println("<li>Descrizione: <b>" + session.getAttribute("DESCRIZIONE") + "</b></li>");
        stampa.println("</ul>");
        stampa.println("<h2>Scegli: </h2>");
        stampa.println("u1");
        stampa.println("<li><a href=\""+response.encodeRedirectURL("MostraParametri.jsp")+"\">Conferma i dati inseriti</a></li>");
        stampa.println("<li><a href=\"index.jsp\">torna all'inserimento</a></li>");
        stampa.println("</ul>");
        stampa.println("</body>\n</html>");



    }
}