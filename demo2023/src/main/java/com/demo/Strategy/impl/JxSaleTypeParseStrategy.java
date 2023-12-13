package com.demo.Strategy.impl;

import com.demo.Strategy.SaleTypeParseStrategy;
import com.demo.Strategy.context.SaleTypeParseContext;
import com.demo.enums.SaleTypeRelEnum;

/**
  * 策略实现
  */
public class JxSaleTypeParseStrategy implements SaleTypeParseStrategy{
  @Override
  public Integer parse(SaleTypeParseContext saleTypeParseContext) {
    return SaleTypeRelEnum.JX.getToCode();
  }
}
