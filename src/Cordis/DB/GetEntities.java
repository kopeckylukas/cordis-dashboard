/*
 * To change this license header, choose License Headers in GetEntities Properties.
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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Retrieving data from Cordis 2020 database only and returning them in form of
 * an ArrayList, user defined type (types stored in package Cordis.Entities)
 *
 * @author Girish Lukka, modified by Lukas Kopecky
 */
public class GetEntities {

    private Connection connection;

    /**
     * Constructs Database Connectivity, connects only Codrdis2020 database
     * Created by Girish Lukka modified By Lukas Kopecky & Md Reyad
     */
    public GetEntities() {
        try {
            String dbLocation = "jdbc:sqlite:Cordis2020.sqlite3";
            connection = DriverManager.getConnection(dbLocation);
            System.out.println("[GetEntities] ... Database Corids2020.sqlite3: CONNECTED!");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    /**
     * Retrieves data of Organisation by searching the value, parameter val
     *
     * @param val condition of query, "e.g. orgCountry LIKE 'CZ'"
     * @return List type Organisation
     */
    public LinkedHashMap<List<Organisation>, LinkedHashMap<Integer, String>> search(String val) {
        //SQLi query to be executed
        String sql = null;
        if (val != null) {
            sql = "SELECT * FROM Organisation WHERE orgID LIKE '%" + val + "%' or orgName LIKE '%" + val + "%' or orgShortName LIKE '%" + val + "%' or orgCountry LIKE '%" + val + "%' or orgVATNumber LIKE '%" + val + "%' or orgContactForm LIKE '%" + val + "%' or locationID LIKE '%" + val + "%' or oCode LIKE '%" + val + "%'  or orgURL LIKE '%" + val + "%';";
        } else {
            sql = "SELECT * FROM Organisation;";
        }
        //Creates ArrayList, type Organisation
        List<Organisation> organisation = new ArrayList<>();
        LinkedHashMap<List<Organisation>, LinkedHashMap<Integer, String>> hm = new LinkedHashMap<List<Organisation>, LinkedHashMap<Integer, String>>();

        LinkedHashMap<Integer, String> h = new LinkedHashMap<Integer, String>();
        //Connects to the database. If sucessful execute Query 
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            System.out.println("[getOrganisation] ... Query executed");

            //While tere is a next line of row of retrieved data
            while (rs.next()) {
                //Creates an Organisation object
                int locationID = rs.getInt("locationID");
                String oCode = rs.getString("oCode");
                h.put(locationID, oCode);
                Organisation o = getOrganisationsRow(rs);
                //Adding Object into ArrayList
                organisation.add(o);
            }

            hm.put(organisation, h);
            //Retruning data
            System.out.println("[getOrganisation] ... Returning data in ArrayList");
            return hm;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    /**
     * Retrieves HashMap of <Integer, String> pair. Integer Contains the count
     * of organizations and String contains the oCode namee
     *
     * @param where condition of query, where is name of country you will be
     * querying
     * @return HashMap<Integer,String> of organization activity of some country
     */
    public HashMap<Integer, String> getTop5OrganizationsByActivity(String where) {
        //SQLi query to be executed
        String sql = "select Count(orgID),oCode from Organisation where orgCountry='" + where + "' GROUP BY oCode;";

        //Connects to the database. If sucessful execute Query 
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            //Creating a HashMap with pair of typ (Integer, String)
            HashMap<Integer, String> hmap = new HashMap<Integer, String>();
            System.out.println("[getOrganisation] ... Query executed");

            //While tere is a next line of row of retrieved data
            while (rs.next()) {
                //inserting data into hashMap 
                hmap.put(rs.getInt("Count(orgID)"), rs.getString("oCode"));
            }

            //Retruning data
            System.out.println("[getOrganisation] ... Returning data in ArrayList");
            return hmap;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    /**
     * Retrieves LinkedHashMap of <Integer, String> pair. Integer Contains the
     * count of Projects and String contains the year Linked used because it
     * saves the order also in which we put the data
     *
     * @param no parameters
     * @return LinkedHashMap<Integer,String> contains number projects started in
     * each year
     */
    public LinkedHashMap<Integer, String> getProjectsByYear() {
        //SQLi query to be executed
        String sql = "SELECT Count(proID),strftime('%Y',proStartDate) from Project GROUP By strftime('%Y',proStartDate) ORDER by strftime('%Y',proStartDate);";

        //Connects to the database. If sucessful execute Query 
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            //Creating a LinkedHashMap with pair of type (Integer, String)
            LinkedHashMap<Integer, String> hmap = new LinkedHashMap<Integer, String>();
            System.out.println("[getOrganisation] ... Query executed");

            //While tere is a next line of row of retrieved data
            while (rs.next()) {
                //System.out.println(rs.getInt("Count(proID)") + "      " + rs.getString("strftime('%Y',proStartDate)"));
                //inserting data into LinkedHashMap                
                hmap.put(rs.getInt("Count(proID)"), rs.getString("strftime('%Y',proStartDate)"));
            }

            //Retruning data
            System.out.println("[getOrganisation] ... Returning data in ArrayList");
            return hmap;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    /**
     * Retrieves HashMap of <Integer, String> pair. Integer Contains the count
     * of organizations and String contains the country name
     *
     * @return HashMap<Integer,String> containing number organization for each
     * country
     */
    public HashMap<Integer, String> getOrganizationsCountByCountries() {
        //SQLi query to be executed
        String sql = "select count(orgID), orgCountry from Organisation GROUP BY orgCountry HAVING COUNT(orgID)>15;";

        //Connects to the database. If sucessful execute Query 
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            //Creating a HashMap with pair of type (Integer, String)
            HashMap<Integer, String> hmap = new HashMap<Integer, String>();
            System.out.println("[getOrganisation] ... Query executed");

            //While tere is a next line of row of retrieved data
            while (rs.next()) {
                //inserting data into hashMap                
                hmap.put(rs.getInt("count(orgID)"), rs.getString("orgCountry"));
            }

            //Retruning data
            System.out.println("[getOrganisation] ... Returning data in ArrayList");
            return hmap;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    /**
     * Retrieves data from Entity Organisation, parameter WHERE
     *
     * @param where condition of query, "e.g. orgCountry LIKE 'CZ'"
     * @return List type Organisation
     */
    public List<Organisation> getOrganisation(String where) {
        //SQLi query to be executed
        String sql = "SELECT orgID, orgName, orgShortName, orgURL, orgVATNumber, "
                + "orgContactForm, orgCountry "
                + "FROM Organisation WHERE " + where;

        //Creates ArrayList, type Organisation
        List<Organisation> organisation = new ArrayList<>();

        //Connects to the database. If sucessful execute Query 
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            System.out.println("[getOrganisation] ... Query executed");

            //While tere is a next line of row of retrieved data
            while (rs.next()) {

                //Creates an Organisation object
                Organisation o = getOrganisationsRow(rs);
                //Adding Object into ArrayList
                organisation.add(o);
            }

            //Retruning data
            System.out.println("[getOrganisation] ... Returning data in ArrayList");
            return organisation;
        } catch (SQLException e) {

            System.err.println(e);
            return null;
        }
    }

    /**
     * Retrieves ALL data from Entity Organisation
     *
     * @return List type Organisation
     */
    public List<Organisation> getOrganisation() {
        //SQLi query to be executed
        String sql = "SELECT orgID, orgName, orgShortName, orgURL, orgVATNumber, "
                + "orgContactForm, orgCountry "
                + "FROM Organisation";

        //Creating ArrayList type Organisation
        List<Organisation> organisation = new ArrayList<>();

        //Connects to the database. If sucessful execute Query 
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            System.out.println("[getOrganisation] ... Query executed");

            //While tere is a next line of row of retrieved data
            while (rs.next()) {

                //Creates an Organisation object
                Organisation o = getOrganisationsRow(rs);
                //Adding Object Organisation into the ArrayList
                organisation.add(o);
            }

            //Retruning data
            System.out.println("[getOrganisation] ... Returning data in ArrayList");
            return organisation;
        } catch (SQLException e) {

            System.err.println(e);
            return null;
        }
    }

    /**
     * Constructs Object Organisation
     *
     * @param rs Result Set from retrieved from SQL, contains line or SQL Error
     * @return object type Organisation
     * @throws SQLException if parameter rs contains SQL Error
     */
    private Organisation getOrganisationsRow(ResultSet rs) throws SQLException {

        //Creating List Organisation 
        Organisation org;

        //Retirieving data from Result Set and creating Organisation using 
        //Consturctor
        org = new Organisation(rs.getInt(1), rs.getString(2), rs.getString(3),
                rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));

        //Retruning Organisation
        return org;
    }

    /**
     * Retrieves data from table Project
     *
     * @param where SQL condition Where, String value, e.g. 'proID = 00000000'
     * @return ArrayList, type Project
     */
    public List<Project> getProject(String where) {
        //SQLi query to be exeuted
        String sql = "select proID, proRCN, proAcronym, proTitle, proFrameworkProgramme, "
                + "proStartDate, proEndDate, projectURL, proObjetives, proTotalCost, "
                + "proEcMaxContribution, proSubject, proStatus, topicID, callID, fCode "
                + "from Project WHERE " + where;

        //Creating ArryList type Project
        List<Project> project = new ArrayList<>();

        //Connects to the database. If sucessful execute Query 
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            System.out.println("[getProject] ... Query executed");

            //While tere is a next line of row of retrieved data
            while (rs.next()) {
                Project pro = getProjectRow(rs);
                //Adding Object Project into the ArrayList
                project.add(pro);
            }

            //Retruning data
            System.out.println("[getProject] ... Returning data in ArrayList");
            return project;
        } catch (SQLException e) {

            System.err.println(e);
            return null;
        }
    }

    /**
     * Retrieves all data from table Project and stores them in ArrayList, type
     * Project
     *
     * @return ArrayList, type Project
     */
    public List<Project> getProject() {
        //SQLi query to be exeuted
        String sql = "select proID, proRCN, proAcronym, proTitle, proFrameworkProgramme, "
                + "proStartDate, proEndDate, projectURL, proObjetives, proTotalCost, "
                + "proEcMaxContribution, proSubject, proStatus, topicID, callID, fCode "
                + "from Project";

        //Creating ArryList type Project
        List<Project> project = new ArrayList<>();

        //Connects to the database. If sucessful execute Query 
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            System.out.println("[getProject] ... Query executed");

            //While tere is a next line of row of retrieved data
            while (rs.next()) {

                //Creates an Organisation object
                Project pro = getProjectRow(rs);
                //Adding Object Project into the ArrayList
                project.add(pro);
            }

            //Retruning data
            System.out.println("[getProject] ... Returning data in ArrayList");
            return project;
        } catch (SQLException e) {

            System.err.println(e);
            return null;
        }
    }

    /**
     * Creating Object Project from Retrieved line
     *
     * @param rs ResultSet object
     * @return Object, type Project
     * @throws SQLException if parameter rs contains SQL Error
     */
    private Project getProjectRow(ResultSet rs) throws SQLException {

        //Definition of Object
        Project pro;

        //Retrieving data, and stores them in variables
        Date startDate, endDate;
        Integer ID = rs.getInt(1);
        Integer RCN = rs.getInt(2);
        String acronym = rs.getString(3);
        String title = rs.getString(4);
        String framework = rs.getString(5);

        //If any date is missing, it is repalaced by default date 2016-11-01
        if (rs.getString(7).equals("") || rs.getString(6).equals("")) {
            startDate = Date.valueOf("2016-11-01");
            endDate = Date.valueOf("2016-11-01");
        } else {
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

        //creating Object pro (Project) by using its Consturctor
        pro = new Project(ID, RCN, acronym, title, framework, startDate,
                endDate, URL, objectives, totalCost, ecContribution,
                subject, status, topic, call);

        //Returnging line of Database in form of object, type Proejct
        return pro;
    }
}
