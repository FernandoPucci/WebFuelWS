package br.com.webfuel2.util.filters;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

public class CORSFilter implements ContainerResponseFilter {

	@Override
	public ContainerResponse filter(ContainerRequest containerRequest, ContainerResponse containerResponse) {
		ResponseBuilder responseBuilder = Response.fromResponse(containerResponse.getResponse());

		/*
		 * responseBuilder.header("Access-Control-Allow-Origin", "*");
		 * responseBuilder.header("Access-Control-Allow-Methods",
		 * "POST, GET, OPTIONS");
		 * responseBuilder.header("Access-Control-Allow-Headers",
		 * "origin, content-type, accept, authorization");
		 * responseBuilder.header("Access-Control-Max-Age", "86400");
		 */

		responseBuilder.header("Access-Control-Allow-Origin", "*");
		responseBuilder.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		responseBuilder.header("Access-Control-Allow-Credentials", "true");
		responseBuilder.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		responseBuilder.header("Access-Control-Max-Age", "86400");

		containerResponse.setResponse(responseBuilder.build());

		return containerResponse;
	}

}
