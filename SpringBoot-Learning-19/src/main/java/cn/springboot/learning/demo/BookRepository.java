package cn.springboot.learning.demo;
public interface BookRepository {

    Book getByIsbn(String isbn);

}