package com.basePack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static WebDriver driver;

	public static void browserLaunch(String data) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(data);

	}

	public static void readProps(String data) {

		File fle = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin\\Test_Data\\config.properties");
		try {

			FileReader fr = new FileReader(fle);
			Properties props = new Properties();
			props.load(fr);
			props.getProperty(data);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String readXL(int i, int j) {

		String value = null;

		try {
			File fle = new File("C:\\Users\\admin\\Desktop\\Share.xlsx");
			FileInputStream fis = new FileInputStream(fle);
			Workbook wb = new XSSFWorkbook();
			Sheet sheet = wb.getSheet("Test_data");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();

			if (cellType == 1) {

				value = cell.getStringCellValue();

			} else if (cellType == 0) {

				if (DateUtil.isCellDateFormatted(cell)) {

					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
					value = sdf.format(dateCellValue);
				} else {

					double numericCellValue = cell.getNumericCellValue();
					long lng = (long) numericCellValue;
					value = String.valueOf(lng);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	public static void sendValues(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void selectClass(WebElement element, String value) {

		Select slct = new Select(element);
		slct.selectByVisibleText(value);

	}

	public static String readProperTyFile(String data) {

		String value = null;

		try {
			
			File file = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin\\Test_Data\\config.properties");
			FileReader fr = new FileReader(file);
			Properties props = new Properties();
			props.load(fr);
			value = props.getProperty(data);
			
			System.out.println(value);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}

}