package com.david.motos.persistence.dao.db.mapper;

import com.david.motos.common.container.EquipoContainer;
import com.david.motos.domain.entity.Equipo;
import com.david.motos.domain.entity.Piloto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PilotoMapper {

    public static Piloto toPiloto (ResultSet resultSet) throws SQLException{
        if (resultSet == null){
            return null;
        }
        try{
            Integer idEquipo = resultSet.getInt("id_equipo");
            Equipo equipo = EquipoContainer.getEquipoService().findById(idEquipo);
        return new Piloto(
                resultSet.getInt("id_piloto"),
                resultSet.getString("name"),
                resultSet.getInt("age"),
                equipo
        );
        }catch (SQLException e){
            throw new RuntimeException("Algo ha salido mal" + e.getMessage());
        }
    }

    public static List<Piloto> toListPiloto (ResultSet resultSet) throws SQLException{
        if (resultSet == null){
            return null;
        }

        List<Piloto> pilotoList = new ArrayList<>();
        try{
            while (resultSet.next()){
                pilotoList.add(toPiloto(resultSet));
            }

            return pilotoList;

        } catch (SQLException e){
            throw new RuntimeException("Algo ha salido mal" + e.getMessage());
        }
    }
}
