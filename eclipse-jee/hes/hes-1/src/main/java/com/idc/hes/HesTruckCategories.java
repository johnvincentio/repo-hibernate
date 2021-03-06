package com.idc.hes;

// Generated Mar 10, 2016 5:20:06 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * HesTruckCategories generated by hbm2java
 */
public class HesTruckCategories implements java.io.Serializable {

	private long id;
	private String displayText;
	private String seoName;
	private String imageUrl;
	private String imageAltText;
	private Integer seqNo;
	private Set<HesTruckCategoryPackages> hesTruckCategoryPackageses = new HashSet<HesTruckCategoryPackages>(
			0);

	public HesTruckCategories() {
	}

	public HesTruckCategories(long id, String displayText) {
		this.id = id;
		this.displayText = displayText;
	}

	public HesTruckCategories(long id, String displayText, String seoName,
			String imageUrl, String imageAltText, Integer seqNo,
			Set<HesTruckCategoryPackages> hesTruckCategoryPackageses) {
		this.id = id;
		this.displayText = displayText;
		this.seoName = seoName;
		this.imageUrl = imageUrl;
		this.imageAltText = imageAltText;
		this.seqNo = seqNo;
		this.hesTruckCategoryPackageses = hesTruckCategoryPackageses;
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

	public Set<HesTruckCategoryPackages> getHesTruckCategoryPackageses() {
		return this.hesTruckCategoryPackageses;
	}

	public void setHesTruckCategoryPackageses(
			Set<HesTruckCategoryPackages> hesTruckCategoryPackageses) {
		this.hesTruckCategoryPackageses = hesTruckCategoryPackageses;
	}

}
