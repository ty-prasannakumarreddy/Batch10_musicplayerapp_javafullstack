package com.tyss.musicapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.musicapplication.beans.MusicFiles;
import com.tyss.musicapplication.dto.MusicPlayerResponce;
import com.tyss.musicapplication.dto.ResponceDTO;
import com.tyss.musicapplication.service.MusicService;

@RestController
public class MusicController {
	@Autowired
	private MusicService service;

	@GetMapping(path ="/songs", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponceDTO playAllSongs() {
		
		ResponceDTO response =new ResponceDTO();
		List<MusicFiles> songs =  service.getAllSongs();
		if (songs != null) {
			response.setStatusCode(200);
			response.setMessage("successes");
			response.setData(songs);
			
		} else {
			response.setStatusCode(400);
			response.setMessage("data not found");
		}
		return response;

	}
	

}
