package com.example.bootdemo2023.Strategy.context;

import com.example.bootdemo2023.Strategy.SaleTypeParseStrategy;
import com.example.bootdemo2023.enums.SaleTypeRelEnum;

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
