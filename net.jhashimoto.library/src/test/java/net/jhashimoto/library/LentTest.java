/**
 *
 */
package net.jhashimoto.library;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Junichi
 *
 */
class LentTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * {@link net.jhashimoto.library.Lent#getStartDate()} のためのテスト・メソッド。
	 */
	@Test
	void testGetDelayDate() {
		var lent = Lent.builder().startDate(LocalDate.now().minusDays(Lent.LENT_LIMIT_DAYS).minusDays(4)).build();
		assertEquals(4, lent.getDelayDays());
	}

}
