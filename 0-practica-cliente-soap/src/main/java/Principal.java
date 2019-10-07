import java.math.BigDecimal;

import org.tempuri.Converter;
import org.tempuri.ConverterSoap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConverterSoap servicio = new Converter().getConverterSoap();
		BigDecimal resultado = servicio.getConversionAmount("USD", "MXN", "2019-10-07T00:00:00", new BigDecimal(100));
		
		System.out.println(resultado);

	}

}
