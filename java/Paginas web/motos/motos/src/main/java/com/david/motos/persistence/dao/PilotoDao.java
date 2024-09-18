package com.david.motos.persistence.dao;

import com.david.motos.domain.entity.Piloto;

import java.sql.SQLException;
import java.util.List;

public interface PilotoDao {

    Piloto findById(Integer id) throws SQLException;

    List<Piloto> findAll() throws SQLException;
}
