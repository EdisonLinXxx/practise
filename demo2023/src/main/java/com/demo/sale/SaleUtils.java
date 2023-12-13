package com.demo.sale;

import java.util.Optional;

import com.demo.enums.SaleTypeRelEnum;

public class SaleUtils {

    private static final String JX_SALE_TYPE_STR = "JX";
    private static final Integer JX_SALE_TYPE_INT = 1;

    //优化前
    public static Integer parseSaleType(String saleTypeStr){
        if(saleTypeStr == null || saleTypeStr.equals("")){
            return null;
        }
        if(saleTypeStr.equals("JX")){
            return 1;
        }
        return null;
    }

    //优化1
    public static Integer parseSaleType_New1(String saleTypeStr){

        if(JX_SALE_TYPE_STR.equals(saleTypeStr)){
            return JX_SALE_TYPE_INT;
        }
        return null;

    }

    //优化2
    public static Integer parseSaleType_New2(String saleTypeStr){
        return JX_SALE_TYPE_STR.equals(saleTypeStr) ? JX_SALE_TYPE_INT : null;
        // return Optional.ofNullable(saleTypeStr).filter(JX_SALE_TYPE_STR::equals).map(o -> JX_SALE_TYPE_INT).orElse(null);
    }

    //扩展需求1 入参有很多种 定义枚举
    public static Integer parseSaleType_Enums(String saleTypeStr){
        return SaleTypeRelEnum.parseCode(saleTypeStr);
    }

}
