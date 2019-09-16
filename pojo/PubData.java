package com.bgs.maven.wineparty.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PubData {

  private String pubId;
  private String pubName;
  private Integer pubCount;
  private Integer pubPractical;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date pubStratTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date pubStopTime;
  private Integer pubRate;
  private Integer pubNew;
  private Integer pubOld;
  private Integer pubIntention;
  private Integer pubEstimate;


  @Override
  public String toString() {
    return "PubData{" +
            "pubId='" + pubId + '\'' +
            ", pubName='" + pubName + '\'' +
            ", pubCount=" + pubCount +
            ", pubPractical=" + pubPractical +
            ", pubStratTime=" + pubStratTime +
            ", pubStopTime=" + pubStopTime +
            ", pubRate=" + pubRate +
            ", pubNew=" + pubNew +
            ", pubOld=" + pubOld +
            ", pubIntention=" + pubIntention +
            ", pubEstimate=" + pubEstimate +
            '}';
  }

  public void setPubPractical(Integer pubPractical) {
    this.pubPractical = pubPractical;
  }

  public void setPubRate(Integer pubRate) {
    this.pubRate = pubRate;
  }

  public void setPubNew(Integer pubNew) {
    this.pubNew = pubNew;
  }

  public void setPubOld(Integer pubOld) {
    this.pubOld = pubOld;
  }

  public void setPubIntention(Integer pubIntention) {
    this.pubIntention = pubIntention;
  }

  public void setPubEstimate(Integer pubEstimate) {
    this.pubEstimate = pubEstimate;
  }

  public Integer getPubPractical() {

    return pubPractical;
  }

  public Integer getPubRate() {
    return pubRate;
  }

  public Integer getPubNew() {
    return pubNew;
  }

  public Integer getPubOld() {
    return pubOld;
  }

  public Integer getPubIntention() {
    return pubIntention;
  }

  public Integer getPubEstimate() {
    return pubEstimate;
  }

  public void setPubId(String pubId) {
    this.pubId = pubId;
  }

  public String getPubId() {

    return pubId;
  }

  public void setPubName(String pubName) {
    this.pubName = pubName;
  }

  public void setPubCount(Integer pubCount) {
    this.pubCount = pubCount;
  }

  public void setPubStratTime(Date pubStratTime) {
    this.pubStratTime = pubStratTime;
  }

  public void setPubStopTime(Date pubStopTime) {
    this.pubStopTime = pubStopTime;
  }

  public String getPubName() {

    return pubName;
  }

  public Integer getPubCount() {
    return pubCount;
  }

  public Date getPubStratTime() {
    return pubStratTime;
  }

  public Date getPubStopTime() {
    return pubStopTime;
  }
}
