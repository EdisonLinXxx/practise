package com.example.bootdemo2023.Strategy.impl;

import com.example.bootdemo2023.Strategy.SaleTypeParseStrategy;
import com.example.bootdemo2023.Strategy.context.SaleTypeParseContext;
import com.example.bootdemo2023.enums.SaleTypeRelEnum;

/**
  * 策略实现
  */
public class JxSaleTypeParseStrategy implements SaleTypeParseStrategy{
  @Override
  public Integer parse(SaleTypeParseContext saleTypeParseContext) {
    return SaleTypeRelEnum.JX.getToCode();
  }
}
