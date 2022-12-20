package com.ab.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("cktr")
public interface Cricketer {
	
	@Lookup
	public abstract CricketBat createCricketBat();
	
	public default void fielding() {
		System.out.println("Crickert is doing fielding of ball");
	}

	public default void bowling() {
		System.out.println("Crickert is doing bowling of ball");
	}

	public default void wicketKeeping() {
		System.out.println("Crickert is doing wicket Keeping of ball");
	}

	public default void batting() {
		// perform dependency lookup to get dependent class object
		CricketBat bat = createCricketBat();

		// use dependent class object
		int runs = bat.scoreRuns();

		System.out.println("Cricket is doing batting and his score is : " + runs);

	}

}
