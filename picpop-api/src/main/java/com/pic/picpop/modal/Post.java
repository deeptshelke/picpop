package com.pic.picpop.modal;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

import com.pic.picpop.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="post")

public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    private Integer id;
	private String caption;
	private LocalDateTime createdAt;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="user_id")),
		@AttributeOverride(name="email",column=@Column(name="user_email"))
		
	})        
    private UserDto user;
	
	@OneToMany
	private List<Comment> comments=new ArrayList<Comment>();
	@Embedded
	@ElementCollection
	@JoinTable(name="likedByUsers",joinColumns = @JoinColumn(name="user_id"))
	private Set<UserDto> likeByUsers = new HashSet<>();
	
	public Post(Integer id, String caption, LocalDateTime createdAt, UserDto user, List<Comment> comments,
			Set<UserDto> likeByUsers) {
		super();
		this.id = id;
		this.caption = caption;
		this.createdAt = createdAt;
		this.user = user;
		this.comments = comments;
		this.likeByUsers = likeByUsers;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Set<UserDto> getLikeByUsers() {
		return likeByUsers;
	}
	public void setLikeByUsers(Set<UserDto> likeByUsers) {
		this.likeByUsers = likeByUsers;
	}
	
	
	
	
	
}
