import com.jcabi.aspects.Loggable;
import org.aspectj.lang.annotation.Before;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {


	@Test
	public void adding() {
		NikolaRandomKlasa klasa = new NikolaRandomKlasa();
		klasa.metoda1(4);
		klasa.metoda2(2,6);
	}


}
