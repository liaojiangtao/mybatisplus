package com.gentel.mybatisplus;

import com.gentel.mybatisplus.generate.MysqlGenerator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author Gentel
 * @description 代码生成器测试
 * @create 2019-10-21 14:14
 */

@Slf4j
public class Generate {

    @Test
    void tbOrderDetail(){
        MysqlGenerator mysqlGenerator = new MysqlGenerator();
        mysqlGenerator.generator("tb_order_detail");
    }
}