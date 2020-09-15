package com.example.novelapplication.model;



import java.util.List;

public class BookSource {
    private String  _id;
    private String name;
    private String lastChapter;
    private String source;
    private String link;
    private Boolean isCharge;
    private int chaptersCount;
    private String updated;
    private Boolean starting;
    private String host;

    private List<BookChapter> chapters;

    public List<BookChapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<BookChapter> chapters) {
        this.chapters = chapters;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(String lastChapter) {
        this.lastChapter = lastChapter;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getCharge() {
        return isCharge;
    }

    public void setCharge(Boolean charge) {
        isCharge = charge;
    }

    public int getChaptersCount() {
        return chaptersCount;
    }

    public void setChaptersCount(int chaptersCount) {
        this.chaptersCount = chaptersCount;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Boolean getStarting() {
        return starting;
    }

    public void setStarting(Boolean starting) {
        this.starting = starting;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "BookSource{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", lastChapter='" + lastChapter + '\'' +
                ", source='" + source + '\'' +
                ", link='" + link + '\'' +
                ", isCharge=" + isCharge +
                ", chaptersCount=" + chaptersCount +
                ", updated='" + updated + '\'' +
                ", starting=" + starting +
                ", host='" + host + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
