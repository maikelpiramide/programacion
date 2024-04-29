package com.example.ejercicio1.Classes;


import java.sql.*;

public class Conexion {
    private static final String URL = "jdbc:mysql://bbddclase.ciujfhaisfhk.us-east-1.rds.amazonaws.com:3306/EjercicioFran1";
    private static final String USER = "admin";
    private static final String PASSWORD = "Bbdd0clase$$";

    public static void conectarBBDD(){
        //ver los drivers de la app
        DriverManager.drivers().forEach(driver-> System.out.println(driver.getClass().getName()));

        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){
            //crear una tabla con Statement
            Statement statement = connection.createStatement();
            String sqlCreate = "create table producto(id serial,barcode varchar(22) not null, nombre varchar(200) not null, precio double not null, primary key(id))";
            statement.execute(sqlCreate);
            System.out.println("tabla de productos creada");


            //obtener los datos de la tabla
            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from producto");
            ResultSet resultQuery = preparedStatement2.executeQuery();
            while (resultQuery.next()){
                System.out.printf("producto : { id :%s, barcode: %s, nombre: %s, precio: %s}",resultQuery.getLong(1),resultQuery.getString(2),resultQuery.getString(3),resultQuery.getDouble(4));
            }
            resultQuery.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    public static void createData(){
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)) {
            //insertar datos en la tabla
            String sqlInsert = "insert into producto (barcode,nombre,precio) values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1,"123abc");
            preparedStatement.setString(2,"producto1Java");
            preparedStatement.setDouble(3,9.99);
            preparedStatement.executeUpdate();
            //obtnenemos el id del registro creado

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()){
                System.out.printf("registro creado con id: %s%n",resultSet.getLong(1));
            }
            resultSet.close();

            preparedStatement.setString(1,"456abc");
            preparedStatement.setString(2,"producto2Java");
            preparedStatement.setDouble(3,19.99);
            preparedStatement.executeUpdate();

            ResultSet resultSet2 = preparedStatement.getGeneratedKeys();
            while (resultSet2.next()){
                System.out.printf("registro creado con id: %s%n",resultSet2.getLong(1));
            }
            resultSet2.close();

            preparedStatement.setString(1,"135abc");
            preparedStatement.setString(2,"producto3Java");
            preparedStatement.setDouble(3,5.99);
            preparedStatement.executeUpdate();
            ResultSet resultSet3 = preparedStatement.getGeneratedKeys();
            while (resultSet3.next()){
                System.out.printf("registro creado con id: %s%n",resultSet3.getLong(1));
            }
            resultSet3.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void updateProductPriceById(long id ,double price){
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){

            //actualizar producto
            PreparedStatement preparedStatement = connection.prepareStatement("update producto set precio = ? where id = ?  ");
            preparedStatement.setDouble(1,price);
            preparedStatement.setLong(2,id);
            preparedStatement.executeUpdate();

            System.out.printf("Producto con id %d actualizado", id);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void removeProductById(long id){
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){

            PreparedStatement preparedStatement = connection.prepareStatement("delete from producto where id = ?");
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
            System.out.println("producto eliminado correctamente");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
