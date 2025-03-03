package baktra.tinyblog;

public class BlogEntry {

    private final String title;
    private final String subTitle;
    private final String mainText;
    private final String footer;
    private final int id;

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