package basic03;

import java.util.List;

public class EaglesTest {
	public static void main(String[] args) {
		EaglesDAO eDao = new EaglesDAO();
		
		EaglesDTO player = eDao.selectOne(5);
		player.setThrowHand("rrr");
		eDao.updatePlayer(player);
		player = eDao.selectOne(5);

		/*eDao.insertPlayer(new EaglesDTO(6,"김민하","외야수","대전고","right","right","971221","32000000"));
		EaglesDTO player = eDao.selectOne(6);
		System.out.println(player.toString() + "\n");
		//eDao.insertPlayer(new EaglesDTO(5,"김민하","외야수","대전고","right","right","971221","32000000"));
		EaglesDTO player = eDao.selectOne(5);
		System.out.println(player.toString());
		player.setThrowHand("left");
		player.setAnnualIncome("200000");
		eDao.updatePlayer(player);
		player = eDao.selectOne(5);
		System.out.println(player.toString());
		
		eDao.deletePlayer(6);
				
		List<EaglesDTO> playerList = eDao.selectAll();*/
		//List<EaglesDTO> playerList = eDao.selectPlayers();
		//System.out.println("연봉 3억원 이상 선수 명단");
		String positions[] = {"투수", "포수", "내야수", "외야수"};
		for (String position : positions) {
			List<EaglesDTO> playerList = eDao.selectPlayersByPosition(position);
			System.out.println("포지션이 " + position + "인 선수 명단");
			for (EaglesDTO eagle : playerList)
				System.out.println(eagle.toString());
			System.out.println();
			
		}
		System.out.println("연봉 2억원 이상 선수 명단");
		List<EaglesDTO> playerList = eDao.selectPlayersBySalary(200000);
		for (EaglesDTO eagle : playerList)
			System.out.println(eagle.toString());
		eDao.close();
		
	}

}
