package com.david.motos.persistence.dao;

import com.david.motos.domain.entity.Equipo;

import java.sql.SQLException;
import java.text.RuleBasedCollator;
import java.util.List;

public interface EquipoDao {

    Equipo findById(Integer id)throws SQLException;

    List<Equipo> findAll()throws SQLException;
}
