package com.everis.equipouno.controller;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import com.everis.equipouno.model.Calendario;
import com.everis.equipouno.model.Curso;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class CalendarioControllerTest {
	private MockMvc mvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testListar() throws Exception {
		String url = "/calendario/";
		
		MvcResult resultado =mvc.perform(MockMvcRequestBuilders.get(url)).andReturn();
		//
		int status = resultado.getResponse().getStatus();
		assertTrue(status==200);
		String jsonRespuesta = resultado.getResponse().getContentAsString();
		ObjectMapper mapper = new ObjectMapper();
		
		
		List<Calendario> calendarios = mapper.readValue(jsonRespuesta, new TypeReference<List<Calendario>>() {});	
		assertNotNull(calendarios); // que la lista no este vacia
		assertTrue(calendarios.size() > 0);
		for(Calendario calendario  : calendarios) {
			assertTrue(calendario.getInicio() != null);
		}
	}

	@Test
	public void testInsertar() throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss ");
        String url = "/calendario/";
        Calendario calendario = new Calendario();
        Curso curso = new Curso();
        //Obtenemos el id del objeto que ya existe 
        curso.setId(5);
        
        String fecha = "14-08-2019 ";
        String fechafin = "15-09-2020 ";
        Date date = formatter.parse(fecha);
        Date datefin = formatter.parse(fechafin);
        calendario.setInicio(date);
        calendario.setFin(datefin);
        calendario.setCurso(curso);
   
		MvcResult resultado =mvc.perform(MockMvcRequestBuilders.post(url)).andReturn();
		//
		int status = resultado.getResponse().getStatus();
		assertTrue(status==200);
		String jsonRespuesta = resultado.getResponse().getContentAsString();
		ObjectMapper mapper = new ObjectMapper();
		
		List<Calendario> calendarios = mapper.readValue(jsonRespuesta, new TypeReference<List<Calendario>>() {});
		assertNotNull(calendarios); // que la lista no este vacia
		assertTrue(calendarios.size() > 0);
		for(Calendario calendario1 : calendarios) {
			assertTrue(calendario1.getInicio() != null);
		}
	}

	@Test
	public void testActualizar() {
		fail("Not yet implemented");
	}

	@Test
	public void testEliminar() {
		fail("Not yet implemented");
	}

}
