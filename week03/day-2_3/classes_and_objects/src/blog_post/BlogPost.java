package blog_post;

public class BlogPost {

    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public String getAuthorName() {
        return this.authorName;
    }
    public String getTitle() {
        return this.title;
    }
    public String getText() {
        return this.text;
    }
    public String getPublicationDate() {
        return this.publicationDate;
    }


}
