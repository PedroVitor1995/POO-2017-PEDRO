package model;

public class Post {

    private int countLikes;

    public Post(int initialLikes) {
        this.countLikes = initialLikes;
    }
    public void addLike(){
        countLikes++;
    }
    public int obtercountLikes(){
        return countLikes;
    }
}
