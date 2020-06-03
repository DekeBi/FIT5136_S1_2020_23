package webapp;

import datalayer.DB_insert_user;
import datalayer.DB_user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;

@WebServlet(name = "confirmation")
public class confirmation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("Email");
        String password = request.getParameter("Password");
        String dob = request.getParameter("Date of Birth");
        String nationality = request.getParameter("Nationality");
        String id = request.getParameter("Identification");
        String gender = request.getParameter("Gender");
        String allergy = request.getParameter("Allergies");
        String food = request.getParameter("Food Preference");
        String qualification = request.getParameter("Qualification(s)");
        String exp = request.getParameter("Work Experiences");
        String occupation = request.getParameter("Occupation(s)");
        String skill = request.getParameter("Computer Skills");
        String language = request.getParameter("Language(s)");
        String name = request.getParameter("Name");

        request.setAttribute("email",email);
        request.setAttribute("password1",password);
        request.setAttribute("dob",dob);
        request.setAttribute("nationality",nationality);
        request.setAttribute("id",id);
        request.setAttribute("gender",gender);
        request.setAttribute("allergy",allergy);
        request.setAttribute("food",food);
        request.setAttribute("qualification",qualification);
        request.setAttribute("exp",exp);
        request.setAttribute("occupation",occupation);
        request.setAttribute("skill",skill);
        request.setAttribute("language",language);
        request.setAttribute("name",name);


        try {
            DB_insert_user db_insert_user = new DB_insert_user();
            db_insert_user.createUser(email, password, dob, nationality, id, gender, allergy, food, qualification, exp, occupation, skill, language, name);

        }catch (Exception e)
        {
            e.printStackTrace();
            request.setAttribute("errorMessage1","Error");
            request.getRequestDispatcher("/signup.jsp").forward(request,response);
        }


        DB_user db_user = new DB_user();

        String[] record = db_user.getRecords(id).split(",");

        request.setAttribute("health",record[0]);
        request.setAttribute("criminal",record[1]);
        request.getRequestDispatcher("/signup.jsp").forward(request,response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
