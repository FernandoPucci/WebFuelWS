package br.com.webfuel.testers;

import br.com.webfuel.controller.TesteController;

public class TesteTesters {

	public static void main(String[] args) {

		try{
			
		
		testInsertTesteTester("teste numero1");
		
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		ex.printStackTrace();
		
		}
	}

	private static void testInsertTesteTester(String description)throws Exception{
		
		TesteController testeController = new TesteController();
		
		testeController.insertTesteController(description);
		
		
	}

}
