package com.test.aptech.shape;

public class Rectangle {

    public void HinhChuNhat(int chieuDai, int chieuRong) {
        if(chieuDai == chieuRong) {
            System.out.println("Day la hinh vuong");
        } else if (chieuDai < 0 || chieuRong < 0) {
            System.out.println("kich thuoc khong hop le");
        } else {
            System.out.println("chu vi hinh chu nhat la: " + (chieuDai + chieuRong) * 2);
            System.out.println("dien tich hinh chu nhat la: " + chieuDai * chieuRong);
        }
    }
}
