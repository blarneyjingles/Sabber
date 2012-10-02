package nl.napauleon.sabber.history;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HistoryInfo {
	private String item;
	private Long dateDownloaded;
    private String message;

    public HistoryInfo(String item, Long dateDownloaded, String message) {
		this.item = item;
		this.dateDownloaded = dateDownloaded;
        this.message = message;
	}
	
	public String getDateDownloaded() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(dateDownloaded*1000L));
	}

	public String getItem() {
		return item;
	}

    public String getMessage() {
        return message;
    }
}
