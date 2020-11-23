package be.soleas.bosquetwallon.model.logic.scheduling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
	public abstract LocalDateTime GetBegin();

	/**
	 * @return
	 */
	public abstract LocalDateTime GetEnd();
	
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
	 * @throws Exception 
	 */
	public final static DurationRelation Relate(TimeLength first, TimeLength second) throws Exception {
		
		int bbCompare = first.GetBegin().compareTo(second.GetBegin());
		int beCompare = first.GetBegin().compareTo(second.GetEnd());
		int ebCompare = first.GetEnd().compareTo(second.GetBegin());
		int eeCompare = first.GetEnd().compareTo(second.GetEnd());
		int fCompare = first.GetBegin().compareTo(first.GetEnd());
		int sCompare = second.GetBegin().compareTo(second.GetEnd());
		
		if(fCompare > 0 || sCompare > 0)
			throw new Exception("At least one of the compared TimeLength has not ordered Begin and End ");
		
		if (bbCompare < 0) {
			if(ebCompare < 0) 
				return DurationRelation.Previous;
			else if(ebCompare == 0)
				return DurationRelation.EndGlued;
			else if(eeCompare < 0) 
				return DurationRelation.EndCrossed;
			else //eeCompare >= 0
				return DurationRelation.Outside;
				
		}
		else if (bbCompare > 0) {
			if(beCompare > 0) 
				return DurationRelation.Next;
			else if(beCompare == 0)
				return DurationRelation.BeginGlued;
			else if(eeCompare > 0) 
				return DurationRelation.BeginCrossed;
			else //eeCompare <= 0
				return DurationRelation.Inside;
		}
		else { //bbCompare == 0
			if(fCompare == 0)
				return DurationRelation.EndGlued;
			if(sCompare == 0)
				return DurationRelation.BeginGlued;
			if(eeCompare == 0)
				return DurationRelation.Equal;
			else if (eeCompare < 0)
				return DurationRelation.Inside;
			else //eeCompare > 0
				return DurationRelation.Outside;
		}
		
	}
	
	public final DurationRelation Relate (TimeLength to) throws Exception {
		return Relate(this, to);
	}
}