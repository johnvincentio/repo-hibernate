package com.idc.hes;

// Generated Mar 10, 2016 5:20:06 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * HesVehicleCategories generated by hbm2java
 */
public class HesVehicleCategories implements java.io.Serializable {

	private long id;
	private String displayText;
	private String seoName;
	private String imageUrl;
	private String imageAltText;
	private Integer seqNo;
	private Set<HesVehicleCategoryItems> hesVehicleCategoryItemses = new HashSet<HesVehicleCategoryItems>(
			0);

	public HesVehicleCategories() {
	}

	public HesVehicleCategories(long id, String displayText) {
		this.id = id;
		this.displayText = displayText;
	}

	public HesVehicleCategories(long id, String displayText, String seoName,
			String imageUrl, String imageAltText, Integer seqNo,
			Set<HesVehicleCategoryItems> hesVehicleCategoryItemses) {
		this.id = id;
		this.displayText = displayText;
		this.seoName = seoName;
		this.imageUrl = imageUrl;
		this.imageAltText = imageAltText;
		this.seqNo = seqNo;
		this.hesVehicleCategoryItemses = hesVehicleCategoryItemses;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDisplayText() {
		return this.displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public String getSeoName() {
		return this.seoName;
	}

	public void setSeoName(String seoName) {
		this.seoName = seoName;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageAltText() {
		return this.imageAltText;
	}

	public void setImageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
	}

	public Integer getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	public Set<HesVehicleCategoryItems> getHesVehicleCategoryItemses() {
		return this.hesVehicleCategoryItemses;
	}

	public void setHesVehicleCategoryItemses(
			Set<HesVehicleCategoryItems> hesVehicleCategoryItemses) {
		this.hesVehicleCategoryItemses = hesVehicleCategoryItemses;
	}

}
