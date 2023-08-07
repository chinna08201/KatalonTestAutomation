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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.petronas.com/')

WebUI.click(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/button_Accept All Cookies'))

WebUI.delay(2)

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('HomePage')

WebUI.click(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/a_Facebook'))

WebUI.switchToWindowTitle('PETRONAS | Kuala Lumpur | Facebook')

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('PetronasFB_CheckWindow')

WebUI.click(findTestObject('Object Repository/Page_PETRONAS  Kuala Lumpur  Facebook/span_Connect with PETRONAS on Facebook'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_PETRONAS  Kuala Lumpur  Facebook/span_Connect with PETRONAS on Facebook'), 
    'Connect with PETRONAS on Facebook')

WebUI.switchToWindowIndex(0)

WebUI.takeFullPageScreenshotAsCheckpoint('Petronas')

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('Petronas Home')

WebUI.switchToWindowTitle('Passionate about Progress | PETRONAS Global')

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('Home')

WebUI.click(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/a_Instagram'))

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('Petronas Home')

WebUI.switchToWindowTitle('PETRONAS (@petronas) • Instagram photos and videos')

WebUI.click(findTestObject('Object Repository/Page_PETRONAS (petronas)  Instagram photos _48e11c/div_PETRONASA Progressive Energy and Soluti_9b361d'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/a_Twitter'))

WebUI.click(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/a_TikTok'))

WebUI.click(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/a_LinkedIn'))

WebUI.switchToWindowTitle('PETRONAS | LinkedIn')

WebUI.click(findTestObject('Object Repository/Page_PETRONAS  LinkedIn/h2_Sign in to see who you already know at PETRONAS'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_PETRONAS  LinkedIn/h2_Sign in to see who you already know at PETRONAS'), 
    'Sign in to see who you already know at PETRONAS')

WebUI.switchToWindowIndex(0)

WebUI.closeBrowser()

