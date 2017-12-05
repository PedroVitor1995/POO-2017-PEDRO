package app;

import model.Post;

public class TestaPost {

    public static void main(String[] args) {

        Post post = new Post(4);
        System.out.println(post.obtercountLikes());
        post.addLike();
        System.out.println(post.obtercountLikes());
    }
}
