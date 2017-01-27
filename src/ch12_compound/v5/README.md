## v5

如果想要管理一群鸭子呢？

**组合模式**，可以像对待单个对象一样对待对象集合。

- - - -

## v4

正如v3中的代码，你可能会忘了装饰某些对象

```
Quackable mallardDuck = new QuackCounter(new MallardDuck());
Quackable redheadDuck = new RedheadDuck();
```

能不能集中起来创建”鸭子“对象呢？

**工厂模式**
- - - 

## v3

如果要统计这些“鸭子”叫过的次数呢？

**装饰者模式**，增加一些行为。

- - - 

## v2

还有鹅呢。
如何让鹅在鸭子的模拟器中叫呢？？

**适配器模式**