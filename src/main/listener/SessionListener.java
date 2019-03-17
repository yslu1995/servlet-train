package main.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Description: session监听
 * @Author: LYS
 * @Date: 2019/3/17 14:43
 */
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent e) {
        System.out.println("监听到 session 创建, sessionid 是： " + e.getSession().getId());

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent e) {
        System.out.println("监听到 session 销毁, sessionid 是： " + e.getSession().getId());
    }
}
