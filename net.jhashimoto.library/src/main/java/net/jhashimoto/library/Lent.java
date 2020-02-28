/**
 *
 */
package net.jhashimoto.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.Builder;
import lombok.Value;

/**
 * @author Junichi
 *
 */

@Value
@Builder
public class Lent {
	public static final long LENT_LIMIT_DAYS = 14;

	private final LocalDate startDate;

	public long getDelayDays() {
		var lentLimitDate = startDate.plusDays(LENT_LIMIT_DAYS);
		long days = ChronoUnit.DAYS.between(lentLimitDate, LocalDate.now());
		return days;
	}
}
