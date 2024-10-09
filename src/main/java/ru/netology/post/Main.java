package ru.netology.post;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Василий";
        post.birthday = new FromDate();
        post.birthday.day = 20;
        post.birthday.month = 11;
        post.birthday.year = 1995;
        post.passpotr = "4444 № 4444444";
        post.patronymic = "Андреевич";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Садовый";
        post.subscription = true;
        System.out.println(post);

    }
}
