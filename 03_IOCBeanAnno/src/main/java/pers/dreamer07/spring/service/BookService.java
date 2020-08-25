package pers.dreamer07.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pers.dreamer07.spring.dao.BookDAO;

/**
 * 使用注解完成属性注入 - @AutoWired和@Qualifier的使用
 * @author shkstart
 * @create 2020-08-25 10:22
 */
@Service
public class BookService {
    @Autowired //根据类型自动注入,不需要写set方法
    /*
    * 根据属性名称进行注入，该注解依赖于@AutoWired
    * 需要指定 value 属性为要注入的 bean 实例
    * */
    @Qualifier(value = "bookDAOImpl")
    private BookDAO bookDAO;

    @Value(value = "123")
    private int num;

    public void add(){
        System.out.println("bookService add..." + num);
        bookDAO.update();
    }
}
