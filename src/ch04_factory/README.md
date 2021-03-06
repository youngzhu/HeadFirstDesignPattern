# Factory Method Pattern

工厂方法模式，定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。

工厂方法让类把实例化推迟到子类。

通过让子类决定该创建的对象是什么，来达到将创建对象的过程封装的目的。

## 工厂方法与简单工厂的比较
简单工厂不具备工厂方法的弹性。
假如新增一类产品（加州的披萨），简单工厂需要修改工厂类；而简单工厂不需要，新增一个具体的工厂子类即可。

**开-闭原则**

## Dependency Inversion Principle
依赖倒置原则，要依赖抽象，不要依赖具体类。

## 工厂方法与抽象工厂的比较
工厂方法使用的是继承，例如 PizzaStore.java；
抽象工厂使用的组合，例如 CheesePizza 里使用了 原料工厂 PizzaIngredientFactory。

其实两者没有严格的界线，抽象工厂实现时也会用到工厂方法，例如具体的原料工厂 NYPizzaIngredientFactory 就使用了工厂方法。