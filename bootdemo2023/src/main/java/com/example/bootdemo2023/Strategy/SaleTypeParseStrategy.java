package com.example.bootdemo2023.Strategy;

import com.example.bootdemo2023.Strategy.context.SaleTypeParseContext;

/**
  * 定义策略接口
  */
public interface SaleTypeParseStrategy {
    Integer parse(SaleTypeParseContext saleTypeParseContext);
}

