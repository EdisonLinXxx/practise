package com.example.bootdemo2023.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.bootdemo2023.Strategy.SaleTypeParseStrategy;
import com.example.bootdemo2023.Strategy.context.SaleTypeParseContext;
import com.example.bootdemo2023.Strategy.impl.JxSaleTypeParseStrategy;
import com.example.bootdemo2023.enums.SaleTypeRelEnum;


@Component
public class SaleTypeParseStrategyContainer{
  public final static Map<SaleTypeRelEnum, SaleTypeParseStrategy> STRATEGY_MAP = new HashMap<>();

  @PostConstruct
  public void init(){
    STRATEGY_MAP.put(SaleTypeRelEnum.JX, new JxSaleTypeParseStrategy());
    // 继续拓展
    System.err.println(STRATEGY_MAP);
  }

  public Integer parse(SaleTypeParseContext saleTypeParseContext){
    return Optional.ofNullable(STRATEGY_MAP.get(saleTypeParseContext.getSaleTypeEnum())).map(strategy-> strategy.parse(saleTypeParseContext)).orElse(null);
  }
}
