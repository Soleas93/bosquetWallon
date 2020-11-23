package be.soleas.bosquetwallon.model.logic.scheduling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 
 */
public class PerformanceSchedule extends TimeLength {

	private TimeLength baseSchedule;
	private InstantTimeLength beginShow;
	
	public PerformanceSchedule(LocalDateTime openDoor, LocalDateTime beginShow, LocalDateTime endShow) throws Exception {
		
		int compareDate = openDoor.toLocalDate().compareTo(endShow.toLocalDate());
		if(compareDate == 0)
			baseSchedule = new DayTimeLength(openDoor.toLocalDate(), openDoor.toLocalTime(), endShow.toLocalTime());
		else
			baseSchedule = new DateTimeLength(openDoor, endShow);
		
		this.beginShow = new InstantTimeLength(beginShow);
		DurationRelation showStart = this.beginShow.Relate(baseSchedule);
		
		if(!showStart.IsPart())
			throw new Exception("beginShow must be in the inclusive interval of [openDoor; endShow]");
	}	

	@Override
	public LocalDateTime GetBegin() {
		return baseSchedule.GetBegin();
	}

	@Override
	public LocalDateTime GetEnd() {
		return baseSchedule.GetEnd();
	}

	@Override
	public LocalDate GetBeginDate() {
		return baseSchedule.GetBeginDate();
	}

	@Override
	public LocalDate GetEndDate() {
		return baseSchedule.GetEndDate();
	}

	@Override
	public LocalTime GetBeginTime() {
		return baseSchedule.GetBeginTime();
	}

	@Override
	public LocalTime GetEndTime() {
		return baseSchedule.GetEndTime();
	}
	
	public LocalDateTime GetBeginShow() {
		return beginShow.GetBegin();
	}

}