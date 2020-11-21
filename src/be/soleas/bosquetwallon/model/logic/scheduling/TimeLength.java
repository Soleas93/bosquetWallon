package be.soleas.bosquetwallon.model.logic.scheduling;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * 
 */
public abstract class TimeLength {

	/**
	 * Default constructor
	 */
	public TimeLength() {
	}



	/**
	 * @return
	 */
	public abstract LocalDate GetBeginDate();

	/**
	 * @return
	 */
	public abstract LocalDate GetEndDate();

	/**
	 * @return
	 */
	public abstract LocalTime GetBeginTime();

	/**
	 * @return
	 */
	public abstract LocalTime GetEndTime();

	/**
	 * @param first 
	 * @param second 
	 * @return
	 */
	public static DurationRelation Relate(TimeLength first, TimeLength second) {
		// TODO implement here
		return null;
	}

}