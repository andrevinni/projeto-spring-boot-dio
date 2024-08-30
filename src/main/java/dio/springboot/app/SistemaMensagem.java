package dio.springboot.app;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

	@Value("${nome:NoReply-DIO}")
	private String nome;
	
	@Value("${email}")
	private String email;
	
	@Value("${telefones}")
	private List<Long> telefones = new ArrayList<>();
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mensagem enviada por: " + nome 
				+ "\nE-mail: " + email 
				+ "\nCom Telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
		
	}

}
