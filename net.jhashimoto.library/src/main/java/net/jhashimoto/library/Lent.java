/**
 *
 */
package net.jhashimoto.library;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Value;

/**
 * @author Junichi
 *
 */

@Value
@Builder
public class Lent {
	private final LocalDate startDate;
}
