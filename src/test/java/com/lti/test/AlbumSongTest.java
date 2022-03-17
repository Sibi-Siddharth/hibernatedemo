package com.lti.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import com.sibi.dao.AlbumSongDao;
import com.sibi.dao.GenericDao;
import com.sibi.entity1.Album;
import com.sibi.entity1.Song;



public class AlbumSongTest {
	
	/*@Test
	public void addAlbum() {
		Album alb=new Album();
		alb.setName("Hits of 2021");
		alb.setReleaseDate(LocalDate.of(2021, 12, 25));
		alb.setCopyRight("Z-Series");
		GenericDao dao = new GenericDao();
		dao.oper(alb);
	}
	@Test
	public void addSong() {
		GenericDao dao=new GenericDao();
		Album alb=(Album)dao.fetchById(Album.class, 26);
		Song s=new Song();
		s.setTitle("Way down we go");
		s.setArtist("Lava");
		s.setAlbum(alb);
		dao.oper(s);
	}
	@Test
	public void fetchAlbum() {
		AlbumSongDao dao=new AlbumSongDao();
		List<Album> alb=dao.fetchAllAlbum();
		for(Album album : alb)
			System.out.println(album.getid() + " , "+album.getName() + " , " +album.getReleaseDate() +" , " +album.getCopyRight() );
	}
	@Test
	public void fetchSong() {
		AlbumSongDao dao=new AlbumSongDao();
		List<Song> son=dao.fetchAllSong();
		for(Song song : son)
			System.out.println(song.getTitle() + " , " +song.getArtist());
	}
	@Test
	public void fetchAlbumYear() {
		AlbumSongDao dao=new AlbumSongDao();
		List<Album> alb=dao.fetchAlbumYear(2020);
		for(Album album : alb)
			System.out.println( album.getName() + " , " +album.getReleaseDate() +" , " +album.getCopyRight() );
		
	}
	@Test
	public void fetchSongArtist() {
		AlbumSongDao dao=new AlbumSongDao();
		List<Song> son=dao.fetchSongArtist("Ed Sheeran");
		for(Song song : son)
			System.out.println(song.getTitle() + " , " +song.getArtist());
	}
	@Test
	public void jointest() {
		AlbumSongDao dao=new AlbumSongDao();
		List<Song> son=dao.fetchSongYear(2020);
		for(Song song : son)
			System.out.println(song.getTitle() + " , " +song.getArtist());
	}*/
	@Test
	public void joinalbumtest() {
		AlbumSongDao dao=new AlbumSongDao();
		List<Album> alb=dao.fetchAlbumArtist("Ed Sheeran");
		for(Album album : alb)
			System.out.println( album.getName() + " , " +album.getReleaseDate() +" , " +album.getCopyRight() );
		
	}
}
