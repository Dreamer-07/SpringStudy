package pers.dreamer07.spring5.code;

/**
 * 通过 xml 的方式注入属性
 * @author shkstart
 * @create 2020-08-22 17:22
 */
public class Book {
    //1. 创建属性
    private String name;
    private String author;
    private Double price;

    public Book() {
    }

    //2.1 创建对应属性的set方法，通过 set 方法完成注入属性

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //2.2 使用有参构造函数，在创建对象时调用完成注入属性
    public Book(String name, String author,Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String price){

    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
