package com.tyss.musicapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.musicapplication.beans.MusicFiles;
import com.tyss.musicapplication.dto.MusicPlayerResponce;
@Repository
public class MusicDaoImpl implements MusicDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public List<MusicPlayerResponce> getAllSongs() {
		List<MusicPlayerResponce> songs = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("musicfilesdb");
			EntityManager manager = entityManagerFactory.createEntityManager();
			Query query = manager.createQuery("from MusicFiles");

			songs = query.getResultList();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return songs;
	}

}
