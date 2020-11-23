package be.soleas.bosquetwallon.model.logic.scheduling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 
 */
public class DateTimeLength extends TimeLength {
	/**
	 * 
	 */
	private LocalDateTime beginDateTime;

	/**
	 * 
	 */
	private LocalDateTime endDateTime;
	
	/**
	 * Default constructor
	 * @throws Exception 
	 */
	public DateTimeLength(LocalDateTime begin, LocalDateTime end) throws Exception {
		if(begin.compareTo(end) >= 0)
			throw new Exception("begin must be antecedent to end.");
		beginDateTime = begin;
		endDateTime = end;
	}
	
	@Override
	public LocalDateTime GetBegin() {
		return beginDateTime;
	}

	@Override
	public LocalDateTime GetEnd() {
		return endDateTime;
	}


	/**
	 * @return
	 */
	@Override
	public LocalDate GetBeginDate() {
		return beginDateTime.toLocalDate();
	}

	/**
	 * @return
	 */
	@Override
	public LocalDate GetEndDate() {
		return endDateTime.toLocalDate();
	}

	/**
	 * @return
	 */
	@Override
	public LocalTime GetBeginTime() {
		return beginDateTime.toLocalTime();
	}

	/**
	 * @return
	 */
	@Override
	public LocalTime GetEndTime() {
		return endDateTime.toLocalTime();
	}
}