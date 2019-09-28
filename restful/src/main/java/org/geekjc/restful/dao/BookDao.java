package org.geekjc.restful.dao;


import org.geekjc.restful.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author ll
 * @date 2019年09月28日 11:34 AM
 */
@RepositoryRestResource(path = "bs",collectionResourceRel = "bs",itemResourceRel = "b")
public interface BookDao extends JpaRepository<Book,Integer> {
    @RestResource(path = "byname",rel = "byname")
    Book getBookByNameContaining(@Param("name") String name);
}
