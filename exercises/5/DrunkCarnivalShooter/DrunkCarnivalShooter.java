
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
	}

	private int shootFuzz(int t) {
		int offsetNum = rand.nextInt(3) - 1;
		int fuzzedT = t + offsetNum;
		if(offsetNum > 0) {
			System.out.println("You aimed at target #" + t + " but the Force pulls your bullet to the right.");
		}
		else if(offsetNum < 0) {
			System.out.println("You aimed at target #" + t + " but the Force pulls your bullet to the left.");
		}
		return fuzzedT;
	}

	public void shoot(int t) {
		// First decrement the remaining target number if target is standing
		if(isTargetStanding(t)) {
			remainingTargetNum--;
		}
		// Then take down the target
		int newT = shootFuzz(t);
		if(takeDownTarget(newT)) {
			System.out.println("You hit target #" + newT + "! \"The Force is strong with this one.\", Darth opines.");
		}
		else {
			System.out.println("You miss! \"Do or do not. There is no try.\", Yoda chides.");
		}
		// Increment round sequence number
		roundNum++;
		// Invariant: remainingTargetNum equals to the number of targets still standing
		// TODO: Insert assertion checking above invariant
	}
	
	public boolean takeDownTarget(int t) {
		if(isTargetStanding(t)) {
			targets.set(t, false);
			return true;
		}
		return false;
	}
	
	public boolean isTargetStanding(int t) {
		return targets.get(t);
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
			int t = scanner.nextInt();
			shooter.shoot(t);
			if (shooter.getRemainingTargetNum() == 0) {
				System.out.println("You decimate all the targets. Where is my prize?");
				break;
			}
		}
	}
}
