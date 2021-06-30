package com.tyss.musicapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.musicapplication.beans.MusicFiles;
import com.tyss.musicapplication.dao.MusicDao;
import com.tyss.musicapplication.dto.MusicPlayerResponce;
@Service
public class MusicServiceImpl implements MusicService{
	@Autowired
	MusicDao dao;

	@Override
	public List<MusicPlayerResponce> getAllSongs() {
		
		return dao.getAllSongs();
	}

}
