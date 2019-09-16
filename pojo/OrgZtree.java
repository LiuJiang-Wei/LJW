package com.bgs.maven.wineparty.pojo;


public class OrgZtree {

  private Integer id;
  private String name;
  private Integer pid;
  private String icon;
  private Integer isParent;

    @Override
    public String toString() {
        return "OrgZtree{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", icon='" + icon + '\'' +
                ", isParent=" + isParent +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getId() {

        return id;
    }

    public String getName() {
        return name;
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
