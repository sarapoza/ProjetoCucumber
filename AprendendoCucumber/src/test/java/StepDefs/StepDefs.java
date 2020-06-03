package StepDefs;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepDefs {
	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
	    System.out.println("teste");
	}

	@Quando("^executa-lo$")
	public void executa_lo() throws Throwable {
	    System.out.println("teste");
	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	private int contador = 0;
	@Dado("^que o valor do contador é (\\d+)$")
	public void que_o_valor_do_contador_é(int arg1) throws Throwable {
	   contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int arg1) throws Throwable {
	    contador = contador + arg1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void o_valor_do_contador_será(int arg1) throws Throwable {
	   System.out.println(arg1);
	   System.out.println(contador);
	}
}
