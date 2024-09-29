package topsoft.class03response.response;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 86198
 * @description: TODO
 * @date 2024/9/28 13:58
 */
@WebServlet("/responseDemo01")
public class ResponseDemo01 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String username = request.getParameter("username");
        System.out.println("ResponseDemo01 被请求了");
        if(username.equals("zhangsan")) {
            response.setStatus(200);
        }else {
            response.setStatus(404);
        }
    }
}