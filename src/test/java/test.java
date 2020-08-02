import com.doublestrong.DesignPattern.abstractFactory.HuaweiFactory;
import com.doublestrong.DesignPattern.abstractFactory.IPhoneProduct;
import com.doublestrong.DesignPattern.abstractFactory.IRouterProduct;
import com.doublestrong.DesignPattern.abstractFactory.MiFactory;
import com.doublestrong.DesignPattern.builderPattern.FatHuman;
import com.doublestrong.DesignPattern.builderPattern.Human;
import com.doublestrong.DesignPattern.builderPattern.HumanDirector;
import com.doublestrong.DesignPattern.builderPattern.SmartManBuilder;
import com.doublestrong.DesignPattern.decoratorPattern.AbstractComponent;
import com.doublestrong.DesignPattern.decoratorPattern.ConcreteComponent;
import com.doublestrong.DesignPattern.decoratorPattern.Egg;
import com.doublestrong.DesignPattern.decoratorPattern.sausage;
import com.doublestrong.DesignPattern.facadePattern.Facade;
import com.doublestrong.DesignPattern.factoryMethod.factory.IFactory;
import com.doublestrong.DesignPattern.factoryMethod.factory.AddFactory;
import com.doublestrong.DesignPattern.observerPattern.Demo1.Observer;
import com.doublestrong.DesignPattern.observerPattern.Demo1.UserOne;
import com.doublestrong.DesignPattern.observerPattern.Demo1.WechatServer;
import com.doublestrong.DesignPattern.proxyPattern.DramticProxy.abstractSub;
import com.doublestrong.DesignPattern.proxyPattern.DramticProxy.customizeHandler;
import com.doublestrong.DesignPattern.proxyPattern.DramticProxy.realSub;
import com.doublestrong.DesignPattern.proxyPattern.StaticProxy.proxySubject;
import com.doublestrong.DesignPattern.proxyPattern.StaticProxy.realSubject;
import com.doublestrong.DesignPattern.simpleFactory.Operation;
import com.doublestrong.DesignPattern.simpleFactory.SimpleFactory;
import com.doublestrong.DesignPattern.singleton.demo1.SingletonDemo1;
import com.doublestrong.DesignPattern.strategyPattern.StrategyContext;
import com.doublestrong.DesignPattern.templateMethodPattern.AbstractClass;
import com.doublestrong.DesignPattern.templateMethodPattern.ConcreteClassA;
import com.doublestrong.DesignPattern.templateMethodPattern.ConcreteClassB;
import org.junit.Test;

/**
 * @author Double strong
 * @date 2020/2/10 22:02
 */

