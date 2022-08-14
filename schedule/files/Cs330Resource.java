/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs330;

import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("cs330")
public class Cs330Resource {

    @Context
    private UriInfo context;

    static Soccer soccer = new Soccer();
    static ArrayList students = new ArrayList<Student>(){
        {
            add(new Student(0, "Don", "CS"));
            add(new Student(1, "David", "CS"));
            add(new Student(2, "Virgil", "Math"));
        }
    };

    public Cs330Resource() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("Students")
    public String getStudents(){
        return students.toString();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("Students/{id}")
    public String getStudent(@PathParam("id") int id){
        return students.get(id).toString();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("Student")
    public String getStudentQuery(@QueryParam("id") int id){
        return students.get(id).toString();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("Soccer")
    public String getScore(){
        return soccer.toString();
    }

    @POST
    @Path("Soccer/win")
    @Produces(MediaType.TEXT_PLAIN)
    public String addWin(){
        ++soccer.wins;
        return soccer.toString();
    }

    @POST
    @Path("Soccer/draw")
    @Produces(MediaType.TEXT_PLAIN)
    public String addDraw(){
        ++soccer.ties;
        return soccer.toString();
    }
}
