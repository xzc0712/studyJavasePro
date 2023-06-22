package com.xzc.movieDemo;

public class MovieOpreator {
    private Movie[] movies;

    public MovieOpreator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println("----输出电影信息---------------");
            System.out.println("编号：" + movies[i].getId());
            System.out.println("名称：" + movies[i].getName());
            System.out.println("导演：" + movies[i].getDirector());
            System.out.println("演员：" + movies[i].getActor());
        }
    }

    public void printMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println("-----您选择的电影信息如下------------");
                System.out.println("编号：" + movies[i].getId());
                System.out.println("名称：" + movies[i].getName());
                System.out.println("导演：" + movies[i].getDirector());
                System.out.println("演员：" + movies[i].getActor());
                System.out.println("价格：" + movies[i].getPrice());
                System.out.println("得分：" + movies[i].getScore());
                System.out.println("信息：" + movies[i].getInfo());
            }
        }
    }

}
