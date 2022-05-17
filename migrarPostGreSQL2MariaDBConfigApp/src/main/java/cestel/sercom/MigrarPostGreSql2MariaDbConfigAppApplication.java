package cestel.sercom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import cestel.sercom.post.model.EjecutaMigracion;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class MigrarPostGreSql2MariaDbConfigAppApplication implements CommandLineRunner{

	
	@Autowired
	private EjecutaMigracion ejecutaMigracion;
//	
	public static void main(String[] args) {
		SpringApplication.run(MigrarPostGreSql2MariaDbConfigAppApplication.class, args);
	}
	 @Override
	    public void run(String...args) throws Exception {
		 ejecutaMigracion.ejecutarMigracion();
	    }
	

}

