package com.Documentacion;

import Interfaces.CocheCRUD;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    String Color;
    String Maker;
    String Model;

    public CocheCRUDImpl(String Color, String Maker, String Model){
        this.Color = Color;
        this.Maker = Maker;
        this.Model = Model;
    }



    @Override
    public void save(CocheCRUD cochecrud) {


    }

    @Override
    public List<CocheCRUD> findAll() {
        return null;
    }

    @Override
    public void delete(CocheCRUD cochecrud) {

    }

    @Override
    public String toString() {
        return "com.Documentacion.CocheCRUDImpl{" +
                "Color='" + Color + '\'' +
                ", findAll=" + findAll() +
                ", Maker='" + Maker + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
