package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-29 14:03
 */

@Transactional
public interface BookService {

    /**
     * Save
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * update
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * delete
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * search by ID
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * search all
     * @return
     */
    public List<Book> getAll();
}
