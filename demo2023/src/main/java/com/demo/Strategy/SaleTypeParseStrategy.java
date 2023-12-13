package com.demo.Strategy;

import com.demo.Strategy.context.SaleTypeParseContext;

/**
  * 定义策略接口
  */
public interface SaleTypeParseStrategy {
    Integer parse(SaleTypeParseContext saleTypeParseContext);
}
