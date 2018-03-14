package com.coderbd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 
 * @author Mohmmmad Rajaul Islam @note, we have decided that one user can have
 *         only one role so Relation between user and role entity will
 *         be @ManyToOne
 */
@Entity // Hibernate will create table automatically
@Table(name = "user", uniqueConstraints=
@UniqueConstraint(columnNames={"email", "role_id"})
) // Table name will be user at Database
public class User {
	@Id // We must need to declare id
	@GeneratedValue(strategy = GenerationType.AUTO) // id will generate auto increment in database
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	/**
	 * @note, we have decided that one user can have only one role so Relation
	 * between user and role entity will be @ManyToOne
	 */
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;

	public User() {
		super();
	}

	public User(String name, String email, Role role) {
		super();
		this.name = name;
		this.email = email;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", role=" + role + "]";
	}

}
