package leetcode;

public class RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {

		int upDown = 0;
		int leftRight = 0;

		for (char c : moves.toCharArray()) {
			if (c == 'R')
				leftRight++;
			if (c == 'L')
				leftRight--;
			if (c == 'U')
				upDown++;
			if (c == 'D')
				upDown--;
		}

		return (upDown == 0) && (leftRight == 0);
	}
}
