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

WebUI.click(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/h1_Passionate about Progress'))

WebUI.rightClick(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/a_Sustainability'))

WebUI.rightClick(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/a_Sustainability'))

WebUI.click(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/div_Passionate about Progress              _00c665'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Passionate about Progress  PETRONAS Global/a_Sustainability'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/div_Tan Sri Tengku Muhammad Taufik_JmasterR_c7edd3'))

WebUI.rightClick(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/div_Tan Sri Tengku Muhammad Taufik_JmasterR_c7edd3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/div_Tan Sri Tengku Muhammad Taufik_JmasterR_c7edd3'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/p_Continued Value Creation'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/p_Continued Value Creation'), 
    'Continued Value Creation')

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/p_Safeguard the Environment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/p_Safeguard the Environment'), 
    'Safeguard the Environment')

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/p_Positive Social Impact'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/p_Positive Social Impact'), 
    'Positive Social Impact')

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/h2_Our Sustainability Activities'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/div_Our Sustainability Activities_JmasterRo_c9c5a2'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/button_Career Opportunities_splide__arrow s_b923e1'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/button_Career Opportunities_splide__arrow s_b923e1'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/span_Connect With Us'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/span_Connect With Us'), 'Connect With Us')

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/button_Career Opportunities_splide__arrow s_b923e1'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/h2_Governance and Ethics'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/h2_Governance and Ethics'), 
    'Governance and Ethics')

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/button_Career Opportunities_splide__arrow s_b923e1'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/h2_Career Opportunities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/h2_Career Opportunities'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/button_Career Opportunities_splide__arrow s_b923e1'))

WebUI.click(findTestObject('Object Repository/Page_Sustainability  PETRONAS Global/p_Subscribe Now'))

WebUI.click(findTestObject('Object Repository/Page_Connect With Us  PETRONAS Global/button_Governance and Ethics_splide__arrow _d88321'))

WebUI.click(findTestObject('Object Repository/Page_Connect With Us  PETRONAS Global/button_Governance and Ethics_splide__arrow _d88321'))

WebUI.click(findTestObject('Object Repository/Page_Connect With Us  PETRONAS Global/button_Governance and Ethics_splide__arrow _d88321'))

WebUI.click(findTestObject('Object Repository/Page_Connect With Us  PETRONAS Global/button_Governance and Ethics_splide__arrow _d88321'))

WebUI.click(findTestObject('Object Repository/Page_Connect With Us  PETRONAS Global/button_Governance and Ethics_splide__arrow _d88321'))

WebUI.click(findTestObject('Object Repository/Page_Connect With Us  PETRONAS Global/a_Our Passion'))

WebUI.click(findTestObject('Object Repository/Page_Our Passion  PETRONAS Global/div_Our Passion            Passionate about_7cc5bc'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Our Passion  PETRONAS Global/div_Our Passion            Passionate about_7cc5bc'))

WebUI.closeBrowser()

