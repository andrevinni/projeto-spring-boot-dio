package dio.springboot.app;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

	@Autowired
	private Remetente remetente;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mensagem enviada por: " +  remetente.getNome()
				+ "\nE-mail: " + remetente.getEmail()
				+ "\nCom Telefones para contato: " + remetente.getTelefones());
		System.out.println("Seu cadastro foi aprovado");
		
	}

}
