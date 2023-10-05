package com.example.project;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FirefoxDriver dr = new FirefoxDriver();
		
		dr.get("https://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("ajio");
		dr.findElement(By.xpath(("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]"))).click();
		dr.findElement(By.xpath("/html/body/div[5]/div/div[9]/div/div[1]/div[2]/div/div/div/div/div/div[1]/a/div[2]/span[1]/span[2]/span[1]/div")).click();


	}

}
