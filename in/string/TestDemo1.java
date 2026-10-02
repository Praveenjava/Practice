package in.string;

public class TestDemo1 {
	void main() {
		System.out.println(hello());
	}

	int hello() {
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			return 30;
		}
	}

}
