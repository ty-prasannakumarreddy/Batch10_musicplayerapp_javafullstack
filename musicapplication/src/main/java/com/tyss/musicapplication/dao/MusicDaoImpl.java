package com.tyss.musicapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
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
	public List<MusicFiles> getAllSongs() {
		List<MusicFiles> songs = null;
		try {
			//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("musicfilesdb");
			EntityManager manager = factory.createEntityManager();
			Query query = manager.createQuery("from MusicFiles");

			songs = query.getResultList();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return songs;
	}
	@Override
	public List<MusicFiles> getSongs(String song_title1) {
		List<MusicFiles> beans =null;
		try {

			EntityManager manager = factory.createEntityManager();

			Query query = manager.createQuery("from MusicFiles where song_title=:song_title1");
			query.setParameter("song_title1", song_title1);

			beans = query.getResultList();

		} catch (Exception e) {
			beans = null;
			e.printStackTrace();
		}

		return beans;
	}

	@Override
	public boolean addSong(MusicFiles infoBean) {
		try {

			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(infoBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean editSong(MusicFiles infoBean) {
		try {

			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			MusicFiles orgData = manager.find(MusicFiles.class, infoBean.getSong_Id());

			if (infoBean.getAlbum_Name() != null && infoBean.getAlbum_Name() != "") {
				orgData.setAlbum_Name(infoBean.getAlbum_Name());
			}
			if (infoBean.getArtist_Name() != null && infoBean.getArtist_Name()!= "") {
				orgData.setArtist_Name(infoBean.getArtist_Name());
			}
			if (infoBean.getDescription() != null && infoBean.getDescription() != "") {
				orgData.setDescription(infoBean.getDescription());
			}
			if (infoBean.getSong_Location() != null && infoBean.getSong_Location() != "") {
				orgData.setSong_Location(infoBean.getSong_Location());
			}
			if (infoBean.getSong_Title() != null && infoBean.getSong_Title() != "") {
				orgData.setSong_Title(infoBean.getSong_Title());
			}

			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteSong(int song_id) {
		try {

			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			MusicFiles infoBean = manager.find(MusicFiles.class,song_id );
			manager.remove(infoBean);
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();

			return false;
		}
	}

}
