/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nguyenhaiha.mathutil.core.test;

import com.nguyenhaiha.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thanl
 */
public class MathUtilityTest {

    //Test Case#1 - Verify getFactorial(with n =0)
    //Steps/Procedures
    //  1.Given n = 0
    //  2.Call/ivoke getFactorial(with n = 0)
    //Exxpected Result:
    //      The method must return 1 as the result of 0! = 1
    //Status: Passed | Failed chờ đến lúc runtime mới biết
    @Test
    public void verifyFactorialGivenRIghtArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    public void verifyFactorialGivenRIghtArgument1ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test
    public void verifyFactorialGivenRIghtArgument5ReturnOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //3 testing trên ko đẹp, bốc mùi, bad smells vì chỉ khác nhau phần data
    //TR0NG NGHỀ KIỂM THỬ CÓ 1 KỸ THUẬT ĐÓ LÀ TÁCH HẲN DATA KIỂM THỬ RA
    //1 CHỖ, CHO DỄ NHÌN, DỄ QUẢN LÍ ĐC DATA THIẾU ĐỬ HAY KO
   //SAU ĐÓ TA ĐƯA BỘ DÂT NÀY VÀO TRONG CÂU LỆNH SO SÁNH ASSERT()
    //QUA CÁC THAM SỐ (PARAMETER)
    //TỨC LÀ ASSERTEQUALS (EXPECTED , ACTUAL) LÀ 2 THAM SỐ
    //ỨNG VỚI BỘ DATA TÁCH RA
    //      120     5!
    //      720     6!
   //       24      4!
    //              ...
    
    //CODE NHÌN GỌN HƠN, PHÁT HIỆN ĐC ĐỬ TEST DATA, TEST CASE
    //KĨ THUẬT TÁCH DATA KIỂM THỬ RA KHỎI CÂU LỆNH SO SÁNH -> ĐC GỌI LÀ 
    //DDT - DÂT DRIVEN TESTING - KIỂM THỬ THEO HƯỚNG TÁCH DATA RIÊNG LẺ
    
}
