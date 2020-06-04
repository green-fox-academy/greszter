package blog_post;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    private List<BlogPost> blog;

    public Blog(){
        this.blog = new ArrayList<>();
    }

    public void add(BlogPost post){
        this.blog.add(post);
    }

    public void delete(int index){
        this.blog.remove(index);
    }

    public void update(int index, BlogPost post){
        this.blog.set(index, post);
    }

    public int numberOfPosts(){
        return this.blog.size();
    }


//    store a list of BlogPosts
//    add BlogPosts to the list
//    delete(int) one item at given index
//    update(int, BlogPost) one item at the given index and update it with another BlogPost

}
