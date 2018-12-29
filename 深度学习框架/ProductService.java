package cn.th.jump.demoboot.service;

import cn.th.jump.demoboot.bean.Product;

import java.util.List;

public interface ProductService {

    List<Product> queryByName(String name);
    Product queryById(int id);

    List<Product> queryAll();

    int addProduct(Product product);
    int updateProduct(Product product);
    int deleteProduct(int id);


}
