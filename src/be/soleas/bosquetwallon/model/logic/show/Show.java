package be.soleas.bosquetwallon.model.logic.show;

import java.util.*;

import be.soleas.bosquetwallon.model.logic.booking.BookingTheater;
import be.soleas.bosquetwallon.model.logic.user.Artist;

/**
 * 
 */
public class Show {
	
	private BookingTheater owner;
	
	private String title;
	private List<Artist> artists = new ArrayList<Artist>();
	private Configuration configuration;
	private List<Performance> performances = new ArrayList<Performance>();

	/**
	 * Default constructor
	 */
	public Show(BookingTheater owner, String title, List<Artist> artists, Configuration configuration) {
		SetOwner(owner);
		SetTitle(title);
		SetArtists(artists);
		SetConfiguration(configuration);
	}
	
	public Show(BookingTheater owner, String title, List<Artist> artists, Configuration configuration, List<Performance> performances) {
		this(owner, title, artists, configuration);
		SetPerformances(performances);
	}
	
	private void SetOwner(BookingTheater owner) {
		this.owner = owner;
	}
	
	public BookingTheater GetOwner() {
		return owner;
	}

	public String GetTitle() {
		return title;
	}

	public void SetTitle(String title) {
		this.title = title;
	}

	public List<Artist> GetArtists() {
		return artists;
	}

	public void SetArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public Configuration GetConfiguration() {
		return configuration;
	}

	public void SetConfiguration(Configuration configuration) {
		if(configuration.IsModel())
			this.configuration = (Configuration) configuration.clone();
		else
			this.configuration = configuration;
	}

	public List<Performance> GetPerformances() {
		return performances;
	}

	public void SetPerformances(List<Performance> performances) {
		this.performances = performances;
	}
	
	public void AddArtist(Artist artist) {
		artists.add(artist);
	}
	
	public void RemoveArtist(Artist artist) {
		if(artists.contains(artist))
			artists.remove(artist);
	}
	
	public boolean AddPerformance(Performance performance) {
		if(! performance.GetSchedule().Relate(GetOwner().GetSchedule()).IsContained())
			return false;

		//TimeLength.Relate on all performances "of" BookingTheater can be heavy, so we make a shortlisting of "suspect" performances
		/*
		List<Performance> concurrentPerformances = new ArrayList<Performance>();
		
		Predicate<Performance> concurrent = ... ;
		
		for(Show s : GetOwner().GetShows()) {
			concurrentPerformances.addAll((ArrayList<Performance>) s.GetPerformances().stream().filter(concurrent).collect(Collectors.toList()));
		}
		
		for(Performance p : concurrentPerformances) {
			boolean intersect = performance.GetSchedule().Relate(p.GetSchedule()).IsIntersect();
			if(intersect)
				return false;
		}*/

		for(Show s : GetOwner().GetShows()) {
			for(Performance p : s.GetPerformances()) {
				boolean intersect = performance.GetSchedule().Relate(p.GetSchedule()).IsIntersect();
				if(intersect)
					return false;
			}
		}
		
		performances.add(performance);
		return true;
	}
	
	public void RemovePerformance(Performance performance) {
		if(performances.contains(performance))
			performances.remove(performance);
	}
	
	

	







}