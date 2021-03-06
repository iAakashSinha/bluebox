package com.tothenew.bluebox.bluebox.enitity.user;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

  @Id
  @GeneratedValue
  Integer id;
  String authority;

  @ManyToMany(mappedBy = "roles")
  private List<User> user;

  //	Default Constructor
  public Role() {
  }

  //	Getters and Setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public List<User> getUser() {
    return user;
  }

  public void setUser(List<User> user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Role{" +
        "id=" + id +
        ", authority='" + authority + '\'' +
        '}';
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
