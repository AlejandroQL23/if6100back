package cr.ac.ucr.sa.mainpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MySqlConnectionApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MySqlConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO `web_info_if6100`.`unidadesacademicas`(`id`,`nombre`) VALUES (?, ?)";		
		int result= jdbcTemplate.update(sql,"5","Escuela de recursos agrícolas");
	
		if(result>0) {
			System.out.println("a new row has been inserted");
		}else {
			System.out.println("nothing happens, check out the DB");
		}
	}

}
