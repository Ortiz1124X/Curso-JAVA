package com.Documentacion;

import Interfaces.CocheCRUD;

import java.util.List;

public class CocheMain {




    public static void main(String[] args) {



        CocheCRUD cocheCrud = new CocheCRUDImpl("Red","Ferrari","Aventador");
        cocheCrud.save(new CocheCRUDImpl("Red", "Ferrari","Aventador"));

        CocheCRUD cocheCrud1 = new CocheCRUDImpl("Black","Lamborghini","Urus");
        cocheCrud1.save(new CocheCRUDImpl("Black", "Lamborghini","Urus"));

        System.out.println(cocheCrud);
        System.out.println(cocheCrud1);

        cocheCrud.findAll();
        cocheCrud1.findAll();
        cocheCrud.delete(new CocheCRUDImpl("Red","Ferrari","Aventador"));
        cocheCrud1.delete(new CocheCRUDImpl("Black","Lamborghini","Urus"));

        System.out.println(cocheCrud);
        System.out.println(cocheCrud1);

    }


}





//
//        Crear una interfaz CocheCRUD.
//
//        Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
//
//        Como métodos de CocheCRUD podemos poner:
//
//        save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
//
//        Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
//
//        Ejemplo:
//
//        CocheCRUD cocheCrud = new CocheCRUDImpl()