public class test {
//    测试简单工厂模式
        @Test
        public void test1() throws Exception {
            double num1=11;
            double num2=10.0;
            String operation="*";
            Operation oper = SimpleFactory.createOperation(operation);
            double result = oper.getResult(num1, num2);
            System.out.println("结果为"+result);
        }
//将策略模式与简单工厂模式相结合
         @Test
         public void test2() throws Exception {
            double originPrice=300.0;
             System.out.println("打折前价格为"+originPrice);
            String strategy="8折";
             StrategyContext strategyContext= new StrategyContext(strategy);
             double result = strategyContext.getResult(originPrice);
             System.out.println("打完折后价格为"+result);
         }
//装饰者模式
         @Test
        public void test3() throws Exception{
//            客户可以按照自己的想法动态的给对象添加职责
             AbstractComponent concreteComponent = new ConcreteComponent();
             System.out.println(concreteComponent.getMsg()+"价格"+concreteComponent.getPrice());
//            添加职责
             System.out.println("加鸡蛋");
             concreteComponent=new Egg(concreteComponent);
             System.out.println(concreteComponent.getMsg()+"价格"+concreteComponent.getPrice());
             System.out.println("加香肠");
             concreteComponent=new sausage(concreteComponent);
             System.out.println(concreteComponent.getMsg()+"价格"+concreteComponent.getPrice());
         }
// 静态代理模式
    @Test
    public void test4() throws Exception{
        proxySubject proxySubject=new proxySubject(new realSubject());
        proxySubject.doSomething();

    }
    // 动态代理模式
    @Test
    public void test5() throws Exception{
        realSub realSub=new realSub();
        customizeHandler handler=new customizeHandler(realSub);
//        在这里将代理对象转成抽象对象，通过代理对象实现调用真实对象的额方法并增强
        abstractSub proxyInstance = (abstractSub)handler.getProxyInstance();
       proxyInstance.doSomething();
    }

//    模板方法模式
    @Test
    public void test6() throws Exception{
        AbstractClass c;
        c=new ConcreteClassA();
        c.TemplateMethod();

        c=new ConcreteClassB();
        c.TemplateMethod();
    }

//    工厂方法模式，完成了对简单工厂模式修改是封闭的，扩展是开放的原则，把选择逻辑交给了客户端处理
//    每一个运算类对应一个具体工厂类，而不是简单工厂模式中全部交由一个工厂类创建所有的运算类，如果要添加运算方法则需要修改工厂类，需要修改工厂类，违背了开放封闭的原则
    @Test
    public void test7() throws  Exception{
            String oper="+";
            double num1=1;
            double num2=2;
            switch (oper)
            {
                case "+":
//                    创建加法工厂
                    IFactory iFactory=new AddFactory();
//                    由加法工厂创建加法运算类
                   com.doublestrong.DesignPattern.factoryMethod.operation.Operation operation = iFactory.createOperation();
                    operation.numA=num1;
                    operation.numB=num2;
                    double result = operation.getResult();
                    System.out.println(result);
                    break;


            }
    }

//    外观模式
    @Test
    public void test8(){
        Facade facade=new Facade();
        facade.methodA();
        facade.methodB();
    }

//建造者模式
    @Test
    public void test9(){
//            画出高智商的人
        HumanDirector humanDirector=new HumanDirector(new SmartManBuilder());
        Human human = humanDirector.createHuman();
        System.out.println(human);
//        画出肥胖的人
        HumanDirector humanDirector1 =new HumanDirector(new FatHuman());
        Human human1 = humanDirector1.createHuman();
        System.out.println(human1);

    }

//观察者模式，
    @Test
    public void test10(){
//            创建一个微信公众号服务
        WechatServer server = new WechatServer();

//        创建三个订阅者
        Observer userZhang = new UserOne("ZhangSan");
        Observer userLi = new UserOne("LiSi");
        Observer userWang = new UserOne("WangWu");

//        公众号服务添加订阅者
        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);

//        订阅号更新信息，会自动调用发送通知的方法
        server.setInfomation("这是要发送的第一条消息");
    }

//    抽象工厂模式
    @Test
    public void test11(){
        System.out.println("小米产品");
        MiFactory miFactory=new MiFactory();
        IPhoneProduct iPhoneProduct = miFactory.iPhoneProductFactory();
        iPhoneProduct.call();
        IRouterProduct iRouterProduct = miFactory.iRouterProductFactory();
        iRouterProduct.wifi();
        System.out.println("华为产品");
        HuaweiFactory huaweiFactory=new HuaweiFactory();
        IPhoneProduct Huaweiphone = huaweiFactory.iPhoneProductFactory();
        Huaweiphone.call();
        IRouterProduct huaweiRouter = huaweiFactory.iRouterProductFactory();
        huaweiRouter.wifi();
    }

//    饿汉式单例模式
    @Test
    public void test12(){
//            获取单例模式的对象
        SingletonDemo1 instance1 = SingletonDemo1.getInstance();
        SingletonDemo1 instance2 = SingletonDemo1.getInstance();
        System.out.println(instance1==instance2);//true
    }

//测试 懒汉模式
    }
