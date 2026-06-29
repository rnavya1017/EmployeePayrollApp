import java.util.UUID;

public class DownloadToken {

    private String token;

    public DownloadToken() {
        this.token = UUID.randomUUID().toString();
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return token;
    }
}