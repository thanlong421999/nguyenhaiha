/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyenhaiha.mathutil.core;

/**
 *
 * @author thanl
 */
//class này sẽ chứa 1 loạt các hàm static dùng để làm thư viện
//cho các nơi khác/class khác xài!!!
public class MathUtility {

    public static final double PI = 3.14;

    //hàm tính n! = 1.2.3.nnn
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    //q uocs <0! và >20! ném ngoại lệ, ko tính đc
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long result = 10;
//        
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        
//        return result;
//    }
    
    // 5! - 1.2.3.4.5
    // 5! = 4! * 5
    // 4! = 3! * 4
    //...
    //N! = (n - 1)! * N ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //                  BÚP BÊ NGA
    public static long getFactorial(int n) {
    if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * getFactorial(n -1);
        
        
        //KĨ THUẬT KIỂM THỬ GỌI LÀ : REGRESSION TÉTING
        //                              KIỂM THỬ HỒI QUY - TEST LẠI NHỮNG THỨ
        //                              ĐÃ TỪNG TEST
        //Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa
        //sửa vì:
        //fix bug thì phải sửa code, sửa hàm
        //thêm hàm , thêm tính năng
        //tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
        //HÀM ĐANG NGON - MÀU XANH, NẾU TA SỬA HÀM VÌ LÍ DO GÌ ĐÓ
        //LIỆU HÀM CÒN XANH HAY KO , THÌ PHẢI TEST LẠI
        //NẾU TEST = TAY, BẰNG LOG, THÌ CỰC KỲ TỐN THỜI GIAN, MẤT SỨC
        //NẾU CODE CỦA TA CÓ SẴN TEST SCRIPT - CODE KIỂM THỬ
        //TA CHỈ VIỆC RUN LẠI CÁI TEST SCRIPT NÀY
        //NẾU HÀM SỬA NGON, NÓ PHẢI CÓ MÀU XANH. NGƯỢC LẠI MAFUY ĐỎ
        //NHỜ TEST SCRIPT TA VERIFY LẠI 1 HÀM RẤT NHANH -> KIỂM THỬ LẠI
        //THỬ ĐÃ TỪNG KIỂM THỬ ĐỂ ĐẢM BẢO NÓ  CÒN NGON HƠN SO VỚI TRƯỚC
        //KHI SỬA ĐC GỌI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESTING
        //NHỜ CI, HỒI QUY LIÊN TỤC
        
        //BÀI NÀY MÌNH THỬ HỒI QUY = CÁCH SỬA LẠI HÀM THEO THUẬT TOÁN
        //ĐẸ QUY - RECURSION
    
    }
}
