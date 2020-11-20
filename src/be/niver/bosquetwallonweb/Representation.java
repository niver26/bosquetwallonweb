package be.niver.bosquetwallonweb;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Representation implements Serializable{
	private static final long serialVersionUID = 7787170877756499146L;
	/***
	 * attributs de la classe
	 */
	private int IDRepresentation;
	private Date BiginTime;
	private Date EndTime;
	private Place place_representation_fk;
	private Set<Show> listShow = new HashSet<>();
	
	
	/***********************************************************************/
	/***
	 * les constructeurs de la classe
	 */
	public Representation() {
		
	}
	
	public Representation(int iDRepresentation, Date biginTime, Date endTime, Place place_representation_fk) {
		super();
		IDRepresentation = iDRepresentation;
		BiginTime = biginTime;
		EndTime = endTime;
		this.place_representation_fk = place_representation_fk;
	}
	
	/*********************************************************************************/
	/***
	 * les getters et les setters de la classe
	 * @return
	 */
	public int getIDRepresentation() {
		return IDRepresentation;
	}

	public Date getBiginTime() {
		return BiginTime;
	}

	public Date getEndTime() {
		return EndTime;
	}

	public Place getPlace_representation_fk() {
		return place_representation_fk;
	}

	public Set<Show> getListShow() {
		return listShow;
	}

	public void setIDRepresentation(int iDRepresentation) {
		IDRepresentation = iDRepresentation;
	}

	public void setBiginTime(Date biginTime) {
		BiginTime = biginTime;
	}

	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}

	public void setPlace_representation_fk(Place place_representation_fk){
		this.place_representation_fk = place_representation_fk;
	}

	public void setListShow(Set<Show> listShow){
		this.listShow = listShow;
	}
	
	/**********************************************************************************************/
	/***
	 * les fonctions de la classe
	 */
	
	@Override
	public String toString() {
		return "Representation [IDRepresentation=" + IDRepresentation + ", BiginTime=" + BiginTime + ", EndTime="
				+ EndTime + ", place_representation_fk=" + place_representation_fk + ", listShow=" + listShow + "]";
	}
	
	

}
