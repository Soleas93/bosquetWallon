package be.soleas.bosquetwallon.model.logic.scheduling;

/**
 * 
 */
public enum DurationRelation {
	Inside,
	Outside,
	Equal,
	BeginCrossed,
	EndCrossed,
	BeginGlued,
	EndGlued,
	Previous,
	Next;
	
	public DurationRelation Reverse(){ //Réciproque
		switch(this) {
		case Inside : return DurationRelation.Outside;
		case Outside : return DurationRelation.Inside;
		case Equal : return this;
		case BeginCrossed : return DurationRelation.EndCrossed;
		case EndCrossed : return DurationRelation.BeginCrossed;
		case BeginGlued : return DurationRelation.EndGlued;
		case EndGlued : return DurationRelation.BeginGlued;
		case Previous : return DurationRelation.Next;
		case Next : return DurationRelation.Previous;
		default : return null;
		}
	}
	
	public boolean IsCrossed() {
		return (this == DurationRelation.BeginCrossed || this == DurationRelation.EndCrossed)? true : false;
	}
	public boolean IsGlued() {
		return (this == DurationRelation.BeginGlued || this == DurationRelation.EndGlued)? true : false;
	}
	
	public boolean IsIntersect() {
		switch(this){
			case Inside, Outside, Equal, BeginCrossed, EndCrossed :
				return true;
			default :
				return false;
		}
	}
	
	//Like IsContained but for InstantTimeLength
	public boolean IsPart() {
		switch(this){
		case Inside, BeginGlued, EndGlued :
			return true;
		default :
			return false;
	}
	}
	
	public boolean IsContained() {
		if(this == DurationRelation.Inside)
			return true;
		return false;
	}
	
	public boolean IsContainer() {
		if(this == DurationRelation.Outside)
			return true;
		return false;
	}
	
	public boolean IsEqual() {
		if(this == DurationRelation.Equal)
			return true;
		return false;
	}
}