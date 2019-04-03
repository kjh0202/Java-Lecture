package basic02;

import java.util.List;

public class SongTest {
	public static void main(String[] args) {
		//insert
		SongDAO sDao = new SongDAO();
		
		//sDao.insertSong(new SongDTO("빨간 맛", "빠빠빨간 맛 궁금해 허니"));
		
		/*SongDTO sDto = new SongDTO("빨간 맛", "빠빠빨간 맛 궁금해 허니");
		sDao.insertSong(sDto); */
		
		//select
		//SongDTO sDto = sDao.selectOne(117);
		
		//update
		//SongDTO sDto = sDao.selectOne(119);
		//System.out.println(sDto.toString() + "\n");
/*		sDto.setTitle("넌 이즈 뭔들");
		sDto.setLyrics("나 지금 너 땜에 혼란스러 제발 누가 나 좀 말려줘");
		sDao.updateSong(sDto);
		sDto = sDao.selectOne(119);
		System.out.println(sDto.toString() + "\n");*/
		
		List<SongDTO> songList = sDao.selectAll();
		for (SongDTO song : songList) {
			System.out.println(song.toString());
		}
		sDao.colse();
		
		
		//delete
		//sDao.deleteSong(sDto);
		

	}

}
