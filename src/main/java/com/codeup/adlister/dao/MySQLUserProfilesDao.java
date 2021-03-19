package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.codeup.adlister.models.UserProfile;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;


public class MySQLUserProfilesDao implements UserProfiles{

    private Connection connection;

    public MySQLUserProfilesDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public Long insert(UserProfile userprofile) {
        try {
            String query = "INSERT INTO user_info(profile_pic, about, user_id) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, userprofile.getProfile_pic());
            stmt.setString(2, userprofile.getAbout());
            stmt.setLong(3, userprofile.getUser_id());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    private UserProfile extractUserProfile(ResultSet rs) throws SQLException {
        if (! rs.next()) {
            return null;
        }
        return new UserProfile(
                rs.getLong("id"),
                rs.getString("profile_pic"),
                rs.getString("about"),
                rs.getLong("user_id")
        );
    }
}
