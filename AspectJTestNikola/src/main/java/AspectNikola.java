import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
public class AspectNikola {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Before("execution(* *(..)) && @annotation(Loggable)")
	public void before(JoinPoint joinPoint){
		logger.info("Napisi nesto plizz");
		/*System.out.println(joinPoint.getSignature().getName());*/
	}
}
