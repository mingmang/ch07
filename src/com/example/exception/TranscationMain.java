package com.example.exception;

import java.text.ParseException;

class PackingException extends Exception{
    public PackingException(String message) {
        super(message);
    }
}

class ReceiptPrintingException extends Exception{
    public ReceiptPrintingException(String message) {
        super(message);
    }
}

class ProductShipping{
    public void shipProduct() throws PackingException, ReceiptPrintingException {
        performPacking();
        printReceipt();
        sendProduct();
    }
    private void performPacking() throws PackingException {
        System.out.println("상품을 포장합니다.");
        if(Math.random() < 0.5) {
            throw new PackingException("포장과정에서 문제 발생했습니다.");
        }
    }

    public void printReceipt() throws ReceiptPrintingException{
        System.out.println("영수증을 발행합니다.");
        if(Math.random()<0.5){
            throw new ReceiptPrintingException("영수증 발행과정에 문제 발생했습니다.");
        }
    }

    private void sendProduct() {
        System.out.println("상품을 발송합니다.");
    }
}

public class TranscationMain {
    public static void main(String[] args) {
        ProductShipping productShipping = new ProductShipping();
        try{
            productShipping.shipProduct();
        }catch (PackingException|ReceiptPrintingException e) {
            System.out.println("상품발송 중에 문제가 발생하여 발송을 취소합니다.");
            System.out.println("발생한문제:"+e.getMessage());
        }
    }
}
