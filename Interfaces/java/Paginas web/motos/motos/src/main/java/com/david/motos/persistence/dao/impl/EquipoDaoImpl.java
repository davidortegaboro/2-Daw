package com.david.motos.persistence.dao.impl;

import com.david.motos.domain.entity.Equipo;
import com.david.motos.persistence.dao.EquipoDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EquipoDaoImpl implements EquipoDao {


    @Override
    public Equipo findById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public List<Equipo> findAll() throws SQLException{
        return List.of();
    }
}
