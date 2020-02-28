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
class MemberTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * {@link net.jhashimoto.library.Member#getAvailableLentCount()} のためのテスト・メソッド。
	 */
	@Test
	void testGetAvailableLentCount() {
		var member = Member.builder()
						.lent(Lent.builder().startDate(LocalDate.now().minusDays(Lent.LENT_LIMIT_DAYS).minusDays(4)).build())
						.memberKinds(MemberKinds.Child)
						.build();

		assertEquals(4, member.getAvailableLentCount());
	}
}
