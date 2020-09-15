package com.example.novelapplication.model;

public class Book {
    private String _id;//书籍id
    private String author;//作者
    private String cover; // 封面
    private String longIntro; //长介绍
    private String title;//书名
    private String cat;
    private String majorCate; //主分类
    private String minorCate;//子分类
    private Boolean _le;
    private Boolean  allowMonthly;
    private Boolean  allowVoucher;
    private Boolean  allowBeanVoucher;
    private Boolean  hasCp;
    private int postCount;
    private int latelyFollower;//追书人数
    private int followerCount;
    private int  wordCount;//总字数
    private int  serializeWordCount;//平均
    private float retentionRatio;//好评率
    private String updated;//更新于
    private Boolean isSerial;///连载中
    private int chaptersCount;//总章数
    private String lastChapter;//最新章节
    private     Boolean donate;
    private Rating rating;

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getCover() {
        return cover;
    }




    public String getLongIntro() {
        return longIntro;
    }

    public void setLongIntro(String longIntro) {
        this.longIntro = longIntro;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getMajorCate() {
        return majorCate;
    }

    public void setMajorCate(String majorCate) {
        this.majorCate = majorCate;
    }

    public String getMinorCate() {
        return minorCate;
    }

    public void setMinorCate(String minorCate) {
        this.minorCate = minorCate;
    }

    public Boolean get_le() {
        return _le;
    }

    public void set_le(Boolean _le) {
        this._le = _le;
    }

    public Boolean getAllowMonthly() {
        return allowMonthly;
    }

    public void setAllowMonthly(Boolean allowMonthly) {
        this.allowMonthly = allowMonthly;
    }

    public Boolean getAllowVoucher() {
        return allowVoucher;
    }

    public void setAllowVoucher(Boolean allowVoucher) {
        this.allowVoucher = allowVoucher;
    }

    public Boolean getAllowBeanVoucher() {
        return allowBeanVoucher;
    }

    public void setAllowBeanVoucher(Boolean allowBeanVoucher) {
        this.allowBeanVoucher = allowBeanVoucher;
    }

    public Boolean getHasCp() {
        return hasCp;
    }

    public void setHasCp(Boolean hasCp) {
        this.hasCp = hasCp;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getLatelyFollower() {
        return latelyFollower;
    }

    public void setLatelyFollower(int latelyFollower) {
        this.latelyFollower = latelyFollower;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public int getSerializeWordCount() {
        return serializeWordCount;
    }

    public void setSerializeWordCount(int serializeWordCount) {
        this.serializeWordCount = serializeWordCount;
    }

    public float getRetentionRatio() {
        return retentionRatio;
    }

    public void setRetentionRatio(float retentionRatio) {
        this.retentionRatio = retentionRatio;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Boolean getSerial() {
        return isSerial;
    }

    public void setSerial(Boolean serial) {
        isSerial = serial;
    }

    public int getChaptersCount() {
        return chaptersCount;
    }

    public void setChaptersCount(int chaptersCount) {
        this.chaptersCount = chaptersCount;
    }

    public String getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(String lastChapter) {
        this.lastChapter = lastChapter;
    }

    public Boolean getDonate() {
        return donate;
    }

    public void setDonate(Boolean donate) {
        this.donate = donate;
    }

    public String getAuthor() {
        return author;
    }

    public String get_id() {
        return _id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
    public Book(){

    }

    public void setCover(String cover) {
        this.cover = cover;
    }


    @Override
    public String toString() {
        return "Book{" +
                "_id='" + _id + '\'' +
                ", author='" + author + '\'' +
                ", cover='" + cover + '\'' +
                ", longIntro='" + longIntro + '\'' +
                ", title='" + title + '\'' +
                ", cat='" + cat + '\'' +
                ", majorCate='" + majorCate + '\'' +
                ", minorCate='" + minorCate + '\'' +
                ", _le=" + _le +
                ", allowMonthly=" + allowMonthly +
                ", allowVoucher=" + allowVoucher +
                ", allowBeanVoucher=" + allowBeanVoucher +
                ", hasCp=" + hasCp +
                ", postCount=" + postCount +
                ", latelyFollower=" + latelyFollower +
                ", followerCount=" + followerCount +
                ", wordCount=" + wordCount +
                ", serializeWordCount=" + serializeWordCount +
                ", retentionRatio=" + retentionRatio +
                ", updated='" + updated + '\'' +
                ", isSerial=" + isSerial +
                ", chaptersCount=" + chaptersCount +
                ", lastChapter='" + lastChapter + '\'' +
                ", donate=" + donate +
                '}';
    }
    public Book(String author,String title,String lastChapter){
        this.author=author;
        this.title=title;
        this.lastChapter=lastChapter;

    }
}
