package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		log.error("Bas neki error!");
	}


}
