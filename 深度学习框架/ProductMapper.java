package cn.th.jump.demoboot.dao;

import cn.th.jump.demoboot.bean.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  //可以注释掉，在主程序已经添加MappserScan
@Repository
public interface ProductMapper {

    @Select("select * from product where name = #{name}")
    @ResultType(Product.class)
    List<Product> queryByName(@Param("name") String name);

    @Select("select * from product order by count")
    @ResultType(Product.class)
    List<Product> queryAll();

    @Insert("insert into product(name, count, price) values (#{name},#{count},#{price})")
    int addProduct(Product product);

    @Update("update product set name=#{name},price=#{price},count=#{count} where id=#{id}")
    int updateProduct(Product product);

    @Delete("delete from product where id=#{id}")
    int deleteProduct(int id);

    @Select("select * from product where id = #{id}")
    @ResultType(Product.class)
    Product queryById(int id);

}


