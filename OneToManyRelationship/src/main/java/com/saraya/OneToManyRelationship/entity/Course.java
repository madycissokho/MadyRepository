package com.saraya.OneToManyRelationship.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@OneToMany(mappedBy="course")
	private List<Review> reviews = new ArrayList<>();
	public Course() {
		super();
	}
	public Course(String name, LocalDateTime lastUpdatedDate, LocalDateTime createdDate) {
		super();
		this.name = name;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdDate = createdDate;
	}
	public Long getId() {
		return id;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public List<Review> getReviews() {
		return reviews;
	}
	public void addReview(Review reviews) {
		
		this.reviews.add(reviews);
	}
	public void removeReview(Review reviews) {
		this.reviews.remove(reviews);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", lastUpdatedDate=" + lastUpdatedDate + ", createdDate="
				+ createdDate + "]";
	}
	
	

}
