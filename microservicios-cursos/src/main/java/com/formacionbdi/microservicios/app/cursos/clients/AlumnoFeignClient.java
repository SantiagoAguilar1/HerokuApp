package com.formacionbdi.microservicios.app.cursos.clients;


import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "microservicio-usuarios")
public interface AlumnoFeignClient {

	
}
