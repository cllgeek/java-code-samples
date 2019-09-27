package org.geekjc.jpamulti.service;

import org.geekjc.jpamulti.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ll
 * @date 2019年09月27日 4:57 PM
 */
@Service
@Transactional
public class BookService {
    @Autowired
    BookDao bookDao;
    public Integer updateBookByName(String author, String name) {
        return bookDao.updateBookByName(author, name);
    }
}
