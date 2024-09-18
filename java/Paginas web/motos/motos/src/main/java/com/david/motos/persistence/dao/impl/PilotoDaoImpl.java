package com.david.motos.persistence.dao.impl;

import com.david.motos.domain.entity.Piloto;
import com.david.motos.persistence.dao.PilotoDao;

import java.sql.SQLException;
import java.util.List;

public class PilotoDaoImpl implements PilotoDao {

    @Override
    public Piloto findById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public List<Piloto> findAll() throws SQLException {
        return List.of();
    }
}
