package com.example.novelapplication.model;

public class BookChapter {
    private String _id;
    private String title;
    private String link;
    private String id;
    private int time;
    private String chapterCover;
    private int totalPage;
    private  int partsize;
    private int order;
    private int currency;
    private Boolean unreadble;
    private Boolean isVip;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getChapterCover() {
        return chapterCover;
    }

    public void setChapterCover(String chapterCover) {
        this.chapterCover = chapterCover;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPartsize() {
        return partsize;
    }

    public void setPartsize(int partsize) {
        this.partsize = partsize;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public Boolean getUnreadble() {
        return unreadble;
    }

    public void setUnreadble(Boolean unreadble) {
        this.unreadble = unreadble;
    }

    public Boolean getVip() {
        return isVip;
    }

    public void setVip(Boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "BookChapter{" +
                "_id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", id='" + id + '\'' +
                ", time=" + time +
                ", chapterCover='" + chapterCover + '\'' +
                ", totalPage=" + totalPage +
                ", partsize=" + partsize +
                ", order=" + order +
                ", currency=" + currency +
                ", unreadble=" + unreadble +
                ", isVip=" + isVip +
                '}';
    }
}
