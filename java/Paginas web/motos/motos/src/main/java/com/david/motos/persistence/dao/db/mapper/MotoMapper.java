package com.david.motos.persistence.dao.db.mapper;

import com.david.motos.common.container.EquipoContainer;
import com.david.motos.domain.entity.Equipo;
import com.david.motos.domain.entity.Moto;
import com.david.motos.domain.service.EquipoService;
import com.david.motos.domain.service.impl.EquipoServiceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MotoMapper {

    public static Moto toMoto(ResultSet resultSet) throws SQLException{
        if (resultSet == null){
            return null;
        }
        try{
            Integer idEquipo = resultSet.getInt("id_equipo");
            Equipo equipo = EquipoContainer.getEquipoService().findById(idEquipo);
            return new Moto(
                    resultSet.getInt("id_moto"),
                    resultSet.getString("brand"),
                    resultSet.getInt("horses"),
                    equipo
            );
        }catch (SQLException e){
            throw new RuntimeException("Algo no ha funcionado" + e.getMessage());
        }
    }

    public static List<Moto> toListMoto (ResultSet resultSet) throws SQLException {
        if (resultSet == null){
            return null;
        }

        List<Moto> motoList = new ArrayList<>();

        try{
            while (resultSet.next()){
                motoList.add(toMoto(resultSet));
            }

            return motoList;


        } catch (SQLException e){
            throw new RuntimeException("Algo no ha funcionado" + e.getMessage());
        }
    }


}
