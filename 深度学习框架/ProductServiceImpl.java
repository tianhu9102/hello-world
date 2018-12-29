package cn.th.jump.demoboot.service;

import cn.th.jump.demoboot.bean.Product;
import cn.th.jump.demoboot.dao.ProductMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
//@MapperScan("cn.th.jump.demoboot.dao")
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductMapper mapper;

    @Override
    public List<Product> queryByName(@RequestParam("name") String name) {
         return mapper.queryByName(name);
    }

    @Override
    public Product queryById(int id){return mapper.queryById(id);}

    @Override
    public List<Product> queryAll(){return mapper.queryAll();}

    @Override
    public int addProduct(Product product){
        int add = mapper.addProduct(product);
        return  add;
    }

    @Override
    public int updateProduct(Product product){
        int update =  mapper.updateProduct(product);
        return  update;
    }

    @Override
    public int deleteProduct(int id){
        int dele =  mapper.deleteProduct(id);
        return  dele;
    }


}
