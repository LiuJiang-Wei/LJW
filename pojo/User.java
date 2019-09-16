package com.bgs.maven.wineparty.pojo;


public class User {

  private int id;
  private String name;
  private String password;
  private String photo;
  private String address;
  private Integer pid;
  private String icon;
  private Integer isParent;

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", photo='" + photo + '\'' +
            ", address='" + address + '\'' +
            ", pid=" + pid +
            ", icon='" + icon + '\'' +
            ", isParent=" + isParent +
            '}';
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public void setIsParent(Integer isParent) {
    this.isParent = isParent;
  }

  public int getId() {

    return id;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  public String getPhoto() {
    return photo;
  }

  public String getAddress() {
    return address;
  }

  public Integer getPid() {
    return pid;
  }

  public String getIcon() {
    return icon;
  }

  public Integer getIsParent() {
    return isParent;
  }
}
