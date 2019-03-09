package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/9 8:34
 */
public class HelloServlet extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(HelloServlet.class);

    public void init(ServletConfig config) {
        System.out.println("Servlet 自启动成功！");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("pragma", "no-cache");
            response.getWriter().println("<h1>Hello Servlet!</h1>");
            response.getWriter().println(new Date().toLocaleString());

//            response.getWriter().println("<h1>Hello Servlet!</h1>");
//            response.getWriter().println(new Date());
//            response.getWriter().println("<h1>Welcome !</h1>");
//            System.out.println("dwdwwdawd");
//            System.out.println("new");
//            System.out.println("change");
            logger.info("success！");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
