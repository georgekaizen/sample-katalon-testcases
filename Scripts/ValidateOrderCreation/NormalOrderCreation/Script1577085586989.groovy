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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login Test Cases/Validate user can Successfully Login'), [('email') : 'admin', ('password') : 'SuP3r@dm!N'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/Icon_Sales'))

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/LinkMenu_Orders'))

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/DropdownMenu_DraftOrderPage'))

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/Button_Create'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('OrderCreationObjects/DropDown_OrderType'), 'Normal Order', false)

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/Dropdown_Agent'))

WebUI.click(findTestObject('OrderCreationObjects/Link_SearchButton'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('OrderCreationObjects/Input_AgentSearchbar'), Keys.chord('Gideon Arita(Tester) - +254725531578', 
        Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/Link_SearchResults'))

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/Inputfield_Customer'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OrderCreationObjects/Link_CustomerSearchMore'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('OrderCreationObjects/Inputfield_Customerdetails'), Keys.chord('+254706822697', Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/Searchresults_Click'))

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/Link_AddItem'))

WebUI.delay(2)

WebUI.click(findTestObject('OrderCreationObjects/Dropdown_ProductSelect'))

WebUI.click(findTestObject('OrderCreationObjects/Searchmore_Product'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('OrderCreationObjects/Inputsearcch_Product'), Keys.chord('KF263', Keys.ENTER))

WebUI.click(findTestObject('OrderCreationObjects/ProductsearchResults_Click'))

