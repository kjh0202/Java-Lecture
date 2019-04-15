package sec05_05_serialVersionUID;

import java.io.Serializable;

public class ClassC implements Serializable {
	static final long serialVersionUID = 1000L;
	int field1;
	int field2;
}
