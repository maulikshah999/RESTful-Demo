package com.restdemo.Services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.restdemo.model.Artist;
import com.restdemo.model.Track;


@Path("/json")
public class JSONService {
	
	@GET
	@Path("/track")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Track> getTrackJSON(){
		
		ArrayList<Track> alTracks = new ArrayList<Track>();
		
		Track track = new Track();
		track.setTitle("Castle of Glass");
		track.setSinger("Linkin Park");
		List<Artist> artistList = new ArrayList<Artist>();
		Artist artist = new Artist();
		artist.setArtistName("Arijit Singh");
		artist.setArtistAge(25);
		artistList.add(artist);
		
		Artist artist1 = new Artist();
		artist1.setArtistName("Ankit Tiwari");
		artist1.setArtistAge(22);
		artistList.add(artist1);
		
		track.setArtists(artistList);
		
		alTracks.add(track);
		Track track2 = new Track();
		track2.setTitle("Title 2");
		track2.setSinger("singer");
		List<Artist> artList2 = new ArrayList<Artist>();
		Artist art21 = new Artist();
		art21.setArtistName("Artist1");
		art21.setArtistAge(20);
		Artist art22 = new Artist();
		art22.setArtistName("Artist2");
		art22.setArtistAge(24);
		Artist art23 = new Artist();
		art23.setArtistName("Artist3");
		art23.setArtistAge(25);
		
		artList2.add(art21);
		artList2.add(art22);
		artList2.add(art23);
		track2.setArtists(artList2);
		
		alTracks.add(track2);
		return alTracks;
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track){
		String result = "Track saved: "+ track;
		return Response.status(201).entity(result).build();
	}
	
}
