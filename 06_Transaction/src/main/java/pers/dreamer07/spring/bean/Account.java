package pers.dreamer07.spring.bean;

import java.math.BigDecimal;

/**
 * 数据库事务操作 - ORM类
 * @author shkstart
 * @create 2020-08-27 19:25
 */
public class Account {
    private Integer id;
    private String name;
    private BigDecimal price;

    public Account() {
    }

    public Account(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
