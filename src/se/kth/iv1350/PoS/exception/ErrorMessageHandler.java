package se.kth.iv1350.PoS.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Class responsible for showing error messages to the user.
 */
public class ErrorMessageHandler {
	
	public void showErrorMsg(String msg) {
		StringBuilder errorMsg = new StringBuilder();
		errorMsg.append(createTime());
		errorMsg.append(", ERROR: ");
		errorMsg.append(msg);
		System.out.println(errorMsg);
		
	}

	private String createTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		return now.format(formatter);
	}

}
