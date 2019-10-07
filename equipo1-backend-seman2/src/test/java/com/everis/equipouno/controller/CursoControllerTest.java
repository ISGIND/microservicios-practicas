package com.everis.equipouno.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.everis.equipouno.Application;
import com.everis.equipouno.model.Curso;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

//JUnit para Spring Boot
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class CursoControllerTest {

//Mock es un objeto de prueba (dummie) simulación de peticiones y respuestas http
	private MockMvc mvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testListar() throws Exception {
		String url = "/curso/";
		// Simulacion  como Postman
		MvcResult resultado =mvc.perform(MockMvcRequestBuilders.get(url)).andReturn();
		//
		int status = resultado.getResponse().getStatus();
		assertTrue(status==200);
		String jsonRespuesta = resultado.getResponse().getContentAsString();
		ObjectMapper mapper = new ObjectMapper();
		
		List<Curso> cursos = mapper.readValue(jsonRespuesta, new TypeReference<List<Curso>>() {});	
		assertNotNull(cursos); // que la lista no este vacia
		assertTrue(cursos.size() > 0);
		for(Curso curso : cursos) {
			assertTrue(curso.getNombrecurso() != null);
		}
	}
	

	@Test
	public void testInsertar() throws Exception {
		String url = "/curso/";
		
		for (int i= 0; i<50; i++) {
		Curso curso = new Curso();
		curso.setNombrecurso("Curso Alejandro Junit"+i);
		curso.setDescripcion("Descripcion Alejandro Junit" +i);
        //Usando Jackson
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(curso);
		MvcResult resultado = mvc
				.perform(MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE).content(json))
				.andReturn();
		int status = resultado.getResponse().getStatus();
		assertTrue(status == 200); // Exitosa la peticion
		String jsonRespuesta = resultado.getResponse().getContentAsString();
		Curso cursoInsertado = mapper.readValue(jsonRespuesta,Curso.class);
		assertTrue(cursoInsertado.getId()>0);
		//assertTrue(jsonRespuesta.contains("id"));
		}
	}

	@Test
	public void testActualizar() throws Exception {
		String url = "/curso/";
		Curso curso = new Curso();
		curso.setNombrecurso("Curso PruebaTestUnit");
		curso.setDescripcion("Descripcion Junit");
		curso.setId(2);
		// Usando Jackson
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(curso);
		MvcResult resultado = mvc
				.perform(MockMvcRequestBuilders.put(url).contentType(MediaType.APPLICATION_JSON_VALUE).content(json))
				.andReturn();
		int status = resultado.getResponse().getStatus();
		assertTrue(status == 200); // Exitosa la peticion
		String jsonRespuesta = resultado.getResponse().getContentAsString();
		Curso cursoActualizado = mapper.readValue(jsonRespuesta, Curso.class);
		assertTrue(cursoActualizado.getNombrecurso().equals("Curso PruebaTestUnit"));
		// assertTrue(jsonRespuesta.contains("id"));
	}
	
	@Test
	public void testEliminar() throws Exception {
		String url ="/curso/1";
		
		MvcResult resultado = mvc
				.perform(MockMvcRequestBuilders.delete(url))
				.andReturn();
		int status = resultado.getResponse().getStatus();
		assertTrue(status==200); 
		String json = resultado.getResponse().getContentAsString();
		assertTrue(json.equals("true"));		
		
		
	}

}