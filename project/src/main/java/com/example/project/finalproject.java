package com.example.project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class finalproject {

	public static void main(String[] args) {
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("bonkers");
		dr.findElement(By.xpath(("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"))).click();
	    dr.findElement(By.xpath(("/html/body/div[5]/div/div[10]/div[1]/div[1]/div[2]/div/div/div/div/div/div[1]/a/div[2]/span[1]/span[2]/span[1]/div"))).click();
	    dr.findElement(By.xpath(("/html/body/div[1]/header/div[1]/div/section/div/div/div[1]/div/div/div[1]/div/nav/ul/li[2]/a/span"))).click();
	    dr.findElement(By.xpath(("/html/body/div[1]/div[2]/div/div/section[3]/div/div/div[1]/div/div/div/div/div/a/img"))).click();
	}
}
