import com.DoubleStrong.DecoratorPattern.AbstractComponent;
import com.DoubleStrong.DecoratorPattern.ConcreteComponent;
import com.DoubleStrong.DecoratorPattern.Egg;
import com.DoubleStrong.DecoratorPattern.sausage;
import com.DoubleStrong.SimpleFactory.Operation;
import com.DoubleStrong.SimpleFactory.SimpleFactory;
import com.DoubleStrong.StrategyPattern.StrategyContext;
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
    }
