package com.company.analytics.main;

import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

public class CompanyReport {
    public static void main(String[] args) {
        SalesReport sales = new SalesReport();
        EmployeeReport emp = new EmployeeReport();

        System.out.println("=== Company Analytics Report ===");
        sales.printSalesData();
        emp.printEmployeeData();
    }
}
