package main.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @Description: web 参数监听
 * @Author: LYS
 * @Date: 2019/3/17 14:25
 */
public class ContextAttributeListener implements ServletContextAttributeListener{
    /**
     * 监听属性的增加
     * @param attribute
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent attribute) {
        System.out.println("增加属性 ");
        System.out.println("属性是" + attribute.getName());
        System.out.println("值是" + attribute.getValue());
    }

    /**
     * 监听属性的移除
     * @param attribute
     */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent attribute) {
        System.out.println("移除属性 ");
        System.out.println("属性是" + attribute.getName());
        System.out.println("值是" + attribute.getValue());
    }

    /**
     * 监听属性的替换
     * @param attribute
     */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent attribute) {
        System.out.println("替换属性");
        System.out.println("属性是" + attribute.getName());
        System.out.println("值是" + attribute.getValue());
    }
}
