package com.backend.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.backend.rest.conexion.Conexion;

import com.backend.rest.vo.FacturaVO;

public class FacturaDAO {


	
	
	
	
	public ArrayList<FacturaVO> obtenerFactura() {
		Connection connection = null;
		Conexion miConexion = new Conexion();
		PreparedStatement statement = null;
		ResultSet result = null;

		FacturaVO mifactura=new FacturaVO();
		ArrayList<FacturaVO> factura = null;
		
		
		
		connection = miConexion.getConnection();

		String consulta = "SELECT * FROM factura";

		try {
			if (connection != null) {
				factura = new ArrayList<>();
				statement = connection.prepareStatement(consulta);

				result = statement.executeQuery();

				while (result.next() == true) {
					mifactura = new FacturaVO();
					
					mifactura.setFacnumero(result.getInt("facnumero"));
					mifactura.setNumerolienas(result.getInt("numerolineas"));
					mifactura.setFacfechaemision(result.getInt("facfechaemision"));	
					mifactura.setValor(result.getDouble("valor"));	
					
					
					
					
					factura.add(mifactura);
				}

			}
		} catch (SQLException e) {
			System.out.println("Error en la consulta del equipo: " + e.getMessage());
		} finally {
			miConexion.desconectar();
		}
		return factura;
	}
	
	public FacturaVO actualizarfactura(FacturaVO mifactura) {
		String resultado = "";
		Connection connection = null;
		Conexion miConexion = new Conexion();
		connection = miConexion.getConnection();
		try {
			String consulta = "UPDATE factura "
					+ " SET valor= ?"
					+ " WHERE numerolineas= ? ";
			PreparedStatement preStatement = connection.prepareStatement(consulta);

			preStatement.setDouble(1, mifactura.getValor());
			preStatement.setInt(2, mifactura.getNumerolienas());
			
			
			
			
			preStatement.executeUpdate();

			resultado = "Se ha Actualizado la linea satisfactoriamente";

			miConexion.desconectar();

		} catch (SQLException e) {
			System.out.println(e);
			resultado = "No se pudo actualizar la linea";
		}
		return mifactura;
	}
	
	public String eliminarFactura(String factura) {
		Connection connection = null;
		Conexion miConexion = new Conexion();
		connection = miConexion.getConnection();

		String resp = "";
		try {
			String sentencia = "DELETE FROM factura WHERE numerolinea= ? ";

			PreparedStatement statement = connection.prepareStatement(sentencia);
			statement.setString(1, factura);

			statement.executeUpdate();

			resp = "El equipo se ha eliminado exitosamente";
			statement.close();
			miConexion.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			resp = "No se pudo eliminar el equipo";
		}
		return resp;
	}
	
	public FacturaVO consultarFactura(String factura) {
		Connection connection = null;
		Conexion miConexion = new Conexion();
		PreparedStatement statement = null;
		ResultSet result = null;

		
		
		
		FacturaVO mifactura = null;
		System.out.println("equipo: "+factura);

		connection = miConexion.getConnection();

		String consulta = "SELECT * FROM equipo where numerolinea = '"+factura+"'";
		System.out.println(consulta);
		try {
			if (connection != null) {
				statement = connection.prepareStatement(consulta);

				result = statement.executeQuery();
				

				if (result.next() == true) {
					mifactura = new FacturaVO();
					
					mifactura.setFacnumero(result.getInt("facnumero"));
					mifactura.setNumerolienas(result.getInt("numerolineas"));
					mifactura.setFacfechaemision(result.getInt("facfechaemision"));	
					mifactura.setValor(result.getDouble("valor"));	
					
					
					
					
					
					
									
				}
			}
		} catch (SQLException e) {
			System.out.println("Error en la consulta del empleado: " + e.getMessage());
		} finally {
			if (mifactura!=null) {
				System.out.println("Numero linea: "+mifactura.getNumerolienas());
				miConexion.desconectar();

			}else{
				System.out.println("numero Linea: "+mifactura);
			}
		}
		
		
		
		return mifactura;
	}
}

	
