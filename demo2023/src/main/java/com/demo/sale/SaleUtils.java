package com.demo.sale;

public class SaleUtils {

    public static Integer parseSaleType(String saleTypeStr){
        if(saleTypeStr == null || saleTypeStr.equals("")){
          return null;
        }
        if(saleTypeStr.equals("JX")){
          return 1;
        }
        return null;
      }

}
