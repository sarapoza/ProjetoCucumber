package StepDefs;
import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import converters.DateConverter;
import cucumber.api.Transform;
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
	public void valorContadorAtual(int arg1) throws Throwable {
	   contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
	    contador = contador + arg1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void valorContadorSerá(int arg1) throws Throwable {
	   System.out.println(arg1);
	   System.out.println(contador);
	   assertEquals(arg1,contador);
	}
	
	Date entrega = new Date();
	
	@Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaEDia(int dia, int mes, int ano) throws Throwable {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.DAY_OF_MONTH, dia);
	    cal.set(Calendar.MONTH, mes -1);
	    cal.set(Calendar.YEAR, ano);
	    entrega = cal.getTime();
	}
	
//	@Dado("^que a entrega é dia (\\*d)$")
//	public void queAEntregaEDia(@Transform(DateConverter.class) Date data) throws Throwable {
//	   entrega = data;
//	   System.out.println(entrega);
//	}

	@Quando("^a entrega atrasar (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarDias(int arg1, String tempo) throws Throwable {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(entrega);
	    if(tempo.equals("dias")) {
	    	cal.add(Calendar.DAY_OF_MONTH, arg1);
	    }
	    if(tempo.equals("meses")) {
	    	cal.add(Calendar.MONTH, arg1);
	    }
	    entrega = cal.getTime();
	}

	@Então("^a entrega será efetuada em (\\d{2}/\\d{2}/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		assertEquals(data, dataFormatada);
	}
}
