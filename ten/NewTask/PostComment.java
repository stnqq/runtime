package ten.NewTask;

import java.util.Arrays;

public class PostComment {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getWhoLiked() {
        return whoLiked;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал

    @Override
    public String toString() {
        return "PostComment{" +
                "text='" + text + '\'' +
                ", whoLiked=" + Arrays.toString(whoLiked) +
                '}';
    }
}