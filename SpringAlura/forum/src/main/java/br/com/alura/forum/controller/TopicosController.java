package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

//RestController indica que todo método terá um @ResponseBody
@RestController
public class TopicosController {
	
	@RequestMapping("/topicos") //mapeia o endpoint
	//@ResponseBody // indica que o retorno será devolvido como resposta
	public List<TopicoDto> lista() {
		//carrega a lista com todos os tópicos e devolve ela pra quem chamo
		
		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		
		//por padrão retorna a lista no formato JSON
		//o spring usa o Jackson pra converter pra JSON e devolve como string
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
				
	}

}
