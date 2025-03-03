package baktra.tinyblog;

public class BlogEntry {

    private String title;
    private String subTitle;
    private String mainText;
    private String footer;
    private int id;

    public BlogEntry(int id,String title, String subTitle, String mainText, String footer) {
        this.id=id;
        this.title = title;
        this.subTitle = subTitle;
        this.mainText = mainText;
        this.footer = footer;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getMainText() {
        return mainText;
    }

    public String getFooter() {
        return footer;
    }
}