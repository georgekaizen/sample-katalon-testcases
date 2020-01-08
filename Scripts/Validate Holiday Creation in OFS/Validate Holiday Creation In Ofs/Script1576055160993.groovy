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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.ofsurl)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Validate Holiday creation Ofs/Input_OfsUsername'), username)

WebUI.setText(findTestObject('Validate Holiday creation Ofs/Input_OfsPassword'), password)

WebUI.click(findTestObject('Validate Holiday creation Ofs/Button_OfsLogin'))

WebUI.click(findTestObject('Validate Holiday creation Ofs/Link_Orderfulfillment'))

WebUI.click(findTestObject('Validate Holiday creation Ofs/LinkMenu_DeliveryHolidays'))

WebUI.click(findTestObject('Validate Holiday creation Ofs/Button_CreateDeliveryHoliday'))

WebUI.delay(1)

WebUI.click(findTestObject('Validate Holiday creation Ofs/Input holiday name'))

WebUI.sendKeys(findTestObject('Validate Holiday creation Ofs/Input holiday name'), 'jamhuri')

WebUI.delay(1)

WebUI.click(findTestObject('Validate Holiday creation Ofs/pop-up calendar'))

CustomKeywords.'com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword.setDate'(findTestObject('Validate Holiday creation Ofs/Button_DatePicker'), 
    25, 12, 2019, 1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Validate Holiday creation Ofs/Button_DatePicker'))

WebUI.click(findTestObject('Validate Holiday creation Ofs/Button_Save'))

