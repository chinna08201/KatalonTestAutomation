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

Mobile.startApplication('bs://8ab8ec16b1b511581bed2480e3efcfceba18745d', true)

Mobile.tap(findTestObject('Object Repository/Mobile/Android/Liteapp/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Android/Liteapp/android.widget.TextView - Your phone is detected to be jailbroken or rooted, or you are running an emulator. Using the app is not allowed for security reasons'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile/Android/Liteapp/android.widget.Button - NEED HELP CHAT WITH US NOW'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/Mobile/Android/Liteapp/android.widget.EditText - Type a message'), 'Petronas')

Mobile.tap(findTestObject('Object Repository/Mobile/Android/Liteapp/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Android/Liteapp/android.widget.ImageButton'), 0)

Mobile.closeApplication()

