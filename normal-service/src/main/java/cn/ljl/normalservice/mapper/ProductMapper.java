package cn.ljl.normalservice.mapper;

import cn.ljl.normalservice.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {

    Product selectByPrimaryKey();
}
