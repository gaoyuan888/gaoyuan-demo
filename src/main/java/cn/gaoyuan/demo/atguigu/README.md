子类父类初始化

类初始化过程
  主方法所在的类
  子类初始化时会导致父类初始化
  
  
【先发生类的初始化】
1.父类的静态变量和静态代码块（谁在前先初始化谁）
2.子类的静态变量和静态代码块（谁在前先初始化谁）
【子类实例初始化】注意super()方法一定会执行
3.父类的成员变量和代码块（谁在前先初始化谁）
4.父类的构造方法
5.子类的成员变量和代码块（谁在前先初始化谁）
6.子类的构造方法


注意子类重写父类方法
父类方法非private 子类重写也必须是非

那些方法不能被重写
private
静态方法
final