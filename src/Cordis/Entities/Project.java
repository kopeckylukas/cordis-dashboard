/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.Entities;
import java.sql.Date;

/**
 * Describing Projects entity form Cordis Database
 * @author lukaskopecky
 */
public class Project {
    private Integer proID;
    private Integer proRCN;
    private String proAcronym;
    private String proTitle;
    private String proFramework;
    private Date proStartDate;
    private Date proEndDate;
    private String proURL;
    private String proObjectives;
    private Double proTotalCost;
    private Double proEcMaxContribution;
    private String proSubject;
    private String proStatus;
    private String topicID;
    private String callID;
    private FundingScheme fCode;

    /**
     * Short Constructor, only attributes that belongs to Entity Project
     * @param proID
     * @param proRCN
     * @param proAcronym
     * @param proTitle
     * @param proFramework
     * @param proStartDate
     * @param proEndDate
     * @param proURL
     * @param proObjectives
     * @param proTotalCost
     * @param proEcMaxContribution
     * @param proSubject
     * @param Status
     * @param TopicID
     * @param callID 
     */
    public Project(Integer proID, Integer proRCN, String proAcronym, String proTitle, String proFramework, Date proStartDate, Date proEndDate, String proURL, String proObjectives, Double proTotalCost, Double proEcMaxContribution, String proSubject, String Status, String TopicID, String callID) {
        this.proID = proID;
        this.proRCN = proRCN;
        this.proAcronym = proAcronym;
        this.proTitle = proTitle;
        this.proFramework = proFramework;
        this.proStartDate = proStartDate;
        this.proEndDate = proEndDate;
        this.proURL = proURL;
        this.proObjectives = proObjectives;
        this.proTotalCost = proTotalCost;
        this.proEcMaxContribution = proEcMaxContribution;
        this.proSubject = proSubject;
        this.proStatus = Status;
        this.topicID = TopicID;
        this.callID = callID;
    }

    /**
     * Gets product Identifier
     * @return product Identifier
     */
    public Integer getProID() {
        return proID;
    }

    /**
     * Gets Record Control Number
     * @return Record Control Number
     */
    public Integer getProRCN() {
        return proRCN;
    }

    /**
     * Gets Project Acronym (Short Name)
     * @return Product Acronym
     */
    public String getProAcronym() {
        return proAcronym;
    }
    
    /**
     * Gets Project Title
     * @return Project Title
     */
    public String getProTitle() {
        return proTitle;
    }

    /**
     * Gets Project Framework Programme
     * @return Framework Programme
     */
    public String getProFramework() {
        return proFramework;
    }

    /**
     * Gets Start Date of Project
     * @return Project Start Date
     */
    public Date getProStartDate() {
        return proStartDate;
    }

    /**
     * Gets End Date of Project
     * @return Project End Date
     */
    public Date getProEndDate() {
        return proEndDate;
    }

    /**
     * Gets Project URL
     * @return URL
     */
    public String getProURL() {
        return proURL;
    }

    /**
     * Gets Project Objectives/Description 
     * @return Project Objectives
     */
    public String getProObjectives() {
        return proObjectives;
    }

    /**
     * Gets Total cost of a Project
     * @return Total Cost
     */
    public Double getProTotalCost() {
        return proTotalCost;
    }

    /**
     * Gets Maximum European Commission Contribution
     * @return Max European Commission Contribution
     */
    public Double getProEcMaxContribution() {
        return proEcMaxContribution;
    }
    
    /**
     * Gets Project Subject
     * @return Project Subject
     */
    public String getProSubject() {
        return proSubject;
    }

    public String getProStatus() {
        return proStatus;
    }

    public String getTopicID() {
        return topicID;
    }

    public String getCallID() {
        return callID;
    }

    public FundingScheme getfCode() {
        return fCode;
    }
    

    public void setProID(Integer proID) {
        this.proID = proID;
    }

    public void setProRCN(Integer proRCN) {
        this.proRCN = proRCN;
    }

    public void setProAcronym(String proAcronym) {
        this.proAcronym = proAcronym;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    public void setProFramework(String proFramework) {
        this.proFramework = proFramework;
    }

    public void setProStartDate(Date proStartDate) {
        this.proStartDate = proStartDate;
    }

    public void setProEndDate(Date proEndDate) {
        this.proEndDate = proEndDate;
    }

    public void setProURL(String proURL) {
        this.proURL = proURL;
    }

    public void setProObjectives(String proObjectives) {
        this.proObjectives = proObjectives;
    }

    public void setProTotalCost(Double proTotalCost) {
        this.proTotalCost = proTotalCost;
    }

    public void setProEcMaxContribution(Double proEcMaxContribution) {
        this.proEcMaxContribution = proEcMaxContribution;
    }

    public void setProSubject(String proSubject) {
        this.proSubject = proSubject;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus;
    }

    public void setTopicID(String TopicID) {
        this.topicID = TopicID;
    }

    public void setCallID(String callID) {
        this.callID = callID;
    }

    public void setfCode(FundingScheme fCode) {
        this.fCode = fCode;
    }
    
    
    
}
