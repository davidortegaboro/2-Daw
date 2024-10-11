package com.david.libreria.persistence.dao.mapper;

import com.david.libreria.domain.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements CustomRowMapper<Book> {

    private final CategoryRowMapper categoryRowMapper = new CategoryRowMapper();
    private final PublisherRowMapper publisherRowMapper = new PublisherRowMapper();

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();

        CategoryRowMapper categoryRowMapper = new CategoryRowMapper();
        PublisherRowMapper publisherRowMapper = new PublisherRowMapper();

        book.setIsbn(rs.getNString("isbn"));
        book.setTitle(rs.getNString("title_es"));
        book.setSynopsis(rs.getNString("synopsis_es"));
        book.setPrice(rs.getBigDecimal("price"));
        book.setDiscount(rs.getFloat("discount"));
        if(this.existsColumn(rs, "publisher_id")){
            book.setPublisher(publisherRowMapper.mapRow(rs, rowNum));
        }
        if(this.existsColumn(rs, "category_id")){
            book.setCategory(categoryRowMapper.mapRow(rs, rowNum));
        }

        return book;

    }
}
