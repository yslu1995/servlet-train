package main;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 默认页面
 * @Author: LYS
 * @Date: 2019/3/12 9:52
 */
public class IndexServlet extends HttpServlet {
    public void init(ServletConfig config) {
        System.out.println("Servlet 自启动成功！");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("index.html");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
