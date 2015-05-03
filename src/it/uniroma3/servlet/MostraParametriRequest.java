package it.uniroma3.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by gabrielecugliari on 16/04/15.it
 */
@WebServlet("/processa")
public class MostraParametriRequest extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String nomeProdotto = request.getParameter("NomeProdotto").toUpperCase();
        String prezzoProdotto = request.getParameter("PrezzoProdotto");
        String descrizione = request.getParameter("DescrizioneProdotto");
        String urlNextPage = "/conferma";
        HttpSession session = request.getSession();
        session.setAttribute("NOMEPRODOTTO", nomeProdotto);
        session.setAttribute("PREZZO", prezzoProdotto);
        session.setAttribute("DESCRIZIONE", descrizione);

        ServletContext application = getServletContext();
        RequestDispatcher rd = application.getRequestDispatcher("/conferma");
        rd.forward(request, response);
        return;

    }
}
