package com.aptkode.example.firestore;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class FireStoreTestApplication {


	

	    public static void main(String[] args) {
	        SpringApplication.run(FireStoreTestApplication.class, args);
	    }
	    
	    @Bean
		public RouterFunction<ServerResponse> indexRouter(
				@Value("classpath:/static/index.html") final Resource indexHtml) {

			// Serve static index.html at root, for convenient message publishing.
			return route(
					GET("/"),
					request -> ok().contentType(MediaType.TEXT_HTML).bodyValue(indexHtml));
		}

}
