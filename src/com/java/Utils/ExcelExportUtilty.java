package com.java.Utils;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExcelExportUtilty {

    public static String exportToExcel(Map<String,Object> columnNameAndData){

        String filepathLocation="";
        XSSFWorkbook workbook=null;
        List<Object> columnName=columnNameAndData.keySet().stream().collect(Collectors.toList());
        System.out.println("Print column name" +columnName);

        return null;

    }
}
