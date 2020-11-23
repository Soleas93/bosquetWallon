package be.soleas.bosquetwallon.model.logic.show;

import java.time.LocalDateTime;
import be.soleas.bosquetwallon.model.logic.scheduling.PerformanceSchedule;

/**
 * 
 */
public class Performance {
	
	private Show owner;
	private PerformanceSchedule schedule;
	//CALENDRIER : Une performance peut porter sur 2 semaines ! ex : dimanche 23h à lundi 1h
	/**
	 * Default constructor
	 */
	public Performance(Show owner, PerformanceSchedule schedule) {
		SetShow(owner);
		SetSchedule(schedule);
	}
	
	private void SetShow(Show owner) {
		this.owner = owner;
	}
	
	private void SetSchedule(PerformanceSchedule schedule) {
		this.schedule = schedule;
	}
	
	public Show GetShow() {
		return owner;
	}
	
	public PerformanceSchedule GetSchedule() {
		return schedule;
	}
	
	public LocalDateTime GetOpenDoor() {
		return schedule.GetBegin();
	}
	
	public LocalDateTime GetBeginShow() {
		return schedule.GetBeginShow();
	}
	
	public LocalDateTime GetEndShow() {
		return schedule.GetEnd();
	}
	
	





}