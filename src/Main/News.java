package Main;

import java.util.Date;

public class News {
    private String title;
    private Date dayAndTime;

    public Date getDate() {
        return dayAndTime;
    }

    @Override
    public String toString() {
        return "Main.News{" +
                "title='" + title + '\'' +
                ", dayAndTime=" + dayAndTime +
                '}';
    }
}
