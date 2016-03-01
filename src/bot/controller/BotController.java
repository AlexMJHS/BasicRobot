package bot.controller;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;
import bot.model.EV3Bot;

/**
 * @author Alejandro Magallanes
 *@version 0.1 Dec 16, 2015
 */
public class BotController
{
	
	private String message;
	private int xPosition, yPosition;
	private long waitTime;
	
	private EV3Bot sillyBot;
	
	public BotController()
	{
		this.xPosition = 50;
		this.yPosition = 100;
		this.waitTime = 4000;
		this.message = "Something about a robot";
		
		sillyBot = new EV3Bot();
	}
	
	public void start()
	{
		LCD.drawString(message,  xPosition, yPosition);
		Delay.msDelay(waitTime);
		sillyBot.driveRoom();
	}

	public int getxPosition()
	{
		return xPosition;
	}

	public void setxPosition(int xPosition)
	{
		this.xPosition = xPosition;
	}

	public int getyPosition()
	{
		return yPosition;
	}

	public void setyPosition(int yPosition)
	{
		this.yPosition = yPosition;
	}

	public long getWaitTime()
	{
		return waitTime;
	}

	public void setWaitTime(long waitTime)
	{
		this.waitTime = waitTime;
	}
}
