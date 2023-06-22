package com.xzc.movieDemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];

        movies[0] = new Movie(1,"m1",80,9.8,"xzc","xzc","info1");
        movies[1] = new Movie(2,"m2",90,9.2,"xzc2","xzc2","info2");
        movies[2] = new Movie(3,"m3",100,9.3,"xzc2","xzc2","info3");
        movies[3] = new Movie(4,"m4",70,9.4,"xzc2","xzc2","info4");

        MovieOpreator movieOpreator = new MovieOpreator(movies);

        Scanner sc = new Scanner(System.in);
        int command = sc.nextInt();
        switch (command) {
            case 1 :
                movieOpreator.printAllMovies();
                break;
            case 2 :
                int id =  sc.nextInt();
                movieOpreator.printMovieById(id);
                break;
            default:
                System.out.println("输入指令有误");
                break;
        }

    }
}
