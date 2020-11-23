package be.soleas.bosquetwallon.model.logic.scheduling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 
 */
public class DayTimeLength extends TimeLength {

	/**
	 * 
	 */
	private LocalDate date;

	/**
	 * 
	 */
	private LocalTime beginTime;

	/**
	 * 
	 */
	private LocalTime endTime;
	
	/**
	 * Default constructor
	 * @throws Exception 
	 */
	public DayTimeLength(LocalDate date, LocalTime begin, LocalTime end) throws Exception {
		if(begin.compareTo(end) >= 0)
			throw new Exception("Begin must be antecedent to end.");
		this.date = date;
		beginTime = begin;
		endTime = end;
	}


	
	@Override
	public LocalDateTime GetBegin() {
		return LocalDateTime.of(date, beginTime);
	}

	@Override
	public LocalDateTime GetEnd() {
		return LocalDateTime.of(date, endTime);
	}

	/**
	 * @return
	 */
	public LocalDate GetBeginDate() {
		return date;
	}

	/**
	 * @return
	 */
	public LocalDate GetEndDate() {
		return date;
	}

	/**
	 * @return
	 */
	public LocalTime GetBeginTime() {
		return beginTime;
	}

	/**
	 * @return
	 */
	public LocalTime GetEndTime() {
		return endTime;
	}

	

}