public abstract class Creator {
    public abstract Product factoryMethod();
    public void someOperation() {
        Product product = factoryMethod();
        // ... use the product
    }
}

//public abstract class Creator {
//    public abstract Product factoryMethod();
//    public void someOperation() {
//        Product product = factoryMethod();
//        // ... use the product
//    }
//}
//public class ConcreteCreatorA extends Creator {
//    @Override
//    public Product factoryMethod() {
//        return new ConcreteProductA();
//    }
//}
//public class ConcreteCreatorB extends Creator {
//    @Override
//    public Product factoryMethod() {
//        return new ConcreteProductB();
//    }
//}
//public interface Product {}
//public class ConcreteProductA implements Product {}
//public class ConcreteProductB implements Product {}
