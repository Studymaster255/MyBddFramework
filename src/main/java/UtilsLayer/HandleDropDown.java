package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	/**
	 * To Select value from dropDown by the Index
	 * @param WebElement of dropdown
	 * 
	 */
	public void dropDownByIndex(WebElement wb,int index)
	{
		new Select(wb).selectByIndex(index);;
	}
	
	/**
	 * To Select value from dropDown by the visible Text
	 * @param WebElement of dropdown
	 * 
	 */
	public void dropDownByVisibleText(WebElement wb,String visibleText)
	{
		new Select(wb).selectByVisibleText(visibleText);;
	}
	/**
	 * To Select value from dropDown by the Value
	 * @param WebElement of dropdown
	 * 
	 */
	public void dropDownByValue(WebElement wb,String value)
	{
		new Select(wb).selectByValue(value);;
	}
	
	/**
	 * To get count of values from the dropdown
	 * @param WebElement of dropdown
	 * @return int
	 */
	public int countElementsFromDropDown(WebElement wb)
	{
		return new Select(wb).getAllSelectedOptions().size();
	}
	
	/**
	 * To get all elements for DropDown
	 * @param WebElement
	 * @return List<WebElement>
	 */
	public List<WebElement> getListOfAllElement(WebElement wb)
	{
		return new Select(wb).getAllSelectedOptions();	
	}

}
