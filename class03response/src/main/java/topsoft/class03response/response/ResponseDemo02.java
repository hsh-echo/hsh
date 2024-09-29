package topsoft.class03response.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 86198
 * @description: 转发和重定向
 * @date 2024/9/28 14:28
 */
@WebServlet("/responseDemo02")
public class ResponseDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //转发
        req.getRequestDispatcher("/responseDemo01?username=zhangsan").forward(req,resp);
        //重定向
        //resp.sendRedirect("/responseDemo01?username=zhangsan");
        //其他
        // resp.sendRedirect("http://www.baidu.com");
    }
}