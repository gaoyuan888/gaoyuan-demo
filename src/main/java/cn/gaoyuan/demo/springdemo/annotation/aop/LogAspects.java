package cn.gaoyuan.demo.springdemo.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/4 9:20
 * @desc
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int cn.gaoyuan.demo.springdemo.annotation.aop.MathCalculator.*(..))")
    public void pointCut() {
    }


    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName() + "算法运行参数列表是:{" + Arrays.toString(args) + "}");
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "算法结束....");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() + "算法正常返回：{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println(joinPoint.getSignature().getName() + "算法出现异常：{" + exception + "}");
    }
}
