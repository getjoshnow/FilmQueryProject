package com.skilldistillery.filmquery.database;

import com.skilldistillery.filmquery.entities.Film;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
All JDBC code will be in methods of the DatabaseAccessorObject class.

Implement the findFilmById method that takes an int film ID, and returns a Film object (or null, if the film ID returns no data.)
Implement findActorById method that takes an int actor ID, and returns an Actor object (or null, if the actor ID returns no data.)
Implement findActorsByFilmId with an appropriate List implementation that will be populated using a ResultSet and returned.
Make sure your JDBC code uses PreparedStatement with bind variables instead of concatenating values into SQL strings.
 */


public interface DatabaseAccessor {


	public Film findFilmById(int filmId) {
		
		return null;
	}
	public Actor findActorById(int actorId);

//  public List<Actor> findActorsByFilmId(int filmId);

}
