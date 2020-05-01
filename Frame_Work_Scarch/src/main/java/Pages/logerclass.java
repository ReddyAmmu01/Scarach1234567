package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logerclass {
	static Logger logger = LogManager.getLogger(logerclass.class);
	
public static void main(String[] args) {
	System.out.println("Welcome To ther Logger class");
	logger.info("get the Information Messgages ");
	logger.warn("Warning Message of the File");
	logger.error("The error Messge of the file ");
	logger.trace("the trace of the message");
	System.out.println("The Final Message of the File ");
}

}
