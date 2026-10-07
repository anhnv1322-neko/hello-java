package com.test.aptech.until;

public class MainThread {
    public static void main(String[] args) {
        ConverterHelper fToC = new ConverterHelper();
        fToC.doiDoFSangDoC(70);
        ConverterHelper inchToMet = new ConverterHelper();
        inchToMet.doiInchSangMet(30);
    }
}
