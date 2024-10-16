package com.david.motos.persistence.dao;

import com.david.motos.domain.entity.Moto;

import java.sql.SQLException;
import java.util.List;

public interface MotoDao {

    Moto findById(Integer id) throws SQLException;

    List<Moto> findAll() throws SQLException;

}
