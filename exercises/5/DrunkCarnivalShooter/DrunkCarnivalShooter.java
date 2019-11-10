
/**
 * Code by @author Wonsun Ahn
 * CarnivalShooter: Using arbitrary trial and shooter numbers, find how many targets are hit in those trials
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DrunkCarnivalShooter {
	Random rand;

	private static ArrayList<Boolean> targets;
	private static int remainingTargetNum;

	private static int roundNum;

	DrunkCarnivalShooter() {
		rand = new Random();
		targets = new ArrayList<Boolean>();
		remainingTargetNum = 4;
		for (int i = 0; i < remainingTargetNum; i++) {
			targets.add(true);
		}
	}

	private void printRound() {
		System.out.println("Round #" + roundNum + ":");
		for (boolean standing : targets) {
			if (standing) {
				System.out.print("  ||  ");
			}
			else {
				System.out.print("      ");
			}
		}
		System.out.println("");
		roundNum++;
	}

	private int shootFuzz(int targetNum) {
		int offsetNum = rand.nextInt(3) - 1;
		int fuzzedTargetNum = targetNum + offsetNum;
		return fuzzedTargetNum;
	}

	public boolean shoot(int targetNum) {
		int newTargetNum = shootFuzz(targetNum);
		if(newTargetNum != targetNum) {
			System.out.println("You aimed at target #" + targetNum + " but the Force redirects your bullet to target #" + newTargetNum + ".");
		}
		if (targets.get(newTargetNum) == true) {
			targets.set(newTargetNum, false);
			remainingTargetNum--;
			return true;
		}
		return false;
	}

	public int getRemainingTargetNum() {
		return remainingTargetNum;
	}

	public static void main(String[] args) {
		DrunkCarnivalShooter shooter = new DrunkCarnivalShooter();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			shooter.printRound();
			System.out.println("Choose your target (0-3): ");
			int aimedTargetNum = scanner.nextInt();
			if(shooter.shoot(aimedTargetNum) == true) {
				System.out.println("You hit! \"The Force is strong with this one.\", Darth opines.");
			}
			else {
				System.out.println("You miss! \"Do or do not. There is no try.\", Yoda chides.");
			}
			if (shooter.getRemainingTargetNum() == 0) {
				System.out.println("You decimate the targets. May the Force be with you!");
				break;
			}
		}
	}
}
