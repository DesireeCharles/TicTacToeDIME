package info.scce.dime.common;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonNativeDateTimeServiceLibrary {

	public static Date getCurrentDate() {
    	return new Date();
    }
	
    public static String getCurrentDateAsString() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
	}

}
