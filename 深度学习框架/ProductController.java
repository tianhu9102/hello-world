package cn.th.jump.demoboot.controller;

import cn.th.jump.demoboot.bean.Product;
import cn.th.jump.demoboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@EnableAutoConfiguration
//@ComponentScan(basePackages = {"cn.th.jump.demoboot.service"})
public class ProductController{

    @Autowired  // 或者使用 @Resource
    ProductService productService;

    @RequestMapping(value = "pro/log",method = RequestMethod.GET)
    public String queryByName(){
        return "/login";
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping(value = "pro",method = RequestMethod.GET)
    @ResponseBody
    public List<Product> queryAll(){
        return productService.queryAll();
    }

    @RequestMapping(value = "pro/restful",method = RequestMethod.GET)
    @ResponseBody
    public List<Product> queryByName(@RequestParam(value = "name") String name){
        List<Product> lst = productService.queryByName(name);
        return lst;
    }

    @RequestMapping(value = "pro/restful/id",method = RequestMethod.GET)
    @ResponseBody
    public Product queryById(@RequestParam(value = "id") int id){
        Product  product  = productService.queryById(id);
        return product;
    }

    /**
     * 添加
     * @param product
     * @return
     */
    @RequestMapping(value = "pro/restful",method = RequestMethod.POST)
    @ResponseBody
    public int add(Product product){
        return productService.addProduct(product);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value="pro/restful",method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(int id){
        return productService.deleteProduct(id);
    }

    /**
     * 更新
     * @param id
     * @param name
     * @param count
     * @param price
     * @return
     */
    @RequestMapping(value="pro/restful",method = RequestMethod.PUT)
    @ResponseBody
    public int update(@RequestParam("id")int id,
                      @RequestParam("name")String name,
                      @RequestParam("count")int count,
                      @RequestParam double price){
        Product  product  = productService.queryById(id);
        if(null==product){
            System.out.println("id not exists!");
        }
        Product product1 = new Product();
        product1.setName(name);
        product1.setId(id);
        product1.setCount(count);
        product1.setPrice(price);

        return  productService.updateProduct(product1);
    }

    @RequestMapping(value="pro/restful/updateName",method = RequestMethod.PUT)
    @ResponseBody
    public int updateName(@RequestParam("id")int id,@RequestParam("name")String name){
        Product  product  = productService.queryById(id);

        Product product1 = new Product();
        product1.setName(name);
        product1.setId(id);
        product1.setCount(product.getCount());
        product1.setPrice(product.getPrice());

        return  productService.updateProduct(product1);
    }
    @RequestMapping(value="pro/restful/updatePrice",method = RequestMethod.PUT)
    @ResponseBody
    public int updatePrice(@RequestParam("id")int id,@RequestParam("price")int price){
        Product  product  = productService.queryById(id);

        Product product1 = new Product();
        product1.setId(id);
        product1.setPrice(price);
        product1.setName(product.getName());
        product1.setCount(product.getCount());

        return  productService.updateProduct(product1);
    }
    @RequestMapping(value="pro/restful/updateCount",method = RequestMethod.PUT)
    @ResponseBody
    public int updateCount(@RequestParam("id")int id,@RequestParam("count")int count){
        Product  product  = productService.queryById(id);

        Product product1 = new Product();
        product1.setId(id);
        product1.setCount(count);
        product1.setPrice(product.getCount());
        product1.setName(product.getName());

        return  productService.updateProduct(product1);
    }

}
