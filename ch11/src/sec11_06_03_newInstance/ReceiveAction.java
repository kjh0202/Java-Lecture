package sec11_06_03_newInstance;

import sec11_06_03_newInstance.Action;

public class ReceiveAction implements Action {
	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}
}
