/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dell.us.otc.services;

import com.dell.us.orc.resource.Orderdetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Paulo_Vieira
 */
@Path("")
public class getOrderDetails {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of getConnection
     */
    public getOrderDetails() {
    }

    /**
     * Retrieves representation of an instance of com.dell.us.otc.services.getOrderDetails
     * @return an instance of java.lang.String
     */
    @Path("/getOrder/{order_number}")
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public String getXml(@PathParam("order_number") String order_number) {
        //TODO return proper representation object
            String forprint = new String();
              try{
                  javax.naming.Context initContext = new InitialContext();
                  DataSource ds  = (DataSource)initContext.lookup("java:/comp/env/jdbc/omega");
                  Connection connection = ds.getConnection(); 
                  
                
                  
                  if (connection != null) {
                    PreparedStatement SQLquery = connection.prepareStatement("select va.order_number,va.org_id,\n" +
"           ou.name,va.flow_status_code,va.s100_status_name,va.s200_status_name,\n" +
"           va.s300_status_name,va.s400_status_name,va.s500_status_name,va.s600_status_name,\n" +
"           va.ordr_hold from apps.xxeom_line_statuses_v va, apps.hr_all_organization_units ou\n" +
"           where va.order_number IN ("+order_number+") and ou.organization_id = va.org_id");
                    
                     ResultSet rs = SQLquery.executeQuery();
                     rs.next();
                     
                    Orderdetails orderdts = new Orderdetails(rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5),
                    rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
                                     
                     Gson gSon = new Gson(); 
                     forprint = gSon.toJson(orderdts);
                     
                    
                }       

                  
              } catch (NamingException|SQLException ex) {
                  
  
              }
        return forprint;
    }

    /**
     * PUT method for updating or creating an instance of getConnection
     * @param content representation for the resource
     
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }*/
}
