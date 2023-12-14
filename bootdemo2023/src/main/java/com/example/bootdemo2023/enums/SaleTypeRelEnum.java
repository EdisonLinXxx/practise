package com.example.bootdemo2023.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SaleTypeRelEnum {
  // 直接定义变量映射关系
  JX("JX", 1),
  JXX("JXX", 2),
  // OTHERS
  ;
  private String fromCode;
  private Integer toCode;


  /**
   * 预热转换关系到内存
   */
  private static Map<String, SaleTypeRelEnum> FROM_CODE_MAP = Arrays.stream(SaleTypeRelEnum.values()).collect(Collectors.toMap(SaleTypeRelEnum::getFromCode, Function.identity()));

  public static SaleTypeRelEnum get(String saleTypeStr){
    return FROM_CODE_MAP.get(saleTypeStr);
  }

  public static Integer parseCode(String saleTypeStr){
    return Optional.ofNullable(SaleTypeRelEnum.get(saleTypeStr)).map(SaleTypeRelEnum::getToCode).orElse(null);
  }
}
