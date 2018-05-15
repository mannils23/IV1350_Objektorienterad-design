package se.kth.iv1350.PoS.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Class responsible for the log.
 *
 */
public class LogHandler {
	private static final String LOG_FILE_NAME = "processsale-log.txt";
	
	private PrintWriter logFile;
	
	public LogHandler() throws IOException{
		logFile = new PrintWriter(new FileWriter(LOG_FILE_NAME), true);
	}
	
	/**
	 * Writes a log entry describing a thrown exception.
	 * 
	 * @param exception The exception to log.
	 */
	public void logException(Exception exception) {
		StringBuilder logMsgBuilder = new StringBuilder();
		logMsgBuilder.append(createTime());
		logMsgBuilder.append(", Exception was thrown: ");
		logMsgBuilder.append(exception.getMessage());
		System.out.println("\n EXCEPTION LOG: " + logMsgBuilder + "\n");
		logFile.println(logMsgBuilder);
		exception.printStackTrace(logFile);
	}
	
	private String createTime() {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.
			ofLocalizedDateTime(FormatStyle.MEDIUM);
			return now.format(formatter);
		}
}
