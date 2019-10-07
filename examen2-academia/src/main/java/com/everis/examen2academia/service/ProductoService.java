package com.everis.examen2academia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.examen2academia.model.Producto;
import com.everis.examen2academia.repository.CategoriaRepository;
import com.everis.examen2academia.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Producto> buscar(String productoBuscado){
		List<Producto> encontrados = new ArrayList<Producto>();
		List<Producto> productos=  productoRepository.findAll();
		if(productos != null) {
		for (Producto producto : productos) {
			if(producto.getNombre().contains(productoBuscado)) {
				encontrados.add(producto);
			}
		}
		return encontrados;
		}
		return encontrados;
	}

	public List<Producto> listar() {
		return productoRepository.findAll();
	}

	public Producto insertar(Producto producto) {

		if (producto.getCategoria().getId() == null) {
			categoriaRepository.save(producto.getCategoria());
		}
		return productoRepository.save(producto);
	}

	public Producto actualizar(Producto producto) {
		return productoRepository.save(producto);
	}

	public boolean eliminar(int id) {
		if (productoRepository.existsById(id)) {
			productoRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}
