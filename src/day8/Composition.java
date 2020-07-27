package day8;

public class Composition {
    public static void main(String[] args) {
        Sandwich mySandwich = new HoneySandwich();
        mySandwich.prepare();
    }
}

abstract class Sandwich {
    public void prepare() {
        toastBread();
        putToppingsOnBread();
        putSauce();
        putBreadInOven();
    }

    public void toastBread() {
        System.out.println("toasting bread");
    }

    public void putBreadInOven() {
        System.out.println("oven");
    }

    abstract void putToppingsOnBread();
    abstract void putSauce();
}

class HoneySandwich extends Sandwich {

    @Override
    void putToppingsOnBread() {
        System.out.println("onions");
    }

    @Override
    void putSauce() {
        System.out.println("mustard");
    }
}

class CheeseSandwich extends Sandwich {

    @Override
    void putToppingsOnBread() {

    }

    @Override
    void putSauce() {

    }
}
