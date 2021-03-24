package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.codeup.adlister.models.UserProfile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "controllers.CreateProfileServlet", urlPatterns = "/profile/create")
public class CreateProfileServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean notLoggedIn = request.getSession().getAttribute("user") == null;
        if(notLoggedIn){
            response.sendRedirect("/login");
        }else{
            request.getRequestDispatcher("/WEB-INF/profile/create.jsp")
                    .forward(request, response);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        com.codeup.adlister.models.User creatingProfile = (User)  request.getSession().getAttribute("user");
        UserProfile profile = new UserProfile(
                request.getParameter("profile_pic"),
                request.getParameter("about"),
                creatingProfile.getId()
        );
        DaoFactory.getUserProfilesDao().insert(profile);
        response.sendRedirect("/profile");
    }
}
