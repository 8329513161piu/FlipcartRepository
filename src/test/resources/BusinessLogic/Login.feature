Feature: Login Functionality
Background: User is on Login Page
Given user open "webdriver.chrome.driver" browser with exe "E:\\Testing Support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"

Scenario: Login Functionality with valid credentials

Then click on Cancle Button
When user Navigate to Login
Then click on MyProfile
When user enter "8329513161" as username
When user enter "abc@123" as password
Then Click on Login
