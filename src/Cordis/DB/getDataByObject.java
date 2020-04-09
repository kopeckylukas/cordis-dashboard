/*
 * To change this license header, choose License Headers in getDataByObject Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.DB;

import Cordis.Entities.Organisation;
import Cordis.Entities.Project;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Girish Lukka, modified by Lukas Kopecky
 */
public class getDataByObject {
    
    private Connection connection;
    
    /**
     * Constructs Database Connectivity
     * Created by Girish Lukka modified By Lukas Kopecky
     */
    public getDataByObject() {
        try {
            String dbLocation = "jdbc:sqlite:Cordis2020.sqlite3";
            connection = DriverManager.getConnection(dbLocation);        
        } catch (SQLException e) {
            System.err.println(e);
        }        
    }
    
    /**
     * Retrieves data from Entity Organisation, parameter WHERE
     * @param where condition of query, "e.g. orgCountry LIKE 'CZ'"
     * @return List type Organisation
     */
    public List<Organisation> getOrganisation(String where) {
        String sql = "SELECT orgID, orgName, orgShortName, orgURL, orgVATNumber, "
                    + "orgContactForm, orgCountry "
                    + "FROM Organisation WHERE " + where;
        List<Organisation> organisation = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Organisation o = getOrganisatonFromRow(rs);
                organisation.add(o);
            }
            return organisation;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
 
    /**
     * Retrieves ALL data from Entity Organisation
     * @return List type Organisation
     */
    public List<Organisation> getOrganisation() {
        String sql = "SELECT orgID, orgName, orgShortName, orgURL, orgVATNumber, "
                    + "orgContactForm, orgCountry "
                    + "FROM Organisation";
        List<Organisation> organisation = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Organisation o = getOrganisatonFromRow(rs);
                organisation.add(o);
            }
            return organisation;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
    
    /**
     * Constructs Object Organisation
     * @param rs Result Set from retrieved from SQL, contains line or SQL Error
     * @return object type Organisation
     * @throws SQLException if parameter rs contains SQL Error
     */
    private Organisation getOrganisatonFromRow(ResultSet rs) throws SQLException {
        Organisation org;        
        org = new Organisation(rs.getInt(1), rs.getString(2), rs.getString(3), 
                         rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
        return org;
    }

    
    public List<Project> getProject(String where) {
        String sql = "select proID, proRCN, proAcronym, proTitle, proFrameworkProgramme, "
                   + "proStartDate, proEndDate, projectURL, proObjetives, proTotalCost, "
                   + "proEcMaxContribution, proSubject, proStatus, topicID, callID, fCode "
                   + "from Project WHERE " +where;
        List<Project> project = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Project pro = getProjectFromRow(rs);
                project.add(pro);
            }
            return project;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
    
    /**
     * 
     * @return 
     */
    public List<Project> getProject() {
        String sql = "select proID, proRCN, proAcronym, proTitle, proFrameworkProgramme, "
                   + "proStartDate, proEndDate, projectURL, proObjetives, proTotalCost, "
                   + "proEcMaxContribution, proSubject, proStatus, topicID, callID, fCode "
                   + "from Project";
        List<Project> project = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Project pro = getProjectFromRow(rs);
                project.add(pro);
            }
            return project;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    private Project getProjectFromRow(ResultSet rs) throws SQLException {
        Project pro;
        Date startDate, endDate;
        Integer ID = rs.getInt(1);
        Integer RCN = rs.getInt(2);
        String acronym = rs.getString(3);
        String title = rs.getString(4);
        String framework =rs.getString(5);
           if (rs.getString(7).equals("") || rs.getString(6).equals(6)){
            startDate = Date.valueOf("2016-11-01");
            endDate = Date.valueOf("2016-11-01");
        }else{
            startDate = Date.valueOf(rs.getString(6));
            endDate = Date.valueOf(rs.getString(7));
        }
        String URL = rs.getString(8);
        String objectives = rs.getString(9);
        Double totalCost = rs.getDouble(10);
        Double ecContribution = rs.getDouble(11);
        String subject = rs.getString(12);
        String status = rs.getString(13);
        String topic = rs.getString(14);
        String call = rs.getString(15); 
        pro = new Project(ID, RCN, acronym, title, framework, startDate, 
                          endDate, URL, objectives, totalCost, ecContribution, 
                          subject, status, topic, call);
        return pro;
    }
}
