import java.util.Date;

public class Message {
    private String word;
    private Date sentDate;
    private int addressAtId;
    private int senderId;

    public void printMessages(){

    }

    public Date getDate() {
        return sentDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "word='" + word + '\'' +
                ", sentDate=" + sentDate +
                ", addressAtId=" + addressAtId +
                ", senderId=" + senderId +
                '}';
    }
}
