package cn.th.jump.demoboot.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Product {

    private int id;
    private String name;
    private int count;
    private double price;

}
