package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/17 10:48
 */
public class TestSessionServlet extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(TestSessionServlet.class);

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName) {
            response.sendRedirect("login.html");
            return;
        }else{
            response.sendRedirect("success.html");
            return;
        }
    }
}
