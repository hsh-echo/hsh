package topsoft.class03response.servletContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 86198
 * @description: TODO
 * @date 2024/9/28 16:36
 */
@WebServlet("/servletContextDemo01")
public class ServletContextDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过request
        ServletContext servletContext01 = req.getServletContext();
        //
        ServletContext servletContext02 = this.getServletContext();
        System.out.println(servletContext01.equals(servletContext02));
    }
}