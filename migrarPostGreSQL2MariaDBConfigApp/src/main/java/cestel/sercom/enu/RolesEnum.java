package cestel.sercom.enu;

import java.util.Arrays;
import java.util.Optional;

import lombok.Getter;

@Getter

public enum RolesEnum {
	AGENT(1,100L,"Agent","Solo ve algunas caracteristicas de la aplicacion"), 
	SUPERVISOR(2,200L,"Supervisor","Solo ve algunas caracteristicas de la aplicacion y las del agente"), 
	DOM_ADMIN(3,300L,"Domain Admin","Ve partes de la aplicacion mas lo de Agente y Supervisor"),
	SYS_ADMIN(4,400L,"System Admin","ve toda la aplicacion");

	private final long id;
	
	private final int code;

	private final String descripcion;
	
	private final String definicion;

	RolesEnum(int code,long id, String descripcion, String definicion) {
		this.id = id;
		this.code = code;
		this.descripcion = descripcion;
		this.definicion=definicion;
	}


	public long toId() {
		return id;
	}
	
	public static Optional<RolesEnum> findByCode(int code) {
		return Arrays.stream(values()).filter(cod -> cod.getCode() == code).findFirst();
	}
	
	
	public static int size() {
		return RolesEnum.values().length;
	}
	
	
	
}
