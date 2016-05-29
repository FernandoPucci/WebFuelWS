package br.com.webfuel2.util.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Component;

import br.com.webfuel2.util.constantes.Constantes;

/**
 * 
 * Classe utilitaria pra deserialização da Data java.util.date
 * 
 * @author fernando-pucci
 *
 */
@Component
public class DateDeserializer extends JsonDeserializer<Date> {

	@Override
	public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {

		SimpleDateFormat format = new SimpleDateFormat(Constantes.SHORT_DATE_FORMAT);
		String date = jsonParser.getText();

		try {

			return format.parse(date);

		} catch (ParseException | java.text.ParseException e) {

			throw new RuntimeException(e);

		}
	}
}
