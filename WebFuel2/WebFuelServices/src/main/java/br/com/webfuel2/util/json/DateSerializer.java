package br.com.webfuel2.util.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.springframework.stereotype.Component;

import br.com.webfuel2.util.constantes.Constantes;

/**
 * Classe utilitaria pra Serialização da Data java.util.date pra fins de
 * exibição
 * 
 * @author fernando-pucci
 *
 */
@Component
public class DateSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {

		SimpleDateFormat dateFormat = new SimpleDateFormat(Constantes.FULL_DATE_FORMAT);

		String dateString = dateFormat.format(date.getTime());

		System.out.println(dateString);

		jsonGenerator.writeString(dateString);
	}
}
