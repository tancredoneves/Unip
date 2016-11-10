package br.com.caelum.livraria.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmail {
	
	HtmlEmail htmlEmail;
	
	public void enviarEmail(String email, String mensagem) throws EmailException{
		htmlEmail = new HtmlEmail();
		
		htmlEmail.setDebug(true);  
		htmlEmail.setHostName("smtp.gmail.com");  
		htmlEmail.setAuthentication("resolutionltda@gmail.com","senhadoemail");  
		htmlEmail.setSSL(true);  
		htmlEmail.addTo(email); 
		htmlEmail.setFrom("resolutionltda@gmail.com"); //será passado o email que você fará a autenticação 
		htmlEmail.setSubject("Enviando email");  
		htmlEmail.setMsg("Teste de envio de email");  
		htmlEmail.send();  	
	}
	
	
	

}
