package com.everis.springcore.service;
/**
 * Regla de negocio relacionada a clientes
 * @author Dell5458
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.everis.springcore.dao.ClienteDAO;
import com.everis.springcore.model.Cliente;


@Service // Servicio de Negocio, agrega un objeto al contexto de spring
public class ClientService {
	
	@Autowired
	private ClienteDAO clienteDAO;
	public List<Cliente> listar(){
		return clienteDAO.listar();
	}
	
	public boolean insertar(Cliente cliente) {
		List<Cliente> clientes = clienteDAO.listar();
		for (Cliente duplicado : clientes) {
			if(duplicado.getRfc().equals(cliente.getRfc())) {
				return false;
			}
		}
		clienteDAO.insertar(cliente);
		return true;
	}
	
	public Cliente buscar(int idCliente) {
		return clienteDAO.buscar(idCliente);
	}
	
	public boolean actualizar(Cliente cliente) {
		return clienteDAO.actualizar(cliente);
	}
	
	public boolean eliminar(int idCliente) {
		return clienteDAO.eliminar(idCliente);
	}
	
	public boolean exportar (String rutaArchivo){
		XSSFWorkbook libro = new XSSFWorkbook();
		XSSFSheet hoja = libro.createSheet();
		String [] header= new String[]{"ID Cliente", "Nombre","A Paterno","A Materno","RFC"};
		
		XSSFRow row=hoja.createRow(0);
		for (int j = 0; j <header.length; j++) {//para la cabecera
					XSSFCell cell= row.createCell(j);
					cell.setCellValue(header[j]);//s					
		}
		
		List<Cliente> clientes =  clienteDAO.listar();		
		for (int i = 1; i <= header.length; i++) {
			int col=0;
			XSSFRow fila=hoja.createRow(i);
			Cliente cliente = clientes.get(i-1);

			XSSFCell celdaIdCliente = row.createCell(col++);
			celdaIdCliente.setCellValue(cliente.getIdCliente());
			
			XSSFCell celdaNombre = row.createCell(col++);
			celdaNombre.setCellValue(cliente.getNombre());
			
			XSSFCell celdaApaterno = row.createCell(col++);
			celdaApaterno.setCellValue(cliente.getApaterno());
			
			XSSFCell celdaAmaterno = row.createCell(col++);
			celdaAmaterno.setCellValue(cliente.getAmaterno());
			
			XSSFCell celdaRfc = row.createCell(col++);
			celdaRfc.setCellValue(cliente.getRfc());
			
		}
		
		try {
			File archivo = new File(rutaArchivo);
			FileOutputStream fileOut = new FileOutputStream(archivo);
			if(archivo.exists()) {
				archivo.delete();
			}else {
				libro.write(fileOut);
				fileOut.flush();
				fileOut.close();
			}
			return true;
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
			
		}
	}
