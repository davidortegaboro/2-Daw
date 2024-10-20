package com.libreria.david.persistence.dao.user.mapper;

import com.libreria.david.domain.user.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUserRowMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setIsbn(rs.getNString("isbn"));
        book.setTitleEs(rs.getNString("title_es"));
        book.setSynopsisEs(rs.getString("synopsis_es"));
        book.setPrice(rs.getDouble("price"));
        book.setDiscount(rs.getDouble("discount"));

        return book;
    }
}