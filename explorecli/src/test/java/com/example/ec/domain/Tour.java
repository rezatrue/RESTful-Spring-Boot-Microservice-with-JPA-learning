package com.example.ec.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tour implements Serializable{
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String title;
	@Column(length = 2000)
	private String description;
	@Column(length = 2000)
	private String blurb;
	@Column
	private Integer price;
	@Column
	private String duration;
	@Column
	private String bullets;
	@Column
	private String keywords;
	@ManyToOne
	private TourPackage tourPackage;
	@Column
	private Defficulty defficulty;
	@Column
	private Region region;
	
	public Tour(Integer id, String title, String description, String blurb, Integer price, String duration,
			String bullets, String keywords, TourPackage tourPackage, Defficulty defficulty, Region region) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.blurb = blurb;
		this.price = price;
		this.duration = duration;
		this.bullets = bullets;
		this.keywords = keywords;
		this.tourPackage = tourPackage;
		this.defficulty = defficulty;
		this.region = region;
	}

	protected Tour() {
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getBlurb() {
		return blurb;
	}

	public Integer getPrice() {
		return price;
	}

	public String getDuration() {
		return duration;
	}

	public String getBullets() {
		return bullets;
	}

	public String getKeywords() {
		return keywords;
	}

	public TourPackage getTourPackage() {
		return tourPackage;
	}

	public Defficulty getDefficulty() {
		return defficulty;
	}

	public Region getRegion() {
		return region;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", title=" + title + ", description=" + description + ", blurb=" + blurb + ", price="
				+ price + ", duration=" + duration + ", bullets=" + bullets + ", keywords=" + keywords
				+ ", tourPackage=" + tourPackage + ", defficulty=" + defficulty + ", region=" + region + "]";
	}
	
	
	
	

}
