package be.soleas.bosquetwallon.model.logic.show;

import java.time.LocalDateTime;
import java.util.*;

import be.soleas.bosquetwallon.model.logic.scheduling.PerformanceSchedule;

/**
 * 
 */
public class Performance {
	
	private PerformanceSchedule schedule;
	//CALENDRIER : Une performance peut porter sur 2 semaines ! ex : dimacnche 23h à lundi 1h
	/**
	 * Default constructor
	 */
	public Performance() {
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