package be.soleas.bosquetwallon.model.logic.scheduling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 
 */
public class InstantTimeLength extends TimeLength {
	
	private LocalDateTime instant;
	
	public InstantTimeLength(LocalDateTime instant) {
		this.instant = instant;
	}

	@Override
	public LocalDateTime GetBegin() {
		return instant;
	}

	@Override
	public LocalDateTime GetEnd() {
		return instant;
	}

	@Override
	public LocalDate GetBeginDate() {
		return instant.toLocalDate();
	}

	@Override
	public LocalDate GetEndDate() {
		return instant.toLocalDate();
	}

	@Override
	public LocalTime GetBeginTime() {
		return instant.toLocalTime();
	}

	@Override
	public LocalTime GetEndTime() {
		return instant.toLocalTime();
	}

}
