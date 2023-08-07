import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/* Write a Katalon Studio test case to perform the following steps.
 * 1. Open browser to the URL stored in G_SiteURL
 * 2. Click the Our Passion link
 * 3. Close the browser
 * */
// Open browser to the URL stored in G_SiteURL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.petronas.com/')

WebUI.click(findTestObject('Page_Investor Relations  PETRONAS Global/button_PETRONAS Chemicals Group Berhad_spli_749532'))

// Click the Out Passion link
WebUI.click(findTestObject('nav-link nav-link--our-passion'))

// Close the browser
WebUI.closeBrowser()

