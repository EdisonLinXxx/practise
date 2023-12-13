package com.demo.Strategy.context;

import com.demo.Strategy.SaleTypeParseStrategy;
import com.demo.enums.SaleTypeRelEnum;

import lombok.Data;

/**
  * 调用上下文
  */
@Data
public class SaleTypeParseContext{
  private SaleTypeRelEnum saleTypeEnum;

  private SaleTypeParseStrategy parseStrategy;
  
  public Integer parse(){
    return parseStrategy.parse(this);
  }
}
