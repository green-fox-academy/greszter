package blog_post;

public class Main {
    public static void main(String[] args) {

        Blog blog = new Blog();

        BlogPost postDoe = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.",
                "2000.05.04.");
        BlogPost postUrban = new BlogPost("Tim Urban", "Wait but why",
                "A popular long-form, stick-figure-illustrated blog about almost everything.",
                "2010.10.10.");
        BlogPost postTurton = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, doesn't want to be the center of " +
                        "attention. When I asked to take his picture outside one of IBM's New York City offices, he told " +
                        "me that he wasn't really into the whole organizer profile thing.",
                "2017.03.28.");

        blog.add(postDoe);
        blog.add(postUrban);
        blog.add(postTurton);
        System.out.println("Number of posts: " + blog.numberOfPosts());


        System.out.println(postTurton.getText());

        blog.delete(2);
        System.out.println("Number of posts: " + blog.numberOfPosts());


        blog.update(0, postTurton);
        System.out.println("Number of posts: " + blog.numberOfPosts());


    }
}
