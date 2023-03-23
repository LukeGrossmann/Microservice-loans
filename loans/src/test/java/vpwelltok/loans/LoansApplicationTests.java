package vpwelltok.loans;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
@ComponentScans({ @ComponentScan("vpwelltok.loans.controller") })
@EnableJpaRepositories("vpwelltok.loans.repository")
@EntityScan("vpwelltok.loans.model")
class LoansApplicationTests {

	@Test
	void contextLoads() {
	}

}
