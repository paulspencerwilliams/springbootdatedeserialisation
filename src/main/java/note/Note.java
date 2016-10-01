package note;

import java.time.ZonedDateTime;

public class Note {
  private String content;

  private ZonedDateTime watchedAt;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ZonedDateTime getWatchedAt() {
    return watchedAt;
  }

  public void setWatchedAt(ZonedDateTime watchedAt) {
    this.watchedAt = watchedAt;
  }

  @Override
  public String toString() {
    return "Note{" +
        "content='" + content + '\'' +
        ", watchedAt=" + watchedAt +
        '}';
  }
}
