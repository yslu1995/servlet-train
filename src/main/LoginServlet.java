package main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 登录servlet
 * @Author: LYS
 * @Date: 2019/3/9 10:41
 */
public class LoginServlet extends HttpServlet {
    /**
     * 证明servlet被实例化后是单例的
     */
    public LoginServlet() {
        System.out.println("LoginServlet 构造方法 被调用");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        String html = null;

        if ("admin".equals(name) && "123".equals(password)) {
            //服务器内部跳转
            request.getSession().setAttribute("userName", name);
            response.sendRedirect("testSession");
//            request.getRequestDispatcher("success.html").forward(request, response);
        } else {
            //让浏览器(客户端)重新发起请求 ----重定向
            response.sendRedirect("fail.html");
        }
//        PrintWriter pw = response.getWriter();
//        pw.println(html);
    }
}
