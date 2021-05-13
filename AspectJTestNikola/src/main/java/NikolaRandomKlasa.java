import com.jcabi.aspects.Loggable;
import org.springframework.stereotype.Component;


public class NikolaRandomKlasa {

	@Loggable
	public void metoda1(int x){
		System.out.println(x);
	}

	@Loggable
	public int metoda2(int x, int y){
		return x+y;
	}
}
