package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Show implements Serializable{
	private static final long serialVersionUID = 7787170877756499146L;
	
	
	/**
	 * les attributs de la classe
	 */
	private int IDShow;
	private String title;
	private Representation representation_show_fk;
	private PlanningOfRoom planning_show_fk;
	private Organizer Organizer_show_fk;
	private Set<Configuration> listConfiguration = new HashSet<>();
	private Set<Representation> listRepresentation = new HashSet<>();
	
	/*********************************************************************************************/
	/**
	 * les constructeurs de la classe
	 */
	public Show() {
		
	}
	public Show(int iDShow, String title, Representation representation_show_fk, PlanningOfRoom planning_show_fk,
			Organizer organizer_show_fk) {
		super();
		IDShow = iDShow;
		this.title = title;
		this.representation_show_fk = representation_show_fk;
		this.planning_show_fk = planning_show_fk;
		Organizer_show_fk = organizer_show_fk;
	}
	
	
	/*********************************************************************************************/
	/**
	 * les getters et les setters
	 */
	
	public int getIDShow() {
		return IDShow;
	}
	public String getTitle() {
		return title;
	}
	public Representation getRepresentation_show_fk() {
		return representation_show_fk;
	}
	public PlanningOfRoom getPlanning_show_fk() {
		return planning_show_fk;
	}
	public Organizer getOrganizer_show_fk() {
		return Organizer_show_fk;
	}
	public Set<Configuration> getListConfiguration() {
		return listConfiguration;
	}
	public Set<Representation> getListRepresentation() {
		return listRepresentation;
	}
	public void setIDShow(int iDShow) {
		IDShow = iDShow;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setRepresentation_show_fk(Representation representation_show_fk) {
		this.representation_show_fk = representation_show_fk;
	}
	public void setPlanning_show_fk(PlanningOfRoom planning_show_fk) {
		this.planning_show_fk = planning_show_fk;
	}
	public void setOrganizer_show_fk(Organizer organizer_show_fk) {
		Organizer_show_fk = organizer_show_fk;
	}
	public void setListConfiguration(Set<Configuration> listConfiguration) {
		this.listConfiguration = listConfiguration;
	}
	public void setListRepresentation(Set<Representation> listRepresentation) {
		this.listRepresentation = listRepresentation;
	}
	
	@Override
	public String toString() {
		return "Show [IDShow=" + IDShow + ", title=" + title + ", representation_show_fk=" + representation_show_fk
				+ ", planning_show_fk=" + planning_show_fk + ", Organizer_show_fk=" + Organizer_show_fk
				+ ", listConfiguration=" + listConfiguration + ", listRepresentation=" + listRepresentation + "]";
	}

}
