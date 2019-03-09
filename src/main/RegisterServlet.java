package main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 注册
 * @Author: LYS
 * @Date: 2019/3/9 14:12
 */
public class RegisterServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("获取单值参数name:" + request.getParameter("name"));

        String[] hobits = request.getParameterValues("hobits");
        System.out.println("获取具有多值的参数hobits: " + Arrays.asList(hobits));

        System.out.println("通过 getParameterMap 遍历所有的参数： ");
        Map<String, String[]> parameters = request.getParameterMap();

        Set<String> paramNames = parameters.keySet();
        for (String param : paramNames) {
            String[] value = parameters.get(param);
            System.out.println(param + ":" + Arrays.asList(value));
        }

    }
}
