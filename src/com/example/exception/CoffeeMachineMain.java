package com.example.exception;

class CoffeeMachineException extends Exception {
    public CoffeeMachineException(String message) {
        super(message);
    }
}

class CoffeeMachine{
    private int coffeeStock = 10;
    public void orderCoffee(int quantity)throws CoffeeMachineException{
        if(quantity>coffeeStock){
            throw new CoffeeMachineException("재고 부족 합니다.");
        }
    }
}

public class CoffeeMachineMain extends Exception{
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        try{
            coffeeMachine.orderCoffee(11);
        }catch(CoffeeMachineException e){
            System.out.println("재고가 부족하니 다른 음료를 선택하세요.");
        }
    }
}
