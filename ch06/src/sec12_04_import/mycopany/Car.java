package sec12_04_import.mycopany;

//ctrl+shift+o (import문 자동적으로 추가)
import sec12_04_import.hankook.SnowTire;
import sec12_04_import.hyndai.Engine;
import sec12_04_import.kumho.BigWidthTire;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec12_04_import.hankook.Tire tire3 = new sec12_04_import.hankook.Tire();
	sec12_04_import.kumho.Tire tire4 = new sec12_04_import.kumho.Tire();

}
