package com.david.motos.persistence.dao.db.mapper;

import com.david.motos.domain.entity.Equipo;
import com.david.motos.domain.entity.Moto;
import com.david.motos.domain.entity.Piloto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipoMapper {

    public static Equipo toEquipo (ResultSet resultSet) throws SQLException{

        if (resultSet== null){
            return null;
        }

        try{

            List<Piloto> pilotoList = new ArrayList<>();

            List<Moto> pilotoMoto = new ArrayList<>();



            return new Equipo(

            )
        } catch (SQLException e){
            throw  new RuntimeException("Algo ha salido mal" + e.getMessage());
        }
    }
}
