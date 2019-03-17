package main.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @Description:
 * @Author: LYS
 * @Date: 2019/3/17 14:48
 */
public class SessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent e) {
        System.out.println("session 增加属性 ");
        System.out.println("属性是" + e.getName());
        System.out.println("值是" + e.getValue());

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent e) {
        System.out.println("session 移除属性 ");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent e) {
        System.out.println("session 替换属性 ");
    }
}
