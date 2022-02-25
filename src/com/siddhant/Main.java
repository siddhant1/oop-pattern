package com.siddhant;
import com.siddhant.iterator.IteratorTest;
import com.siddhant.memento.MementoTest;
import com.siddhant.state.StateTest;

public class Main {
    public static void main(String args[]){
       User user = new User("Sidd");
       System.out.println(user.name);

       TaxCalculator2022 calc = (TaxCalculator2022) getCalculator();
       calc.calculateTax();
       calc.getNewSlab();
       System.out.println(calc.calculateTax());
       System.out.println(calc.getNewSlab());

       new MementoTest().main();
       new StateTest().main();
       new IteratorTest().main();

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2022();
    }
}
