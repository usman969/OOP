
public class BookChapter extends Text {
    private String title;
    private int chapterNumber;
    private String chapterContents;
    
    public BookChapter(String title, int chapterNumber,String chapterContents) {
        this.title = title;
        this.chapterNumber = chapterNumber;
        this.chapterContents = chapterContents;
    }
    public String getTitle() {
        return title;
    }
    public int getChapterNumber() {
        return chapterNumber;
    }
    public String getChapterContents() {
        return chapterContents;
    }
    public void display(){
        System.out.println("Title:"+getTitle()+"\nChapter Number:"+getChapterNumber()+"\nChapter Contents:");
    }
}
