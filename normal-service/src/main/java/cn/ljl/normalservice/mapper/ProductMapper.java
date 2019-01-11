package cn.ljl.normalservice.mapper;

import cn.ljl.normalservice.model.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper extends BaseMapper<Product>{

    Product selectByPrimaryKey();
}
