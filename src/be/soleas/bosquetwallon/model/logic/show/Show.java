package be.soleas.bosquetwallon.model.logic.show;

import java.util.*;

import be.soleas.bosquetwallon.model.logic.user.Artist;

/**
 * 
 */
public class Show {
	
	private String title;
	private List<Artist> artists = new ArrayList<Artist>();
	private Configuration configuration;
	private List<Performance> performances = new ArrayList<Performance>();

	/**
	 * Default constructor
	 */
	public Show(String title, List<Artist> artists, Configuration configuration) {
		SetTitle(title);
		SetArtists(artists);
		SetConfiguration(configuration);
	}
	
	public Show(String title, List<Artist> artists, Configuration configuration, List<Performance> performances) {
		this(title, artists, configuration);
		SetPerformances(performances);
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
	
	public void AddPerformance(Performance performance) {
		performances.add(performance);
	}
	
	public void RemovePerformance(Performance performance) {
		if(performances.contains(performance))
			performances.remove(performance);
	}
	
	

	







}